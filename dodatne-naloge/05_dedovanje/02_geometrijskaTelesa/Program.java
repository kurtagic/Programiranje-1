import java.util.*;

public class Program {
	
	public static final int KVADER = 1;
	public static final int KOCKA = 2;
	public static final int KROGLA = 3;
	public static final String LOCILO = "======";
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine(); // read empty line
		String[] vhodi = new String[n];
		
		for(int i = 0; i < vhodi.length; i++) {
			vhodi[i] = sc.nextLine();
		}
		
		manageBodies(vhodi);
	}
	
	private static void manageBodies(String[] vhodi) {
		int[][] entries = formatEntries(vhodi);
		GeometrijskoTelo[] bodies = createBodies(entries);
		sortByVolume(bodies);
		
		for(GeometrijskoTelo body : bodies) {
			body.izpisi();
			if(!(body instanceof Krogla)) {
			
				Kvader kvader = (Kvader) body;
				kvader.narisi();
			}
			System.out.println(LOCILO);
		}
		
		// for(int[] entry : entries) {
			// GeometrijskoTelo geoTelo = createBody(entry);
			// geoTelo.izpisi();
			// if(geoTelo instanceof Krogla) continue;
			
			// Kvader kvader = (Kvader) geoTelo;
			// kvader.narisi();
			
			// System.out.println(LOCILO);
		// }
	}
	
	private static void sortByVolume(GeometrijskoTelo[] bodies) {
	   Map<GeometrijskoTelo, Integer> volumes = new HashMap<>();
    
		for (GeometrijskoTelo body : bodies) {
			volumes.put(body, body.getVolume());
		}

		// Now you can sort your array based on the volumes
		 Arrays.sort(bodies, Comparator.comparingInt(volumes::get).reversed());	
	}
	
	private static int[][] formatEntries(String[] vhodi) {		
		int[][] output = new int[vhodi.length][];
		
		for(int i = 0; i < vhodi.length; i++) {
			String[] values = vhodi[i].split(" ");
			int bodyType = Integer.parseInt(values[0]);
			
			if(bodyType == KROGLA) {
				int premer = Integer.parseInt(values[1]);
				output[i] = new int[]{bodyType, premer};
				continue;
			}
			
			if(bodyType == KOCKA) {
				int s = Integer.parseInt(values[1]);
				output[i] = new int[]{bodyType, s};
				continue;
			}
			
			if(bodyType == KVADER) {
				int a = Integer.parseInt(values[1]);
				int b = Integer.parseInt(values[2]);
				int c = Integer.parseInt(values[3]);
				output[i] = new int[]{bodyType, a, b, c};
				continue;
			}
		}
		
		return output;
	}
	
	private static GeometrijskoTelo[] createBodies(int[][] entries) {
		GeometrijskoTelo[] bodies = new GeometrijskoTelo[entries.length];
			
		for(int i = 0; i < entries.length; i++) {
			bodies[i] = createBody(entries[i]);
		}
		
		return bodies;
	}
	
	private static GeometrijskoTelo createBody(int[] entry) {
		int bodyType = Integer.valueOf(entry[0]);
		
		if(bodyType == KVADER) {
			int a = Integer.valueOf(entry[1]);
			int b = Integer.valueOf(entry[2]);
			int c = Integer.valueOf(entry[3]);
			return new Kvader(a, b, c);
		}
		if(bodyType == KOCKA) {
			int s = Integer.valueOf(entry[1]);
			return new Kocka(s);
		}
		
		if(bodyType == KROGLA) {
			int premer = Integer.valueOf(entry[1]);
			return new Krogla(premer);
		}
		
		return null;
	}
}