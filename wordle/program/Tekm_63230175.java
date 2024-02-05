import java.util.*;
import java.util.stream.Collectors;
public class Tekm_63230175 implements Stroj 
{
	public static final int DOLZINA_BESED = 6;
	public static final char ODZIV_ZADETEK = '+';
	public static final char ODZIV_PRAVILNA_CRKA_SLAB_INDEX = 'o';
	public static final char ODZIV_SLABA_CRKA = '-';
    
	private Set<String> izhodiscniSlovar; // celoten slovar (15000+ besed)
	private Set<String> zmanjsaniSlovar; // slovar, ki je po vsakem "zadetku" zmanjsan za to besedo (ista besede ne bo nastopila dvakrat (upamo))
	private Set<String> slovar; // trenutni slovar, ki se na zacetku vsakega poskusa nastavi na kopijo zmanjsanegaSlovarja
	
	private String zadnjaIzbira;
	
	private Set<Character> uporabljeneCrke;
	private boolean jeDovoljCrkZaBesedo;
	
	public static final int STEVILO_MOZNIH_ODZIVOV = 729;
	public static final String[] MOZNI_ODZIVI = {"++++++","+++++-","+++++o","++++-+","++++--","++++-o","++++o+","++++o-","++++oo","+++-++","+++-+-","+++-+o","+++--+","+++---","+++--o","+++-o+","+++-o-","+++-oo","+++o++","+++o+-","+++o+o","+++o-+","+++o--","+++o-o","+++oo+","+++oo-","+++ooo","++-+++","++-++-","++-++o","++-+-+","++-+--","++-+-o","++-+o+","++-+o-","++-+oo","++--++","++--+-","++--+o","++---+","++----","++---o","++--o+","++--o-","++--oo","++-o++","++-o+-","++-o+o","++-o-+","++-o--","++-o-o","++-oo+","++-oo-","++-ooo","++o+++","++o++-","++o++o","++o+-+","++o+--","++o+-o","++o+o+","++o+o-","++o+oo","++o-++","++o-+-","++o-+o","++o--+","++o---","++o--o","++o-o+","++o-o-","++o-oo","++oo++","++oo+-","++oo+o","++oo-+","++oo--","++oo-o","++ooo+","++ooo-","++oooo","+-++++","+-+++-","+-+++o","+-++-+","+-++--","+-++-o","+-++o+","+-++o-","+-++oo","+-+-++","+-+-+-","+-+-+o","+-+--+","+-+---","+-+--o","+-+-o+","+-+-o-","+-+-oo","+-+o++","+-+o+-","+-+o+o","+-+o-+","+-+o--","+-+o-o","+-+oo+","+-+oo-","+-+ooo","+--+++","+--++-","+--++o","+--+-+","+--+--","+--+-o","+--+o+","+--+o-","+--+oo","+---++","+---+-","+---+o","+----+","+-----","+----o","+---o+","+---o-","+---oo","+--o++","+--o+-","+--o+o","+--o-+","+--o--","+--o-o","+--oo+","+--oo-","+--ooo","+-o+++","+-o++-","+-o++o","+-o+-+","+-o+--","+-o+-o","+-o+o+","+-o+o-","+-o+oo","+-o-++","+-o-+-","+-o-+o","+-o--+","+-o---","+-o--o","+-o-o+","+-o-o-","+-o-oo","+-oo++","+-oo+-","+-oo+o","+-oo-+","+-oo--","+-oo-o","+-ooo+","+-ooo-","+-oooo","+o++++","+o+++-","+o+++o","+o++-+","+o++--","+o++-o","+o++o+","+o++o-","+o++oo","+o+-++","+o+-+-","+o+-+o","+o+--+","+o+---","+o+--o","+o+-o+","+o+-o-","+o+-oo","+o+o++","+o+o+-","+o+o+o","+o+o-+","+o+o--","+o+o-o","+o+oo+","+o+oo-","+o+ooo","+o-+++","+o-++-","+o-++o","+o-+-+","+o-+--","+o-+-o","+o-+o+","+o-+o-","+o-+oo","+o--++","+o--+-","+o--+o","+o---+","+o----","+o---o","+o--o+","+o--o-","+o--oo","+o-o++","+o-o+-","+o-o+o","+o-o-+","+o-o--","+o-o-o","+o-oo+","+o-oo-","+o-ooo","+oo+++","+oo++-","+oo++o","+oo+-+","+oo+--","+oo+-o","+oo+o+","+oo+o-","+oo+oo","+oo-++","+oo-+-","+oo-+o","+oo--+","+oo---","+oo--o","+oo-o+","+oo-o-","+oo-oo","+ooo++","+ooo+-","+ooo+o","+ooo-+","+ooo--","+ooo-o","+oooo+","+oooo-","+ooooo","-+++++","-++++-","-++++o","-+++-+","-+++--","-+++-o","-+++o+","-+++o-","-+++oo","-++-++","-++-+-","-++-+o","-++--+","-++---","-++--o","-++-o+","-++-o-","-++-oo","-++o++","-++o+-","-++o+o","-++o-+","-++o--","-++o-o","-++oo+","-++oo-","-++ooo","-+-+++","-+-++-","-+-++o","-+-+-+","-+-+--","-+-+-o","-+-+o+","-+-+o-","-+-+oo","-+--++","-+--+-","-+--+o","-+---+","-+----","-+---o","-+--o+","-+--o-","-+--oo","-+-o++","-+-o+-","-+-o+o","-+-o-+","-+-o--","-+-o-o","-+-oo+","-+-oo-","-+-ooo","-+o+++","-+o++-","-+o++o","-+o+-+","-+o+--","-+o+-o","-+o+o+","-+o+o-","-+o+oo","-+o-++","-+o-+-","-+o-+o","-+o--+","-+o---","-+o--o","-+o-o+","-+o-o-","-+o-oo","-+oo++","-+oo+-","-+oo+o","-+oo-+","-+oo--","-+oo-o","-+ooo+","-+ooo-","-+oooo","--++++","--+++-","--+++o","--++-+","--++--","--++-o","--++o+","--++o-","--++oo","--+-++","--+-+-","--+-+o","--+--+","--+---","--+--o","--+-o+","--+-o-","--+-oo","--+o++","--+o+-","--+o+o","--+o-+","--+o--","--+o-o","--+oo+","--+oo-","--+ooo","---+++","---++-","---++o","---+-+","---+--","---+-o","---+o+","---+o-","---+oo","----++","----+-","----+o","-----+","------","-----o","----o+","----o-","----oo","---o++","---o+-","---o+o","---o-+","---o--","---o-o","---oo+","---oo-","---ooo","--o+++","--o++-","--o++o","--o+-+","--o+--","--o+-o","--o+o+","--o+o-","--o+oo","--o-++","--o-+-","--o-+o","--o--+","--o---","--o--o","--o-o+","--o-o-","--o-oo","--oo++","--oo+-","--oo+o","--oo-+","--oo--","--oo-o","--ooo+","--ooo-","--oooo","-o++++","-o+++-","-o+++o","-o++-+","-o++--","-o++-o","-o++o+","-o++o-","-o++oo","-o+-++","-o+-+-","-o+-+o","-o+--+","-o+---","-o+--o","-o+-o+","-o+-o-","-o+-oo","-o+o++","-o+o+-","-o+o+o","-o+o-+","-o+o--","-o+o-o","-o+oo+","-o+oo-","-o+ooo","-o-+++","-o-++-","-o-++o","-o-+-+","-o-+--","-o-+-o","-o-+o+","-o-+o-","-o-+oo","-o--++","-o--+-","-o--+o","-o---+","-o----","-o---o","-o--o+","-o--o-","-o--oo","-o-o++","-o-o+-","-o-o+o","-o-o-+","-o-o--","-o-o-o","-o-oo+","-o-oo-","-o-ooo","-oo+++","-oo++-","-oo++o","-oo+-+","-oo+--","-oo+-o","-oo+o+","-oo+o-","-oo+oo","-oo-++","-oo-+-","-oo-+o","-oo--+","-oo---","-oo--o","-oo-o+","-oo-o-","-oo-oo","-ooo++","-ooo+-","-ooo+o","-ooo-+","-ooo--","-ooo-o","-oooo+","-oooo-","-ooooo","o+++++","o++++-","o++++o","o+++-+","o+++--","o+++-o","o+++o+","o+++o-","o+++oo","o++-++","o++-+-","o++-+o","o++--+","o++---","o++--o","o++-o+","o++-o-","o++-oo","o++o++","o++o+-","o++o+o","o++o-+","o++o--","o++o-o","o++oo+","o++oo-","o++ooo","o+-+++","o+-++-","o+-++o","o+-+-+","o+-+--","o+-+-o","o+-+o+","o+-+o-","o+-+oo","o+--++","o+--+-","o+--+o","o+---+","o+----","o+---o","o+--o+","o+--o-","o+--oo","o+-o++","o+-o+-","o+-o+o","o+-o-+","o+-o--","o+-o-o","o+-oo+","o+-oo-","o+-ooo","o+o+++","o+o++-","o+o++o","o+o+-+","o+o+--","o+o+-o","o+o+o+","o+o+o-","o+o+oo","o+o-++","o+o-+-","o+o-+o","o+o--+","o+o---","o+o--o","o+o-o+","o+o-o-","o+o-oo","o+oo++","o+oo+-","o+oo+o","o+oo-+","o+oo--","o+oo-o","o+ooo+","o+ooo-","o+oooo","o-++++","o-+++-","o-+++o","o-++-+","o-++--","o-++-o","o-++o+","o-++o-","o-++oo","o-+-++","o-+-+-","o-+-+o","o-+--+","o-+---","o-+--o","o-+-o+","o-+-o-","o-+-oo","o-+o++","o-+o+-","o-+o+o","o-+o-+","o-+o--","o-+o-o","o-+oo+","o-+oo-","o-+ooo","o--+++","o--++-","o--++o","o--+-+","o--+--","o--+-o","o--+o+","o--+o-","o--+oo","o---++","o---+-","o---+o","o----+","o-----","o----o","o---o+","o---o-","o---oo","o--o++","o--o+-","o--o+o","o--o-+","o--o--","o--o-o","o--oo+","o--oo-","o--ooo","o-o+++","o-o++-","o-o++o","o-o+-+","o-o+--","o-o+-o","o-o+o+","o-o+o-","o-o+oo","o-o-++","o-o-+-","o-o-+o","o-o--+","o-o---","o-o--o","o-o-o+","o-o-o-","o-o-oo","o-oo++","o-oo+-","o-oo+o","o-oo-+","o-oo--","o-oo-o","o-ooo+","o-ooo-","o-oooo","oo++++","oo+++-","oo+++o","oo++-+","oo++--","oo++-o","oo++o+","oo++o-","oo++oo","oo+-++","oo+-+-","oo+-+o","oo+--+","oo+---","oo+--o","oo+-o+","oo+-o-","oo+-oo","oo+o++","oo+o+-","oo+o+o","oo+o-+","oo+o--","oo+o-o","oo+oo+","oo+oo-","oo+ooo","oo-+++","oo-++-","oo-++o","oo-+-+","oo-+--","oo-+-o","oo-+o+","oo-+o-","oo-+oo","oo--++","oo--+-","oo--+o","oo---+","oo----","oo---o","oo--o+","oo--o-","oo--oo","oo-o++","oo-o+-","oo-o+o","oo-o-+","oo-o--","oo-o-o","oo-oo+","oo-oo-","oo-ooo","ooo+++","ooo++-","ooo++o","ooo+-+","ooo+--","ooo+-o","ooo+o+","ooo+o-","ooo+oo","ooo-++","ooo-+-","ooo-+o","ooo--+","ooo---","ooo--o","ooo-o+","ooo-o-","ooo-oo","oooo++","oooo+-","oooo+o","oooo-+","oooo--","oooo-o","ooooo+","ooooo-","oooooo"};

    @Override
    public void inicializiraj(Set<String> dictionary)
	{
        this.izhodiscniSlovar = new TreeSet<>(dictionary);
		this.zmanjsaniSlovar = new TreeSet<>(dictionary);
    }
	
	// ce je odziv == null pomeni da se ni dobil poskusa (beri: prvi poskus),
	// ce je return == null pomeni da je ugibanja besede konec (beri: prejsni poskus je bil pravilen)
	
    @Override
    public String poteza(List<Character> odziv) 
	{
		// prvi poskus, nastavi zacetno stanje
        if (odziv == null)
		{
			setStartState();		
			return this.zadnjaIzbira = getOutput();
        }

		// zadetek!, zmanjsaj slovar moznih besed pa naprej...
		if (vseEnako(odziv, ODZIV_ZADETEK))
		{ 
			zmanjsaniSlovar.remove(this.zadnjaIzbira);
			return null;
		}
		
		// besede se nismo uganili, mnozica moznosti pa prazna!
		// beseda, ki smo je ze uganili se je ponovno pojavila 
		// (to je nepricakovano, take the hit pa zaden besedo iz izhodiscninega slovarja)
		if (this.slovar.isEmpty())
		{
			this.slovar = new TreeSet<>(this.izhodiscniSlovar);
			// throw new RuntimeException("Nekaj močno smrdi... in to po gnilem!");
		}
		
		// konfiguriraj za naslednji poskus
		this.slovar.removeAll(getIncompatableWords(odziv));
	
		// System.out.println(this.slovar.size());
	
		// zadnjo besedo imamo garantirano prav, predzadnjo pa 50/50
		if(this.slovar.size() < 3) return this.zadnjaIzbira = this.slovar.iterator().next();
	
		return this.zadnjaIzbira = getOutput();
    }
	
	private void setStartState() 
	{
		this.slovar = new TreeSet<>(this.zmanjsaniSlovar);
		
		this.uporabljeneCrke = new HashSet<>();
		this.jeDovoljCrkZaBesedo = true;
	}
	
	private String getOutput() 
	{
		if(!jeDovoljCrkZaBesedo) return najdiNajboljsoBesedo();
		
		// poglej pogososti vseh crk
		Map<Character, Integer> crkePogososti = getUnsuedLettersFrequencies();
		
		// razvrsti crke po pogostosti
		List<Character> vseCrke = getSortedLetters(crkePogososti);
		
		// preostalih neuporabljenih crk je manj kot je dolzina besede -> predvidevamo majhen nabor preostalih besed,
		// zato probaj najbojso besedo (micro optimizicija)
		if((vseCrke.size() < DOLZINA_BESED && this.slovar.size() < 4) || vseCrke.size() < 2)  
		{
			
			jeDovoljCrkZaBesedo = false;
			return najdiNajboljsoBesedo();
		}
		if(vseCrke.size() < DOLZINA_BESED)
		{
			List<Character> crkeBeseda = new ArrayList<>();
			for(int i = 0; i < vseCrke.size(); i++) 
			{
				Character crka = vseCrke.get(i);
				crkeBeseda.add(crka);
				uporabljeneCrke.add(crka);
			}
			
			char[] crkeBesede = new char[DOLZINA_BESED];
			for(int i = 0; i < vseCrke.size(); i++)
			{
				crkeBesede[i] = crkeBeseda.get(i);
			}
			
			for(int i = 0; i < DOLZINA_BESED; i++) 
			{
				if(crkeBesede[i] != '\0') continue;
				crkeBesede[i] = 'z';
			}
			return new String(crkeBesede);
		}
		
		// uporabi najbolj pogoste ne uporabljene crke v preostalih besedah
		List<Character> crkeBeseda = new ArrayList<>();
		for(int i = 0; i < DOLZINA_BESED; i++) 
		{
			Character crka = vseCrke.get(i);
			crkeBeseda.add(crka);
			uporabljeneCrke.add(crka);
		}
		
		char[] crkeBesede = placeOnBestIndex(crkeBeseda);
		
		return new String(crkeBesede);
	}
	
	private String najdiNajboljsoBesedo() 
	{	
		String najBeseda = "";
		double najAvg = 0;
		for(String beseda : this.slovar) 
		{
			int[] odstranjenjeBesede = new int[STEVILO_MOZNIH_ODZIVOV];
			for(int i = 0; i < STEVILO_MOZNIH_ODZIVOV; i++) 
			{
				String mozenOdziv = MOZNI_ODZIVI[i];
				List<Character> odziv = new ArrayList<>();
				for (char c : mozenOdziv.toCharArray()) 
				{ 
					odziv.add(c); 
				}
				
				odstranjenjeBesede[i] = odstraniBesede(beseda, odziv).size();
			}
			
			int sum = 0;
			for(int besede : odstranjenjeBesede) 
			{
				sum += besede;
			}
			
			double averagePreostaleBesede = (double) sum / STEVILO_MOZNIH_ODZIVOV;
			
			if(averagePreostaleBesede > najAvg)
			{
				najBeseda = beseda;
				najAvg = averagePreostaleBesede;
			}
		}
		
		return najBeseda;
	}
	
		private Set<String> odstraniBesede(String izbira, List<Character> odziv) 
	{
		Set<String> set = new TreeSet<>();
		for (String beseda : this.slovar) 
		{
			if (!jeZdruzljiva(beseda, izbira, odziv)) set.add(beseda);
		}
		return set;
	}
	
	//
	// UTIL METHODS
	//
	
	private Map<Character, Integer> getUnsuedLettersFrequencies() 
	{
		Map<Character, Integer> map = new HashMap<>();
		
		for (String beseda : this.slovar) 
		{			
            for (char crka : beseda.toCharArray()) 
			{	
				if(uporabljeneCrke.contains(crka)) continue;
				map.put(crka, map.getOrDefault(crka, 0) + 1);
            }
        }
		
		return map;
	}
	
	private	List<Character> getSortedLetters(Map<Character, Integer> map)
	{
		// ustvari list vseh crk in pogostosti
		List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
		
		// sortiraj po velikosti (padajoci vrstni red)
		Collections.sort(entryList, Collections.reverseOrder(Map.Entry.comparingByValue()));
		
		List<Character> list = new ArrayList<>();
		
		// vzemi crke po vrsti
		for(Map.Entry<Character, Integer> entry : entryList) 
		{
			list.add(entry.getKey());
		}
		
		return list;
	}
	
	private Set<String> getIncompatableWords(List<Character> odziv) 
	{
		Set<String> set = new TreeSet<>();
		for (String beseda : this.slovar) 
		{
			if (!jeZdruzljiva(beseda, this.zadnjaIzbira, odziv)) set.add(beseda);
		}
		
		return set;
	}
	
	private char[] placeOnBestIndex(List<Character> crke)
	{				
		List<Character> preostaleCrke = new ArrayList<>(crke);
		char[] postavljeneCrke = new char[DOLZINA_BESED];
		
		for(int i = 0; i < DOLZINA_BESED; i++) 
		{	 
			Map<Character, Integer> map = getLettersFrequency(this.slovar, preostaleCrke, i);	
			
			List<Character> sorted = getSortedLetters(map);
			
			// na tem indexu se nobena od najbolj pogostih crk ne pojavi
			if(sorted.isEmpty()) continue;
			
			char crka = sorted.get(0);
			postavljeneCrke[i] = crka;
			
			preostaleCrke.remove(preostaleCrke.indexOf(crka));
        }
		
		// vse crke smo postavili
		if(preostaleCrke.isEmpty()) return postavljeneCrke;
		
		// ce nismo vseh crk postavili,
		// preostale crke postavi na ostala prosta mesta (st. prostih mest = st. preostalih crk)
		for(int i = 0; i < DOLZINA_BESED; i++) 
		{			
			if (postavljeneCrke[i] == '\0') postavljeneCrke[i] = preostaleCrke.remove(0);
		}
		
		return postavljeneCrke;
	}
	
	private Map<Character, Integer> getLettersFrequency(Set<String> dictionary, List<Character> filter, int index) 
	{
		Map<Character, Integer> map = new HashMap<>();	
		for (String beseda : dictionary) 
		{
			char crka = beseda.charAt(index);
			if(!filter.contains(crka)) continue;
			map.put(crka, map.getOrDefault(crka, 0) + 1);
		}
		
		return map;
	}
	
	// spodnja koda je iz primera implementacije, razred Tekm_12345678,
	// samo util metode
	
	private boolean zaIzlociti(int index, List<Character> odziv) 
	{
		return !odziv.get(index).equals('+');
	}
	
    private static <T> boolean vseEnako(List<T> seznam, T element) 
	{
        return seznam.stream().allMatch(e -> e.equals(element));
    }

    private static boolean jeZdruzljiva(String beseda, String izbira, List<Character> odziv) 
	{
        List<Character> crkeBesede = new ArrayList<>();
        List<Character> crkeIzbire = new ArrayList<>();
		
        for (int i = 0; i < DOLZINA_BESED; i++) 
		{
            crkeBesede.add(beseda.charAt(i));
            crkeIzbire.add(izbira.charAt(i));
        }
		
		 // Preverimo, ali za vse i-je, pri katerih je odziv[i] == '+',
        // velja beseda[i] == izbira[i].
        for (int i = 0; i < DOLZINA_BESED; i++) 
		{
            if (odziv.get(i) != ODZIV_ZADETEK) continue;
            if (crkeBesede.get(i) != crkeIzbire.get(i)) return false;
			crkeBesede.set(i, '#');
			crkeIzbire.set(i, '_');
        }
		
		// Preverimo, ali za vse i-je, pri katerih je odziv[i] == 'o',
        // velja, da <beseda> vsebuje črko izbira[i], a ne na indeksu <i>.
        // Vsako tako črko beseda <izbira> je treba povezati z eno samo črko
        // besede <beseda>.
		
        for (int i = 0; i < DOLZINA_BESED; i++) 
		{
            if (odziv.get(i) != ODZIV_PRAVILNA_CRKA_SLAB_INDEX) continue;
			
			char crka = crkeIzbire.get(i);
			int ixBeseda = crkeBesede.indexOf(crka);
			
			if (ixBeseda < 0 || crkeBesede.get(i) == crka) return false;
			crkeBesede.set(ixBeseda, '#');
			crkeIzbire.set(i, '_');
        }
		
        for (int i = 0; i < DOLZINA_BESED; i++) 
		{
            if (odziv.get(i) != ODZIV_SLABA_CRKA) continue;
			
			if(crkeBesede.indexOf(crkeIzbire.get(i)) >= 0) return false;
        }
		
        return true;
    }
}