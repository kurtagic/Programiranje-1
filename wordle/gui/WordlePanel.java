/**
 *
 *  [WordlePanel]: glavna plosca za izris objektov igre.
 *
 */
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.GraphicsEnvironment;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import java.util.Random;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

import java.util.Set;
import java.util.HashSet;


public class WordlePanel extends JPanel {
	
	/** constructors */
	
	public WordlePanel(int dolzinaBesede, int stPoskusov, List<String> slovar, String lang, boolean hardMode, TileShape tileShape) {
		this(dolzinaBesede, stPoskusov, slovar, lang, hardMode, tileShape, null, null);
	}	
	
	public WordlePanel(int dolzinaBesede, int stPoskusov, List<String> slovar, String lang, boolean hardMode, TileShape tileShape, String imeStroja, Stroj stroj) {
		
		this.dolzinaBesede = dolzinaBesede;
		this.steviloPoskusov = stPoskusov;
		this.slovar = slovar;
		this.ixLang = 0;
		this.hardMode = hardMode;
		this.tileShape = tileShape;
		this.imeStroja = imeStroja;
		this.stroj = stroj;
		this.darkModeActive = false;
		this.highContrastModeActive = false;
		
		// 1 - barve in random generator
		this.random = new Random();
		this.barvaPovrsine = Color.WHITE;
		this.barvaIgralnePlosce = Color.WHITE;
		
		if (this.hardMode)
			this.barvaPovrsine = WordlePanel.WHITE_SMOKE;
		this.barvaRoba = WordlePanel.HIMALAYA_PEAKS;
		this.settingsColor = WordlePanel.HIMALAYA_PEAKS;
		
		// 2 - uvoz zeljenega fonta in kreiranje 2D tabele ploscic <tiles>
		int stVrstic = this.steviloPoskusov;
		int stStolpcev = this.dolzinaBesede;
		String tipografija = getPreferredFont();
		this.tiles = WordlePanel.createTiles(stVrstic, stStolpcev, tipografija, this.tileShape, this.darkModeActive, this.highContrastModeActive);
		
		// 3 - status igre; status animacije
		this.gameStatus = GameStatus.IN_PROGRESS;
		this.flipAnimationInProgress = false;
		// 4 - registriraj poslusalce [keys]
		this.registerKeyListeners();
		
		// 5 - start game topics
		this.selectedWord = WordlePanel.chooseNewWord(this.slovar, random);
		this.ixStolpec = 0;
		this.ixVrstica = 0;
		
		// System.out.printf("[ %s ]%n", this.selectedWord);

		// 6 - kreiranje statusne plosce za izpis sporocil
		this.statusPane = new StatusPane("", tipografija, this.darkModeActive, this);

		// 7 - hints for the previous attempt
		//     [Hints], which chars were: misplaced (0), correct (1) or absent (2)
		this.maskaPrev = new int[this.dolzinaBesede];
		WordlePanel.clearHints(this.maskaPrev);
		
		// 8 - pannel for 'SETTINGS'
		this.setLayout(null);
		this.settingsSquare = null;
		this.settingsPanel = null;
		this.settingsWidth = WordlePanel.SETTINGS_PANEL_WIDTH;
		this.settingsHeight = WordlePanel.SETTINGS_PANEL_HEIGHT;
	}
	
	/** 
	 * -- staticne metode -- 
	 */

	private static String chooseNewWord(List<String> seznamBesed, Random random) {
		int ixBeseda = (int)(Math.random() * seznamBesed.size());
		return seznamBesed.get(ixBeseda);
	}
	
	private static void clearHints(int[] hints) {
		// inicializacija maske namigov (hints)
		for (int i = 0; i < hints.length; i++)
			hints[i] = Hint.MISPLACED.getValue();
	}
		
	/** tile[i][j] <- kreiramo ploscke za crke v zacetni postavitvi (brez napisa) */
	
	private static String getPreferredFont() {
		String[] wordleFontFamily = { "Arial", "Helvetica Neue", "SansSerif" };
		
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] installedFonts = env.getAvailableFontFamilyNames();
		String selectedFont = "SansSerif";
		int i = 0;
		outer:
		for (String installedFont : installedFonts) {
			for (String wordleFont : wordleFontFamily) {
				if (wordleFont.equals(installedFont)) {
					selectedFont = wordleFont;
					break outer;
				}
			}
		}
		return selectedFont;
	}
	
	/** 
	 * Kreiranje tabele ploscic in kreiranje objektov ploscic <Tile>.
	 *
	 * @stVrstic, @stStolpcev stevilo vrstic in stolpcev
	 * @fontCrk font, uporabljen na ploscicah
	 * @return dvodimenzionalno tabelo ploscic
	 */

	private static Tile[][] createTiles(int stVrstic, int stStolpcev, String fontCrk, TileShape shape, boolean darkMode, boolean highContrastMode) {
		Tile[][] tiles = new Tile[stVrstic][stStolpcev];
		for (int i = 0; i < tiles.length; i++) {
			for (int j = 0; j < tiles[i].length; j++) {
				char oznaka = ' ';
				tiles[i][j] = new Tile(oznaka, i, j, fontCrk, shape, darkMode, highContrastMode);
			}
		} 
		return tiles;
	}
	
	/** 
	 * Preveri, ce je komponenta dodana na platno.
	 *
	 * @panel 		panel, v katerem preverjamo prisotnost komponente
	 * @component 	komponenta, za katero preverjamo, ali je v containerju panela
	 * @return 		true / false
	 */
	
	private static boolean containsComponent(JPanel panel, Component component) {
		if (component == null)
			return false;
		return Arrays.asList(panel.getComponents()).contains(component);
	}	
	
	/**
	 *  Metoda za izris risalne plosce na zaslon
	 */
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	
		// 1 - velikost risalne plosce
		int panelWidth = getWidth();
		int panelHeight = getHeight();

		int sirinaPlosce = panelHeight;
		int visinaPlosce = panelHeight;
		if (panelWidth < panelHeight) {
			sirinaPlosce = panelWidth;
			visinaPlosce = panelWidth;
		}
		int robIgralnePovrsine = WordlePanel.SURFACE_BORDER_WIDTH;
	
		// 2 - velikost ploscice <Tile>
		int wIgralnePlosce = (sirinaPlosce - 2 * robIgralnePovrsine);
		int hIgralnePlosce = (visinaPlosce - 2 * robIgralnePovrsine);			
		double paddingX = 0.005 * wIgralnePlosce;
		double paddingY = 0.005 * hIgralnePlosce;
		this.tileWidth = ri((wIgralnePlosce - paddingX * (this.dolzinaBesede - 1)) / this.dolzinaBesede);
		this.tileHeight = ri((hIgralnePlosce - paddingY * (this.steviloPoskusov - 1)) / this.steviloPoskusov);
		// System.out.printf("W: %d, H: %d; %d x %d%n", tileWidth, tileHeight, sirinaPlosce, visinaPlosce );
	
		this.padding = (paddingX < paddingY) ? paddingX : paddingY;
		if (tileWidth > tileHeight)
			tileWidth = tileHeight;
		else
			tileHeight = tileWidth;
		
		// 3 - izris igralne povrsine in izris vseh [n x m] ploscic
		Point xy = this.narisiIgralnoPovrsino(g2, tileWidth, tileHeight, padding);
		this.drawTiles(g2, xy.getX(), xy.getY(), tileWidth, tileHeight, padding);
		// 62 x 62  | 413 x 413
		// 263, 15: 310 (5) + 
		
		// 4 - izris statusne plosce
		double statusPaneWidth = 1.5 * this.tileWidth;
		double statusPaneHeight = 0.75 * this.tileHeight;
		int xStatus = ri((getWidth() - statusPaneWidth) / 2);
		int yStatus = ri(xy.getY() - 0.1 * this.tileHeight);		
		this.statusPane.paintComponent(g2, new Point(xStatus, yStatus), statusPaneWidth, statusPaneHeight);
		
		// 5 - narisi zobnik - actuator for panel 'SETTINGS'
		int wZobnik = 30;
		int wNavoj = 12;
		int xZobnik = 15;
		int yZobnik = panelHeight - robIgralnePovrsine - wZobnik;
		narisiZobnik(g2, xZobnik, yZobnik, wZobnik, wNavoj);
	}
	
	/** 
	 * Risanje zobnika v spodnjem levem kotu za priklic plosce 'SETTINGS'.
	 */	
	
	private void narisiZobnik(Graphics2D g2, int xZobnik, int yZobnik, int wZobnik, int wNavoj) {
		Stroke original = g2.getStroke();
		BasicStroke doubleStroke = new BasicStroke(1.3f);
		g2.setStroke(doubleStroke);
		this.settingsSquare = new Rectangle2D.Float(xZobnik, yZobnik, wZobnik, wZobnik);
	
		int wPolovica = 3 * ((wZobnik - wNavoj) / 2) / 5;
		int wCetrtina = 2 * ((wZobnik - wNavoj) / 2) / 5;
		
		int navojX0 = xZobnik + (wZobnik - wNavoj) / 2;
		int navojY0 = yZobnik + (wZobnik - wNavoj) / 2;
		
		// narisi sredino zobnika (celota)
		int ovalSize = wNavoj;
		g2.setColor(this.settingsColor);
		int krogX = navojX0;
		int krogY = navojY0;
		for (int i = 0; i < wPolovica; i++) {
			g2.drawOval(krogX, krogY, ovalSize, ovalSize);
			krogX--;
			krogY--;
			ovalSize += 2;
		}
		// narisi zunanji del zobnika (zobniki)
		for (int i = 0; i < wCetrtina; i++) {
			int arcAngle = 40;
			for (int j = 0; j < 7; j++) {
				int startAngle = 10 + j * 60;
				g2.drawArc(krogX, krogY, ovalSize, ovalSize, startAngle, arcAngle);
			}
			krogX--;
			krogY--;
			ovalSize += 2;
		}
		g2.setStroke(original);
	}	
	
	/**
	 * Metoda kreira in prikaze risalno plosco za nastavitve (SETTINGS)
	 */
	
	private void showSettingsPanel() {
		if (this.settingsPanel == null) {
			// 1 - ob prvem prikazu kreiraj plosco 'SETTINGS'
			double xs = getWidth() / 2.0;
			double ys = getHeight() / 2.0;
			boolean squareTileShape = (this.tileShape == TileShape.SQUARE);
			boolean[] toggleStates = new boolean[] { 
				this.hardMode, this.darkModeActive, false, squareTileShape, false
			};
			
			this.settingsPanel = new SettingsPanel(this, toggleStates);
			int spx0 = (int) (xs - (this.settingsWidth / 2.0));
			int spy0 = (int) (ys - (this.settingsHeight / 2.0));
			this.settingsPanel.setBounds(spx0, spy0, this.settingsWidth, this.settingsHeight);
			this.add(this.settingsPanel);
			this.revalidate();
		} else {
			// 2.1 - poisci, ce je 'panel settings' dodan na glavi panel (WordlePanel)
			boolean vsebuje = WordlePanel.containsComponent(this, this.settingsPanel);
			// 2.2 - dodaj obstojeco plosco 'SETTINGS' na glavno plosco
			if (!vsebuje)
				this.add(this.settingsPanel);
			this.revalidate();
		}
		this.repaint();
	}
	
	/**
	 * Nastavi obliko vseh ploscic na novo obliko.
	 *
	 * @tileShape nova oblika ploscice (OCTAGON or SQUARE)
	 */
	
	private void toggleTileShape(TileShape tileShape) {
		for (int i = 0; i < tiles.length; i++) {
			for (int j = 0; j < tiles[i].length; j++) {
				tiles[i][j].setShape(tileShape);
			}
		}
	}
	
	/**
	 * -- Postopki za spremembo stanja igre glede na spremembe NASTAVITEV --
	 */
	
	private void toggleHighContrastMode(boolean mode) {
		this.highContrastModeActive = mode;
		// zelena, oranzna --> na pravem mestu
		// rumena, modra   --> nahaja se na napacnem mestu
		
		// 1 - change tiles to (hi-contrast) mode...
		for (int i = 0; i < tiles.length; i++) {
			for (int j = 0; j < tiles[i].length; j++) {
				tiles[i][j].changeHiContrastMode(mode);
			}
		}
		// 2 - ... set window icon accordingly
		JFrame frame = (JFrame) SwingUtilities.getAncestorOfClass(JFrame.class, this);
		if (frame != null) {
			WordleFrame wordleFrame = (WordleFrame) frame;
			wordleFrame.nastaviIkonoOkna(this.highContrastModeActive);
		}
		this.repaint();
	}
	
	private void toggleHardMode(boolean newMode) {
		this.hardMode = newMode;
		if (!this.darkModeActive) {
			this.barvaPovrsine = this.hardMode ? WordlePanel.WHITE_SMOKE : Color.WHITE;
		}
		this.repaint();
	}
	
	private void toggleDarkLightMode() {
		this.darkModeActive = !this.darkModeActive;
		// 1 - tiles dark mode
		for (int i = 0; i < tiles.length; i++) {
			for (int j = 0; j < tiles[i].length; j++) {
				tiles[i][j].toggleDarkLightMode();
			}
		}
		// 2 - risalna plosca dark mode
		if (this.darkModeActive) {
			this.barvaPovrsine = Color.BLACK;
			this.barvaIgralnePlosce = Color.BLACK;
			this.barvaRoba = WordlePanel.VALENTINO;
		} else {
			this.barvaPovrsine = (this.hardMode) ? WordlePanel.WHITE_SMOKE : Color.WHITE;
			this.barvaIgralnePlosce = Color.WHITE;
			this.barvaRoba = WordlePanel.HIMALAYA_PEAKS;			
		}
		// 3 - status panel dark mode
		this.statusPane.toggleDarkLightMode();
		this.repaint();		
	}
	
	private void changeLanguageDictionary() {
		List<String> novSlovar = WordleFrame.readWords((this.ixLang + 1) % 2);
		if (novSlovar != null) {
			this.ixLang = (this.ixLang + 1) % 2;
			this.slovar = novSlovar;
		}
		this.initialize();
	}
	
	
	private void drawTiles(Graphics g, double x0, double y0, double tileWidth, double tileHeight, double padding) {
		for (int i = 0; i < tiles.length; i++) {
			int py = ri( y0 + tileWidth * i + (padding * i) );
			for (int j = 0; j < tiles[i].length; j++) {
				int px = ri( x0 + tileHeight * j + (padding * j) );
				Point xy = new Point(px, py);
				tiles[i][j].paintComponent(g, xy, tileWidth, tileHeight, padding);
			}
		} 
	}

	/** 
	 * Na platnu narise igralno povrsino brez plosckov 
	 * 
	 * @tileWidth, tileHeight sirina in visina ploscka (naceloma enaka)
	 * @padding razmak med ploscki
	 */

	private Point narisiIgralnoPovrsino(Graphics2D g2, int tileWidth, int tileHeight, double padding) {
		int odmik = 1;
		int robIgralnePovrsine = WordlePanel.SURFACE_BORDER_WIDTH;
		
		int sirinaPlosce = Math.min(getWidth(), getHeight());
		int visinaPlosce = Math.min(getWidth(), getHeight());
		
		// 1. rob plosce (canvas) 
		int cx0 = 0 + odmik;
		int cy0 = 0 + odmik;
		int wCanvas = getWidth() - 2 * odmik - 1;
		int hCanvas = getHeight() - 2 * odmik - 1;
		g2.setColor(this.barvaPovrsine);
		g2.fillRect(cx0, cy0, wCanvas, hCanvas);
		
		// 2. obroba (igralne) plosce - uporabna povrsina znotraj vseh odmikov
		int xz0 = (getWidth() - sirinaPlosce) / 2;
		int yz0 = cy0;
		int sirinaIgralnePlosce = sirinaPlosce - 2;
		int visinaIgralnePlosce = visinaPlosce - 2 * odmik - 2;
		g2.setColor(this.barvaIgralnePlosce);
		g2.fillRect(xz0, yz0, sirinaPlosce, visinaIgralnePlosce);
		g2.setColor(this.barvaRoba);
		// g2.setColor(Color.RED);
		// g2.drawRect(xz0, yz0, sirinaPlosce, visinaIgralnePlosce);
		
		// 3. igralna povrsina (xp0, yp0)
		int xp0 = xz0 + robIgralnePovrsine;
		int yp0 = cy0 + robIgralnePovrsine;
		int sirinaIgralnePovrsine = sirinaPlosce - 2 * robIgralnePovrsine;
		int visinaIgralnePovrsine = visinaPlosce - 2 * (odmik + robIgralnePovrsine) - 1;
		// g2.setColor(Color.RED);
		// g2.drawRect(xp0, yp0, sirinaIgralnePovrsine, visinaIgralnePovrsine);
		g2.setColor(Color.blue);
		// g2.drawRect(xp0 + sirinaIgralnePovrsine, yp0 + visinaIgralnePovrsine, robIgralnePovrsine, robIgralnePovrsine);
		
		// 4. ploscice - zgodnji levi rob (x0, y0)
		int wPloscice = ri((tileWidth * this.dolzinaBesede) + (this.dolzinaBesede - 1) * padding);
		int hPloscice = ri((tileHeight * this.steviloPoskusov) + (this.steviloPoskusov - 1) * padding);
		this.x0 = xp0 + ((sirinaIgralnePovrsine) - wPloscice) / 2;
		this.y0 = yp0 + ((visinaIgralnePovrsine) - hPloscice) / 2;
		// g2.drawRect(x0, y0, tileWidth, tileHeight); // (rob prve ploscice)
		// for (int i = 0; i < 5; i++)
		//  	g2.drawRect(x0 + i * tileWidth, y0, tileWidth, tileHeight); // (rob prve ploscice)
		
		return new Point(x0, y0);
	}


	/**
	 * -- start FLIP --
	 */
	
	/**
	 * Ob potrditvi vnosa, zazene postopek obracanja (flip) za ploscico (i, j)
	 */

	private void startFlipAnimation(int iVrstica, int iStolpec, int maskStatus, int initialDelayMilis) {
		FlipTilePerformer fliper = new FlipTilePerformer(this.tiles[iVrstica][iStolpec], maskStatus, WordlePanel.COMPLETE_FLIP_STEPS);
		Timer flipTimer = new Timer(0, fliper);
		flipTimer.setInitialDelay(initialDelayMilis);
		int delayKorak = WordlePanel.MILLIS_TO_FLIP / WordlePanel.COMPLETE_FLIP_STEPS;
		flipTimer.setDelay(delayKorak);
		flipTimer.start();		
	}
	
	private void flipCurrentLine(int[] hintMaska) {
		for (int j = 0; j < hintMaska.length; j++) {
			int value = hintMaska[j];
			// med zacetkoma obracanja dveh ploscic besede pocakamo WordlePanel.FLIP_DELAY milisekund (npr. 100 * j)
			int initialDelayMilis = WordlePanel.FLIP_DELAY * j; 
			this.flipAnimationInProgress = true;
			this.startFlipAnimation(this.ixVrstica, j, value, initialDelayMilis);
		}		
	}
	
	/**
	 * Ko beseda ne obstaja, se izvede (250 ms) animacija pretresa ploscice [i, j]
	 *
	 * @i - indeks vrstice
	 * @j - indeks stolpca
	 */

	private void startTileShake(int i, int j) {
		//
		// odstotek_casa =        [ 0,  10,  20,  30, 40,    50,  60,   70, 80, 90, 100 ]
		// odmik_od_sredine (x) = [ 0,  -5,   0,   5,  0,  -7.5,   0,  7.5,  0, -5,   0 ]
		//
		double[] odmikiPoCasu = new double[] { 0.0, -5.0,  5.0, 5.0, -5, -7.5, 7.5, 7.5, -7.5, -5.0, 5.0 };
		int delayKorak = WordlePanel.SHAKING_TIME_MILLIS / odmikiPoCasu.length;
		ShakeTilePerformer shaker = new ShakeTilePerformer(this.tiles[i][j], odmikiPoCasu);
		Timer shakeTimer = new Timer(0, shaker);
		shakeTimer.setDelay(delayKorak);
		shakeTimer.start();
	}

	private void shakeCurrentLine() {
		for (int j = 0; j < this.tiles[this.ixVrstica].length; j++) {
			this.startTileShake(this.ixVrstica, j);
		}
	}

	/**
	 * Ob zmagi zazene animacijo ploscice na mestu [i, j] (250 ms)
	 *
	 * @i - indeks vrstice
	 * @j - indeks stolpca
	 */

	private void startTileDance(int i, int j, int danceAnimationDelay) {
		int stNihajev = 3;
		int stKorakovNaNihaj = 10;
		DanceTilePerformer dancer = new DanceTilePerformer(this.tiles[i][j], stNihajev, stKorakovNaNihaj);
		int danceDelayKorak = 15; // 150
		Timer danceTimer = new Timer(0, dancer);
		danceTimer.setDelay(danceDelayKorak);
		danceTimer.setInitialDelay(danceAnimationDelay);
		danceTimer.start();
	}
	
	private void startLineDance() {
		for (int j = 0; j < this.tiles[this.ixVrstica].length; j++) {
			// [ iStolpec * Wordle.DANCE_ANIMATION_DELAY ]
			int danceDelay = j * WordlePanel.DANCE_ANIMATION_DELAY;
			this.startTileDance(this.ixVrstica, j, danceDelay);
		}
	}

	/**
	 * Metoda doda crko v naslednji prosti <tile> v vrstici 
	 * @crka niz dolzine ena s crko
	 */
	
	private void bounceTile(int i, int j, int bounceSteps) {
		BounceTilePerformer bouncer = new BounceTilePerformer(this.tiles[i][j], bounceSteps);
		Timer bounceTimer = new Timer(50, bouncer);
		bounceTimer.setInitialDelay(10);
		bounceTimer.start();
	}

	private void dodajCrko(String crka) {
		if (crka == null || crka.length() == 0)
			return;
		char velikaCrka = Character.toUpperCase(crka.charAt(0));
		if (this.ixStolpec < this.dolzinaBesede) {
			int i = this.ixVrstica;
			int j = this.ixStolpec;
			this.ixStolpec++;
			// 1 - nastavi vrednost <ploscice>
			this.tiles[i][j].setOznaka(velikaCrka);
			// 2 - sprozi animacijo (key splash) ob dodajanju crke za ploscico na mestu (i, j)
			this.bounceTile(i, j, WordlePanel.BOUNCE_STEPS);
			// this.bounceTile(i, j, 3);
			this.repaint();
		}
	}
	
	private void brisiZadnjoCrko() {
		// stolpec <ixStolpec> vedno kaze na prvega praznega
		if (this.ixStolpec == 0)
			// prva crka besede -> prazna beseda -> do nothing
			return;
		this.ixStolpec--;
		this.tiles[this.ixVrstica][this.ixStolpec].deactivate();
		int x = ri( this.x0 + this.tileWidth * this.ixStolpec + (this.padding * this.ixStolpec) );
		int y = ri( this.y0 + this.tileHeight * this.ixVrstica + (this.padding * this.ixVrstica) );
		// this.repaint(new Rectangle(x, y, this.tileWidth, this.tileHeight));
		this.repaint();
	}
		

	/**
	 * -- Metode, povezane s samodejnim igranjem stroja --
	 */
	
	private int[] vrniNamig() {
		// vrne rezultat (namig) za zadnjo vneseno besedo
		return this.maskaPrev;
	}
	

	/**
	 * Metoda na igralnno povrsino vnese celotno besedo naenkrat in jo preveri. Vnos vsake 
	 * crke je animiran -> simulira se ročni vnos v intervalu nekaj milisekund med crkami. Po 
	 * preverbi besede (metoda 'preveriVnos', ki tudi nastavi namig self.maskaPrev) po 
	 * določenem casu poklice metodo 'izberiNaslednjoBesedo' ki od stroja pridobi novo besedo.
	 *
	 * @beseda: beseda je podana v enem kosu s strani stroja
	 * @return: če je beseda neveljavna vrne False / sicer pa True
	 * 
	 */

	private boolean odigrajPotezo(String beseda) {
		// 1 - veljavnost besede
		if (beseda.length() != this.dolzinaBesede) {
			// dolzina besede neustrezna -> neveljavna poteza
			return false;
		} else {
			// stevilka znotraj besede -> neveljavna poteza
			for (int i = 0; i < beseda.length(); i++)
				if (Character.isDigit(beseda.charAt(i)))
					return false;
		}
		// 2 - zaporedje klica metod za vnos, preverjanje in vnos nove besede 
		//    (aisnhrono izvajanje v vec nitih):
		//    - v eni sekundi (1000ms) vnesemo vse crke (200 ms)
		//    - za preveritev besede pocakamo dvakrat vec kot med vnosom dveh crk
		int delayMilisCrka = 1000 / this.dolzinaBesede;
		int delayMilisVnosPreveri = 2 * delayMilisCrka;
		int delayMilisPreveri = this.dolzinaBesede * delayMilisCrka + delayMilisVnosPreveri;
		
		// 3 - zapisi besedo v trenutno vrstico in povecaj ixVrstice
		String besedaUpper = beseda.toUpperCase();
		for (int j = 0; j < besedaUpper.length(); j++) {
			String crka = String.format("%c", besedaUpper.charAt(j));
			
			// this.dodajCrko(crka);
			new Timer(j * delayMilisCrka, new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					WordlePanel.this.dodajCrko(crka);
					Timer timer = (Timer) event.getSource();
					timer.stop();
				}
			}).start();
		}
		// 4 - preveri rezultat vnesene besede, nastavi hint (self.maskaPrev)
		// this.preveriVnos();
		new Timer(delayMilisPreveri, new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				WordlePanel.this.preveriVnos();
				Timer timer = (Timer) event.getSource();
				timer.stop();
			}
		}).start();
		
		// 5 - po <n> ms se klice metoda za izbor nove besede (3000 ms)
		int delayNextWord = (int) (delayMilisCrka * this.dolzinaBesede + delayMilisVnosPreveri) + 1500;
		StrojNaslednjaBesedaPerformer nexter = new StrojNaslednjaBesedaPerformer();
		Timer nextTimer = new Timer(delayNextWord, nexter);
		nextTimer.start();
		return true;
	}
	

	/**
	 * Metoda na presifriranje odziva iz formata aplikacije v format za stroj
	 * "0", "2", "1"  -- v format -->  "+", "-", "o"
	 *
	 * @namig: namig v formatu, ki ga razume aplikacija
	 * @return: presifriran namig, ki ga razume stroj
	 * 
	 */

	private List<Character> presifrirajNamig(int[] namig) {
		List<Character> odziv = new ArrayList<>();
		// CORRECT(1), ABSENT(2), MISPLACED(0)  -->  "+", "-", "o"
		for (int nm : namig) {
			char odgovor = ' ';
			if (nm == Hint.CORRECT.getValue())
				odgovor = '+';
			else if (nm == Hint.ABSENT.getValue())
				odgovor = '-';
			else if (nm == Hint.MISPLACED.getValue())
				odgovor = 'o';
			odziv.add(odgovor);
		}
		return odziv;
	}

	/**
	 * Metoda od stroja pridobi naslednjo besedo in sprozi njeno preverjanje. To stori s pomocjo klica 
	 * metode 'odigrajPotezo'. V metodi 'odigrajPotezo' se po izvedbi preverjanja (metoda 'preveriVnos')
	 * in nastavitev maske z rezultatom koraka, znova poklice ta metoda 'izberiNaslednjoBesedo'. 
	 *
	 * Ob ponovnem klicu te metode, je ze znan rezultat prejsnje besede (this.maskaPrev). Namig se sporoci 
	 * igralcu s pomocjo klica igralceve metode 'sprejmiPotezo(namigMaska)'. Namig se zato sporoci sele 
	 * pri druem klicu metode. Igralec bo lahko uporabil posredovani namig pri generiranju nove besede. 
	 */

	private void izberiNaslednjoBesedo(){
		List<Character> odziv = null;
		if (this.ixVrstica > 0) {
			// namig se poslje igralcu sele, ko smo vnesli prvo vrstico in bo metoda 'odigrajPotezo()' 
			// ponovno klicala to metodo
			int[] namigMaska = this.vrniNamig();
			odziv = presifrirajNamig(namigMaska);
			// public abstract String poteza(List<Character> odziv);
			// this.stroj.poteza(namigMaska);
		}
		// 1 - igra koncana?
		if (this.gameStatus == GameStatus.SOLVED || this.gameStatus == GameStatus.GAME_OVER) {
			if (this.gameStatus == GameStatus.SOLVED) {
				// System.out.printf("[ Zmaga ]; #poskusov: %d%n", this.ixVrstica + 1)
			} else if (this.gameStatus == GameStatus.GAME_OVER) {
				System.out.printf("[ Vec srece prihodnjic ]: %s%n", this.selectedWord.toUpperCase());
			}
			return;
		}
		// 2 - stroj nam da naslednjo besedo
		// String kandidatBeseda = this.stroj.izberiPotezo();
		String kandidatBeseda = this.stroj.poteza(odziv);
		// 3 - zazeni postopek izpisa in preveritve besede
		if (!this.odigrajPotezo(kandidatBeseda)) {
			// 3.1 - neveljavna beseda -> izpisi sporocilo "ERR" in konec igre
			System.out.printf("[Napaka]: stroj '%s' je izbral neveljavno besedo: %s", this.imeStroja, kandidatBeseda);
			String error = "ERR";
			for (int j = 0; j < error.length(); j++) {
				char crka = error.charAt(j);
				this.tiles[this.ixVrstica][j + 1].setOznaka(crka);
				this.tiles[this.ixVrstica][j + 1].setErrorColor();
				this.bounceTile(this.ixVrstica, j + 1, WordlePanel.BOUNCE_STEPS);
			}
			return;
		}
	}
	
	private void runStroj() {
		// AUTO: metoda za sprozitev iskanja besede s pomocjo stroja
		this.izberiNaslednjoBesedo();
	}
	
	/** 
	 * Ponastavi igro na zacetno stanje / ponovi igro 
	 *
	 * @param stroj stroj, ki naj se uporabi; ce null, navadna igra
	 */

	public void initialize(Stroj stroj) {
		// 1 - inicializiraj stroj
		if (stroj != null) {
			// Set<String> copySlovar = new HashSet<>(this.slovar);
			stroj.inicializiraj(new HashSet<>(this.slovar));
		}
		
		// 2 - inicializiraj igro
		// izberi novo besedo
		this.selectedWord = WordlePanel.chooseNewWord(this.slovar, random);
		// skrij statusno ploscico
		this.statusPane.hide();
		this.statusPane.clearText();
		// reset <tiles>
		for (int iVrstica = 0; iVrstica < this.tiles.length; iVrstica++) {
			for (int jStolpec = 0; jStolpec < this.tiles[iVrstica].length; jStolpec++) {
				Tile tile = this.tiles[iVrstica][jStolpec];
				
				HideShowTilePerformer hider;
				if (iVrstica == this.tiles.length - 1 && jStolpec == this.tiles[iVrstica].length - 1)
					hider = new HideShowTilePerformer(tile, stroj);
				else
					hider = new HideShowTilePerformer(tile);
				
				int delayHideShow = 30 * (iVrstica + jStolpec);
				Timer hiderTimer = new Timer(delayHideShow, hider);
				hiderTimer.setDelay(30);
				hiderTimer.start();
			}
		}
		// ponastavi spremenljivke
		this.ixStolpec = 0;
		this.ixVrstica = 0;
		WordlePanel.clearHints(this.maskaPrev);
		this.gameStatus = GameStatus.IN_PROGRESS;
		this.repaint();
	}

	public void initialize() {
		this.initialize(null);
	}
	
	/** 
	 * Preveri uporabnikovo besedo -> ob pritisku na tipko <enter> 
	 */
	
	private boolean preveriVnos() {
		// 1 - uporabnik ni vnesel vseh <this.dolzinaBesede> crk besede
		if (this.ixStolpec < this.dolzinaBesede)
			return false;
		// sestavi besedo iz znakov v tiles[i][]
		StringBuilder sb = new StringBuilder("");
		for (Tile tile : this.tiles[this.ixVrstica])
			sb.append(tile.getOznaka());
		String vnos = sb.toString();
		String vnosLower = vnos.toLowerCase();
		if (this.hardMode) {
			// 2 - ali vnesena beseda obstaja v seznamu (slovarju) besed 
			//     zahteva wordla v <HARD_MODE> je, da mora beseda obstajati
			if (!this.slovar.contains(vnosLower)) {	
				// beseda ne obstaja -> zatresi vrstico
				System.out.printf("[Napaka]: beseda '%s' ne obstaja...%n", vnosLower);
				this.shakeCurrentLine();
				return false;
			}
		}
		// 3 - analiziraj besedo
		boolean wordFound = false;
		int[] maska = new int[this.dolzinaBesede];
		for (int i = 0; i < maska.length; i++)
			maska[i] = 0;
		// 3.1 - najprej popolnoma pravilni znaki (1)
		int vsota = 0;
		for (int j = 0; j < this.tiles[this.ixVrstica].length; j++) {
			if (this.selectedWord.charAt(j) == vnosLower.charAt(j)) {
				maska[j] = Hint.CORRECT.getValue();
				vsota++;
			}
		}
		if (vsota == this.dolzinaBesede)
			wordFound = true;
		// 3.2 - crke, ki jih ni v iskani besedi (2)
		List<Integer> nonexistent = new ArrayList<>();
		for (int i = 0; i < vnosLower.length(); i++) {
			char znak = vnosLower.charAt(i);
			if (!this.selectedWord.contains(znak + ""))
				nonexistent.add(i);
		}
		for (int j : nonexistent)
			maska[j] = Hint.ABSENT.getValue();
		// 3.2 - crke na napacnem mestu (0) -> so na vseh ostalih mestih v tabeli <maska>
		
		/**  ### */
		// pomembno: zelene crke ne smejo biti tudi rumene
		Map<Character, Integer> stPojavitev = new HashMap<Character, Integer>();
		for (int j = 0; j < this.selectedWord.length(); j++) {
			Character znak = this.selectedWord.charAt(j);
			stPojavitev.put(znak, stPojavitev.getOrDefault(znak, 0) + 1);
		}
		
		Map<Character, Integer> stPojavitevVnos = new HashMap<Character, Integer>();
		for (int j = 0; j < vnosLower.length(); j++) {
			Character znak = vnosLower.charAt(j);
			stPojavitevVnos.put(znak, stPojavitevVnos.getOrDefault(znak, 0) + 1);
		}
		
		Map<Character, Integer> stPojavitevPrevec = new HashMap<Character, Integer>();
		for (Map.Entry<Character, Integer> entry : stPojavitevVnos.entrySet()) {
			Character key = entry.getKey();
			int value = entry.getValue();
			if (stPojavitevVnos.get(key) > stPojavitev.getOrDefault(key, 0)) {
				// value(vnos) - value(selected)
				int valuePrevec = value - stPojavitev.getOrDefault(key, 0);
				stPojavitevPrevec.put(key, valuePrevec);
			}
		}

		for (int i = 0; i < vnosLower.length(); i++) {
			if (maska[i] == Hint.MISPLACED.getValue()) {
				char rumena = vnosLower.charAt(i);
				int stRumeneCrke = stPojavitevPrevec.getOrDefault(rumena, 0);
				if (stRumeneCrke > 0) {
					maska[i] = Hint.ABSENT.getValue();
					stPojavitevPrevec.put(rumena, stPojavitevPrevec.getOrDefault(rumena, 0) - 1);
				}
			}
		}
		/**  ### */

		if (this.hardMode) {
			boolean pravilaKrsena = false;
			for (int j = 0; j < maska.length; j++) {
				//  3.2.1 - neupostevenje zelene
				if (this.maskaPrev[j] == Hint.CORRECT.getValue() && this.maskaPrev[j] != maska[j]) {
					// error: word does not contain a hint at pos 'j'
					char znakIskan = Character.toUpperCase(this.selectedWord.charAt(j));
					char znakVnesen = Character.toUpperCase(vnosLower.charAt(j));
					System.out.printf("[!] pravilna crka na mestu '%d' ni uspostevana: %c -> %c%n", j + 1, znakIskan, znakVnesen);
					pravilaKrsena = true;
					break;
				}
				//  3.2.2 - neupostevanje rumene
				if (this.ixVrstica > 0) {
					char prejsnjaRumenaCrka = Character.toLowerCase(this.tiles[this.ixVrstica - 1][j].getOznaka());
					if (this.maskaPrev[j] == Hint.MISPLACED.getValue() && maska[j] == Hint.MISPLACED.getValue()) {
						if (prejsnjaRumenaCrka == vnosLower.charAt(j)) {
							char prejsnjaRumena = Character.toUpperCase(prejsnjaRumenaCrka);
							char sedanjaRumena = Character.toUpperCase(vnosLower.charAt(j));
							System.out.printf("[!] napacno postavljena crka na mestu '%d' ostaja: %c -> %c%n", j + 1, prejsnjaRumena, sedanjaRumena);
							pravilaKrsena = true;
							break;
						}
					}
					if (this.maskaPrev[j] == Hint.MISPLACED.getValue()) {
						if (vnosLower.indexOf(prejsnjaRumenaCrka) == -1) {
							System.out.printf("[!] manjka prej napacno postavljena crka '%c'.%n", Character.toUpperCase(prejsnjaRumenaCrka));
							pravilaKrsena = true;
							break;
						}
					}
				}
			}
			if (pravilaKrsena) {
				// neskladen vnos z zahtevami namiga -> zatresi vrstico
				this.shakeCurrentLine();
				return false;
			}
		}
		this.maskaPrev = maska;
		
		// 4 - izvedi animacijo obarvanja ploscic v skladu s podatki v tabeli <maska>
		//     (aisnhrono izvajanje v vec nitih);
		//     po animaciji preveri enakost besed; ce uporabnik zmaga, izvedi vse potrebne
		//     akcije za zakljucek "z zmago"
		this.flipCurrentLine(maska);

		// 5 - nov poskus (v novi vrstici)...
		if (!wordFound) {
			// ... ce sploh se imamo kak poskus
			if (this.ixVrstica == this.steviloPoskusov - 1) {
				// nimamo vec poskusov -> [ Game Over! ]
				this.gameStatus = GameStatus.GAME_OVER;
				this.statusPane.setText(this.selectedWord);
				this.statusPane.show();
				return wordFound;
			}
			// se imamo na voljo poskus... -> nova vrstica, prvi stolpec 
			this.ixVrstica++;
			this.ixStolpec = 0;
		}
		return wordFound;
	}
	
	/**
	 * Preveri enakost izbrane (selected) in uporabnikove zadnje besede
	 */
	
	private boolean wordWasFound(int iVrstica) {
		// sestavi besedo iz znakov vrstice [iVrstica]
		StringBuilder sb = new StringBuilder("");
		for (int j = 0; j < this.tiles[iVrstica].length; j++)
			sb.append(this.tiles[iVrstica][j].getOznaka());
		String vnos = sb.toString();
		String vnosLower = vnos.toLowerCase();
		for (int j = 0; j < this.tiles[iVrstica].length; j++) {
			if (this.selectedWord.charAt(j) != vnosLower.charAt(j))
				return false;
		}
		return true;
	}
	
	public boolean isFlipAnimationInProgress() {
		return this.flipAnimationInProgress;
	}	
	
	/**
	 * -- Poslusalci za plosco "SETTINGS" --
	 *
	 * Poslusalci klicejo privatne metode toggle<ime> glavne plosce.
	 */
	 
	public void changeColorTheme(Mode mode) {
		// DARK / LIGHT
		this.toggleDarkLightMode();
	}
	
	public void changeHardMode(boolean isOn) {
		// HARD / NORMAL
		this.toggleHardMode(isOn);
	}
	
	public void changeContrastMode(boolean isOn) {
		// COLOR BLIND / REGULAR
		this.toggleHighContrastMode(isOn);
	}
	
	public void changeTileShape(TileShape tileShape) {
		// OSEMKOTNIK / KVADRAT
		this.toggleTileShape(tileShape);
	}
	
	public void changeDictionary(boolean isEnglishOn) {
		// SLOVENIAN / ENGLISH
		this.ixLang = isEnglishOn ? 1 : 0;
		this.slovar = WordleFrame.readWords(this.ixLang);
	}
		
	/**
	 * -- Mouse Listeners --
	 */
	
	public void mouseClicked(int mx, int my) {
		if (this.settingsSquare == null)
			return;
		if (this.settingsSquare.contains(mx, my)) {
			this.settingsColor = this.barvaRoba;
			repaint();
			this.showSettingsPanel();
		}
		// 2 - propagiraj klike plosci 'SettingsPanel'
		if (this.settingsPanel != null) {
			double xs = getWidth() / 2.0;
			double ys = getHeight() / 2.0;			
			int spx0 = (int) (xs - (this.settingsWidth / 2.0));
			int spy0 = (int) (ys - (this.settingsHeight / 2.0));
			this.settingsPanel.mouseClicked(mx - spx0, my - spy0);
		}
	}
	
	public void mouseMoved(int mx, int my) {
		if (this.settingsSquare == null)
			return;
		// ob odprtem dialog oknu 'SETTINGS', ne naredi nic
		if (containsComponent(this, this.settingsPanel))
			return;
		this.settingsColor = this.settingsSquare.contains(mx, my) ? WordlePanel.MUNSELL_YELLOW : this.barvaRoba;
		this.repaint();
	}
	
	public void leftMouseDoubleClicked(int mx, int my) {
		// 1 - ob odprtem dialog oknu 'SETTINGS', ne naredi nic
		if (containsComponent(this, this.settingsPanel))
			return;
		// 2 - preveri prisotnost stroja
		if (this.stroj != null) {
			this.stroj = WordleFrame.getStrojObject(this.imeStroja, this.dolzinaBesede, this.steviloPoskusov);
			if (this.ixVrstica == 0 && this.ixStolpec == 0) {
				
				// Set<String> copySlovar = new HashSet<>(this.slovar);
				// this.stroj.inicializiraj(copySlovar);
				this.stroj.inicializiraj(new HashSet<>(this.slovar));
				this.runStroj();
				
			} else
				this.initialize(this.stroj);
		} else {
			System.out.printf("%n[Opozorilo]: manjka stroj; ob zagonu navedite ime stroja.%n");
			System.out.printf("\tjava -jar %s.jar <ime stroja>%n", "besedle");
		}
	}
	
	public void rightMouseDoubleClicked(int mx, int my) {
		// 1 - ob odprtem dialog oknu 'SETTINGS', ne naredi nic
		if (containsComponent(this, this.settingsPanel))
			return;
		this.initialize();
	}
	
	/** 
	 * -- Key Listeners --
	 */
	
	
	public void functionKeyF5Pressed() {
		this.initialize();
	}
	
	public void crkaPressed(String crka) {
		this.dodajCrko(crka);
	}
	
	public void backspacePressed() {
		if (this.gameStatus == GameStatus.IN_PROGRESS) {
			this.brisiZadnjoCrko();
		}
	}	
	
	/** [Enter] -> preveri besedo */
	
	public void enterPressed() {
		if (this.gameStatus == GameStatus.IN_PROGRESS) {
			// uporabnik je potrdil besedo -> preveri vneseno vrstico
			boolean status = this.preveriVnos();
		}
	}
	
	/** [ESC] -> quit */
	

	
	public void escapePressed() {
		if (containsComponent(this, this.settingsPanel)) {
			// zapri okno 'SETTINGS'
			this.remove(this.settingsPanel);
			this.revalidate();
			this.repaint();
		} else {
			// izhod iz programa
			System.exit(0);
		}
	}
	
	public void spacePressed() {
		if (this.gameStatus == GameStatus.IN_PROGRESS)
			System.out.printf("[ %s ]%n", this.selectedWord);	
	}	

	private void registerKeyListeners() {
		// 1 - povezava za male crke abecede
		String tipke = TipkaAction.CRKE_ABECEDE;
		for (int i = 0; i < tipke.length(); i++) {
			String formattedKeys = String.format("typed %c", tipke.charAt(i));
			String actionMapKey = String.format("tipka-%c", tipke.charAt(i));
			// ("typed a", "tipka-a")
			// this.eventToListener("typed a", "tipka-A");
			this.eventToListener(formattedKeys, actionMapKey);
		}
		// 2 - ostale kontrolne tipke
		this.eventToListener("ENTER", TipkaAction.ENTER);
		this.eventToListener("SPACE", TipkaAction.SPACE);
		this.eventToListener("BACK_SPACE", TipkaAction.BACK_SPACE);
		this.eventToListener("pressed ESCAPE", TipkaAction.ESCAPE);
		this.eventToListener("pressed F5", TipkaAction.F5);
		this.eventToListener("DELETE", TipkaAction.DELETE);
	}


	/**
	 * -- InputMap - provides a binding between an input event (currently only 
	 *    KeyStrokes are used) and an Object.
	 * -- put(KeyStroke, actionMapKey) - adds a binding for keyStroke to actionMapKey. 
	 *    If actionMapKey is null, this removes the current binding for keyStroke.
	 * -- getActionMap - Returns the ActionMap used to determine what Action to fire 
	 *    for particular KeyStroke binding.
	*/	
	
	public void eventToListener(String formattedKeys, String actionMapKey) {
		// [ WHEN_IN_FOCUSED_WINDOW, WHEN_FOCUSED, WHEN_ANCESTOR_OF_FOCUSED_COMPONENT ]
		
		// InputMap provides a binding between an input event (currently only KeyStrokes are used) and an Object.
		int whenOknoInFocus = JComponent.WHEN_IN_FOCUSED_WINDOW;
		InputMap inputMap = this.getInputMap(whenOknoInFocus);
		// .put(KeyStroke keyStroke, Object actionMapKey) -> Adds a binding for keyStroke to actionMapKey.
		
		// A KeyStroke represents a key action on the keyboard, or equivalent input device
		// -- KeyStroke.keyStroke(String) -> Parses a string and returns a KeyStroke.
		// 
		// -- "INSERT" => getKeyStroke(KeyEvent.VK_INSERT, 0);
		// -- "control DELETE" => getKeyStroke(KeyEvent.VK_DELETE, InputEvent.CTRL_MASK);
		// -- "alt shift X" => getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK | InputEvent.SHIFT_MASK);
		// -- "alt shift released X" => getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK | InputEvent.SHIFT_MASK, true);
		// -- "typed a" => getKeyStroke('a')
		//
		KeyStroke keyStroke = KeyStroke.getKeyStroke(formattedKeys);
		inputMap.put(keyStroke, actionMapKey);
		
		// Returns the ActionMap used to determine what Action to fire for particular KeyStroke binding.
		// provides mappings from Objects (called keys or Action names) to Actions.
		// -- put(Object key, Action action)
		ActionMap actionMap = this.getActionMap();
		actionMap.put(actionMapKey, new TipkaAction(actionMapKey, this));
	}


	/**
	 * -- [Listeners] for Timers --
	 */
	
	
	/**
	 *  Listener za timer [DanceTile]
	 *  -- animira ploscek, ce je del zmagovalne resitve
	 *  -- klice metodo tile.move(0, this.dy) in repaint()
	 */
	 
	private class DanceTilePerformer implements ActionListener {
		
		private static final int ST_KORAKOV_POD = 3;
		
		private Tile tile;
		private int stNihajev;
		private int stKorakovNaNihaj;
		
		private int[] vsiKoraki;
		private double[] amplitude;
		private double[] amplits;
		private double[] dys;
		
		private int stKoraka;		
		private int ix;
		private double dy;
		
		public DanceTilePerformer(Tile tile, int stNihajev, int stKorakovNaNihaj) {
			this.tile = tile;
			this.stNihajev = stNihajev;
			this.stKorakovNaNihaj = stKorakovNaNihaj;
			double tileHeight = this.tile.getTileHeight();
			
			// 1 - amplitude: [31.0, 15.5, 7.75]
			this.amplitude = new double[this.stNihajev];
			this.amplitude[0] = tileHeight / 2;
			for (int i = 1; i < this.amplitude.length; i++)
				this.amplitude[i] = this.amplitude[i - 1] / 2;
			
			// 2 - koraki: [10, 10, (3, 3), 10, 10, 10, 10]
			//     korak 3 in 4: gre pod nivo, nato nazaj na osnovni nivo
			this.vsiKoraki = new int[2 * this.stNihajev + 2];
			for (int i = 0; i < vsiKoraki.length; i++) {
				vsiKoraki[i] = (i == 2 || i == 3) ? DanceTilePerformer.ST_KORAKOV_POD : this.stKorakovNaNihaj;
			}
			// 3 - amplits: [-31.0, 31.0, 31.0, -31.0, -15.5, 15.5, -7.75, 7.75]
			this.amplits = new double[2 * this.stNihajev + 2];
			for (int i = 0, j = 0; i < amplitude.length; i++, j += 2) {
				amplits[j] = -amplitude[i];
				amplits[j + 1] = amplitude[i];
				if (i == 0) {
					j += 2;
					amplits[j] = amplitude[i];
					amplits[j + 1] = -amplitude[i];
				}
			}
			// 4 - odmiki za vsak nihaj: [-3.1, 3.1, (3.1, -3.1), -1.55, 1.55, -0.775, 0.775]
			this.dys = new double[2 * this.stNihajev + 2];
			for (int i = 0; i < amplits.length; i++)
				this.dys[i] = amplits[i] / this.stKorakovNaNihaj;			
			
			this.stKoraka = 0;	
			this.ix = 0;			
			this.dy = dys[ix];
		}
		
		public void actionPerformed(ActionEvent event) {
			this.stKoraka++;
			this.tile.move(0, this.dy);
			WordlePanel.this.repaint();
			
			if (stKoraka == vsiKoraki[ix]) {
				// prisli smo do konca trenutnega nihaja...
				ix++;
				if (ix == vsiKoraki.length) {
					// prisli smo do konca nihajev
					Timer timer = (Timer) event.getSource();
					timer.stop();
					return;
				}
				this.dy = dys[ix];
				this.stKoraka = 0;	
			}
		}
	}
	
	/**
	 *  Listener za timer [ShakeTile]
	 */
	 
	private class ShakeTilePerformer implements ActionListener {
		
		private Tile tile;
		private double[] odmiki;
		private int ixOdmik;
		
		public ShakeTilePerformer(Tile tile, double[] odmiki) {
			this.tile = tile;
			this.odmiki = odmiki;
			this.ixOdmik = 0;
		}
		
		public void actionPerformed(ActionEvent event) {
			double odmikOdstotek = this.odmiki[this.ixOdmik];
			this.tile.moveRelative(odmikOdstotek, 0);
			this.ixOdmik++;
			WordlePanel.this.repaint();
			
			if (this.ixOdmik >= this.odmiki.length) {
				this.tile.clearOdmik();
				// -> ustavi animacijo
				Timer timer = (Timer) event.getSource();
				timer.stop();
			}
		}
	}
	
	
	/**
	 *  Listener za timer [FlipTile]
	 *  -- poleze ploscek
	 *  -- ploscek pobarva v skladu z namigom
	 *  -- ob zakljucku klice: startLineDance()
	 */
	
	private class FlipTilePerformer implements ActionListener {
	
		private Tile tile;
		private int statusCrke;
		private int stKorakov;
		private int polovicaKorakov;
		private double dsy;
		private int stProzenj;
		private WordlePanel panel;
	
		public FlipTilePerformer(Tile tile, int statusCrke, int stKorakov) {
			this.tile = tile;
			this.statusCrke = statusCrke;
			this.stKorakov = stKorakov;
			
			this.polovicaKorakov = this.stKorakov / 2;
			// 
			// AffineTransform.scale(double sx, double sy)
			// sy = sy + dsy
			// the factor by which coordinates are scaled along the Y axis direction (0.1)
			// 
			this.dsy = 2 * (1.0 / this.stKorakov);
			this.stProzenj = 0;
			this.panel = WordlePanel.this;
		}
	
		public void actionPerformed(ActionEvent event) {
			this.stProzenj++;
			if (this.stProzenj <= this.polovicaKorakov) {
				// 1 - [ flip down (10 -> 0.1) ]
				this.tile.flip(this.dsy);
				panel.repaint();
			} 
			if (this.stProzenj == this.polovicaKorakov) {
				// 2 - ko smo na polovici (ploscica polezena), jo pobarvamo v skladu z dobljenim namigom
				if (this.statusCrke == 1)
					tile.setHintCorrect();
				else if (this.statusCrke == 2)
					tile.setHintAbsent();
				else if (this.statusCrke == 0)
					tile.setHintWrong();
				panel.repaint();
			}
			if (this.stProzenj > this.polovicaKorakov) {
				// 3 - [ flip up (10 -> -0.1) ]
				this.tile.flip(-this.dsy);
				panel.repaint();
			}
			
			// [x] - v zadnjem koraku ustavi animacijo in nastavi zastvico
			if (this.stProzenj == this.stKorakov) {
				Timer timer = (Timer) event.getSource();
				timer.stop();
				// 3.2 - <tile> zadnje crke? -> animacija je koncana
				// zadnja crka v vrstici: -> preveri resitev in dance
				if (tile.getStolpecIndeks() == WordlePanel.this.dolzinaBesede - 1) {
					panel.flipAnimationInProgress = false;
					
					// 2.3 - preverimo, ce so vse crke pravilne; 
					//       ce so, prikazi statusno sporocilo 'Splendid'
					int iVrstica = tile.getVrsticaIndeks();
					boolean wordFound = WordlePanel.this.wordWasFound(iVrstica);
					
					if (wordFound) {
						panel.startLineDance();
						panel.gameStatus = GameStatus.SOLVED;
						panel.statusPane.setText("Odlično");
						panel.statusPane.show();
					}
				}
			}
		}
	}
	
	/**
	 *  Listener za timer [BounceTile]
	 *  -- animira ploscek, za katerega vnesemo crko
	 *  -- klice metode highlight(), activate(), deactivate()
	 */	
	
	private class BounceTilePerformer implements ActionListener {
		
		private Tile tile;
		private int vsehProzenj;
		private int stProzenj;
		
		public BounceTilePerformer(Tile tile, int vsehProzenj) {
			this.tile = tile;
			this.vsehProzenj = vsehProzenj;
			this.stProzenj = 0;
		}
		
		public void actionPerformed(ActionEvent event) {
			stProzenj++;
			if (stProzenj == 1) {
				tile.highlight();
				WordlePanel.this.repaint();
			} else if (stProzenj == 2) {
				tile.activate();
			} else if (stProzenj > 2) {
				tile.dehighlight();
				WordlePanel.this.repaint();
				// stop timer
				Timer timer = (Timer) event.getSource();
				timer.stop();
			}
		}
	}
	
	/**
	 *  Listener za timer [ShowHideTile] - animacija skrivanja in prikaza ploscice
	 * 
	 *  @param stroj ce je podan stroj, po prikazu ploscice zazene stroj 
	 */
	
	private class HideShowTilePerformer implements ActionListener {
		
		private Tile tile;
		private Stroj stroj;
		private int stProzenj;
		
		public HideShowTilePerformer(Tile tile) {
			this.tile = tile;
			this.stProzenj = 0;
		}
		
		/** konstruktor za zadnji ploscek */
		
		public HideShowTilePerformer(Tile tile, Stroj stroj) {
			this(tile);
			this.stroj = stroj;
		}
		
		@Override
		public void actionPerformed(ActionEvent event) {
			stProzenj++;
			if (stProzenj == 1) {
				tile.hide();
			} else if (stProzenj == 2) {
				tile.reset();
				tile.show();
				// zadnji ploscek -> zazeni postopek ugibanja s pomocjo stroja
				if (stroj != null) {
					WordlePanel.this.runStroj();
				}
				// stop timer
				Timer timer = (Timer) event.getSource();
				timer.stop();
			}
			WordlePanel.this.repaint();
		}
	}	
	
	private class StrojNaslednjaBesedaPerformer implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			WordlePanel.this.izberiNaslednjoBesedo();
			
			Timer timer = (Timer) event.getSource();
			timer.stop();
		}
	}
	
	 
	private static int ri(double value) {
		return (int)(Math.round(value));
	}

	private SettingsPanel settingsPanel;
	private int settingsWidth;
	private int settingsHeight;	

	private int dolzinaBesede;
	private int steviloPoskusov;
	private List<String> slovar;
	private boolean hardMode;
	private TileShape tileShape;
	private String imeStroja;
	private Stroj stroj;
	private boolean darkModeActive;
	private boolean highContrastModeActive;
	private int ixLang;
	
	private Tile[][] tiles;
	private GameStatus gameStatus;
	private int[] maskaPrev;
	private StatusPane statusPane;
	private boolean flipAnimationInProgress;
	private Rectangle2D settingsSquare;
	
	private int x0, y0;
	private int tileWidth, tileHeight;
	private double padding;
	private Color barvaPovrsine;
	private Color barvaRoba;
	private Color barvaIgralnePlosce;
	private Color settingsColor;
	
	private String selectedWord;
	private int ixStolpec;
	private int ixVrstica;
	private Random random;
	
	private static final int SETTINGS_PANEL_WIDTH = 400;
	private static final int SETTINGS_PANEL_HEIGHT = 400;
	
	private static final String[] LANGUAGES = { "si", "en" };
	private static int SURFACE_BORDER_WIDTH = 15;
		
	private static Color HIMALAYA_PEAKS = new Color(226, 232, 240);
	private static Color WHITE_SMOKE = new Color(245, 245, 245);
	private static Color VALENTINO = new Color(51, 43, 51);
	
	private static Color MUNSELL_YELLOW = new Color(248, 222, 126); // 239, 204, 0
	
	private static final int FLIP_DELAY = 100;
	private static final int COMPLETE_FLIP_STEPS = 20;
	private static final int MILLIS_TO_FLIP = 200;
	
	private static final int BOUNCE_STEPS = 3;
	
	private static final int SHAKING_TIME_MILLIS = 200; // 250
	private static final int DANCE_ANIMATION_DELAY = 100;
}