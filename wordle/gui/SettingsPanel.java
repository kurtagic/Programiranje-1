import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.Graphics;
import java.awt.geom.*;

import java.io.File;
import java.util.Calendar;


public class SettingsPanel extends JPanel {
	
	/** constructors */
	
	public SettingsPanel(JPanel mainPanel, boolean[] states) {
		this.mainPanel = (WordlePanel) mainPanel;
		this.mode = states[1] ? Mode.DARK : Mode.LIGHT;
		
		this.pisava = SettingsPanel.DEFAULT_FONT;
		this.panelShadeMargin = SettingsPanel.PANEL_SHADE_MARGIN;
		this.margin = SettingsPanel.PANEL_MARGIN;
		
		// 1 - koordinate in velikosti stikal
		int xToggle = 0 + margin;
		int yToggle = 70 + this.panelShadeMargin;
		int wToggle = 400 - (2 * margin) - this.panelShadeMargin;
		int hToggle = SettingsPanel.TOGGLE_HEIGHT;
		
		this.toggles = SettingsPanel.createToggleSwitches(xToggle, yToggle, hToggle, wToggle, states, this.mode);
		
		// 2 - ali obstaja angleski slovar
		boolean englishDictExists = true;
		if (!(new File(WordleFrame.SLOVAR_EN)).exists()) {
			englishDictExists = false;
			for (ToggleSwitch toggle : this.toggles) {
				if (toggle.getActionCommand().equals("DICTIONARY"))
					toggle.onemogoci();
			}
		}
		
		// 3 - polozaj krizca za zapiranje
		int slideSize = ri(2.0 * hToggle / 3.0);
		this.xLeft = ri(xToggle + wToggle - slideSize - hToggle / 2.0);
		this.xRight = xLeft + slideSize;
		this.yUp = ri(3 * hToggle / 4.0 + slideSize);
		this.yDown = yUp + slideSize;
		
		// 4 - polozaj (c) aboutMessage
		this.xAbout = xToggle;
		this.yAbout = yToggle + ToggleSwitch.DESCENDER_HINT - ToggleSwitch.DESCENDER + this.toggles.length * (hToggle + ToggleSwitch.DESCENDER_HINT + ToggleSwitch.DESCENDER);					
		// 4.1 - polozaj verzije
		this.xToggleDesniRob = xToggle + wToggle;
	}
	
	public SettingsPanel(JPanel mainPanel, Mode mode) {
		this(mainPanel, new boolean[] { false, (mode == Mode.DARK), false });
	}
	
	public SettingsPanel() {
		this(null, Mode.DARK);
	}
	
	/**
	 * Izdela in vrne tabelo stikal.
	 *
	 * @x0 			x koordinata zgornjega stikala
	 * @y0 			y koordinata zgornjega stikala
	 * @hToggle 	visina komponente stikalo
	 * @wToggle 	sirina celotne komponente
	 * @return 		tabela izdelanih stikal
	 */
	
	private static ToggleSwitch[] createToggleSwitches(int x0, int y0, int hToggle, int wToggle, boolean[] states, Mode theme) {
		ToggleSwitch[] stikala = new ToggleSwitch[OPTIONS.length];
		int x = x0;
		int y = y0;
		for (int i = 0; i < OPTIONS.length; i++) {
			String actionCommand = OPTIONS[i][2];
			String oznaka = OPTIONS[i][0];
			String hint = OPTIONS[i][1];
			boolean state = states[i];
			stikala[i] = new ToggleSwitch(x, y, hToggle, wToggle, actionCommand, oznaka, hint, theme, state);
			if (i < OPTIONS.length - 1) {
				y = y + hToggle + ToggleSwitch.DESCENDER_HINT + ToggleSwitch.DESCENDER;
			}
		}
		return stikala;
	}
	
	/**
	 * Narisi krizec za zapiranje
	 */
	
	private void narisiKrizec(Graphics2D g2) {
		Stroke original = g2.getStroke();
		BasicStroke doubleStroke = new BasicStroke(3.0f);
		g2.setStroke(doubleStroke);
		Color crossColor = (this.mode == Mode.DARK) ? Color.WHITE : Color.BLACK;
		g2.setColor(crossColor);
		g2.drawLine(xLeft, yUp, xRight, yDown);
		g2.drawLine(xLeft, yDown, xRight, yUp);
		g2.setStroke(original);
	}
	
	/**
	 * Narise naslov okna (NASTAVITVE)
	 */
	
	private void narisiNaslov(Graphics2D g2) {
		Stroke original = g2.getStroke();
		// "NASTAVITVE";
		String nastavitve = "SETTINGS";
		
		Font originalFont = g2.getFont();
		Font arialBold = new Font(this.pisava, Font.BOLD, NASLOV_FONT_SIZE);
		FontMetrics fm = g2.getFontMetrics(arialBold);
		double xNaslov = (getWidth() / 2.0) - fm.stringWidth(nastavitve) / 2;
		double yNaslov = 2.5 * fm.getAscent();
		Color naslovColor = (this.mode == Mode.DARK) ? SettingsPanel.ALBABASTER : Color.BLACK;
		
		g2.setFont(arialBold);
		g2.setColor(naslovColor);
		g2.drawString(nastavitve, ri(xNaslov), ri(yNaslov));
		
		g2.setFont(originalFont);
		g2.setStroke(original);
	}
	
	/**
	 * Izpisi copyright + about notice + version
	 */	
	
	private void narisiAbout(Graphics2D g2) {
		Font originalFont = g2.getFont();
		int copyrightCode = 169;
		String copyright = Character.toString(copyrightCode);
		int leto = Calendar.getInstance().get(Calendar.YEAR);
		String original = String.format("(osnova %s)", SettingsPanel.ORIGINAL);
		String aboutString = String.format("%s %d %s, %s", copyright, leto, original, SettingsPanel.COMPANY);
		String versionString = String.format("v %s", TestWordle.VERSION_NUMBER);
		
		Font arialPlain = new Font(this.pisava, Font.PLAIN, SettingsPanel.ABOUT_FONT_SIZE);
		FontMetrics fm = g2.getFontMetrics(arialPlain);
		Color aboutColor = (this.mode == Mode.DARK) ? Color.WHITE : Color.GRAY;
		int xAbout = this.xToggleDesniRob - fm.stringWidth(versionString);
		
		g2.setFont(arialPlain);
		g2.setColor(aboutColor);
		g2.drawString(aboutString, this.xAbout, this.yAbout);
		g2.drawString(versionString, xAbout, this.yAbout);
		g2.setFont(originalFont);
	}
	
	/**
	 *  Metoda za izris risalne plosce na zaslon
	 */
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		// 1 - narisi senco panela
		double x = 0 + this.panelShadeMargin; 
		double y = 0 + this.panelShadeMargin;
		double width = x + getWidth() - 1 - 3 * this.panelShadeMargin;
		double height = y + getHeight() - 1 - 3 * this.panelShadeMargin;
		
		int shade = (this.mode == Mode.DARK) ? 120 : 1;
		int lowOpacity = (this.mode == Mode.DARK) ? 20 : 3;
		int topOpacity = (this.mode == Mode.DARK) ? 50 : 8;
		int pixels = 3;
		int i = 3;
		g.setColor(new Color(shade, shade, shade, ((lowOpacity / pixels) * i)));
		g2.fill(new RoundRectangle2D.Double(x - 4, y - 4, width + 8, height + 8, this.margin, this.margin));
		g.setColor(new Color(shade, shade, shade, ((topOpacity / pixels) * i)));
		g2.fill(new RoundRectangle2D.Double(x - 2, y - 2, width + 4, height + 4, this.margin, this.margin));
		
		// 2 - narisi plosco
		Color panelColor = (this.mode == Mode.DARK) ? SettingsPanel.GRAY_7 : Color.WHITE;
		Color backColor = (this.mode == Mode.DARK) ? Color.BLACK : Color.WHITE;
		setBackground(backColor);		
		g2.setColor(panelColor);
		g2.fill(new RoundRectangle2D.Double(x, y, width, height, this.margin, this.margin));
		
		// 3 - narisi naslov, close + about
		this.narisiNaslov(g2);
		this.narisiKrizec(g2);
		this.narisiAbout(g2);
		// 4 - narisi stikala
		for (ToggleSwitch toggle : toggles) {
			toggle.paintComponent(g2);
		}
	}
	
	public void mouseClicked(int mx, int my) {
		// 1 - ali je bilo kliknjeno stikalo
		for (ToggleSwitch toggle : this.toggles) {
			if (toggle.contains(mx, my)) {
				boolean novoStanje = toggle.changeState();
				String command = toggle.getActionCommand();
				if (command.equals("DARK_THEME")) {
					changeColorTheme(novoStanje);
				} else if (command.equals("HARD_MODE")) {
					this.mainPanel.changeHardMode(novoStanje);
				} else if (command.equals("HIGH_CONTRAST")) {
					changeContrastMode(novoStanje);
				} else if (command.equals("TILE_SHAPE")) {
					changeTileShape(novoStanje);
				} else if (command.equals("DICTIONARY")) {
					if (toggle.isEnabled()) {
						changeDictionary(novoStanje);
					}
				}
				this.repaint();
				break;
			}
		}
		// 2 - zapri okno
		if (mx > xLeft && mx < xRight && my > yUp && my < yDown) {
			Container container = this.getParent();
			container.remove(this);
			container.revalidate();
			container.repaint();
		}
	}
	
	/**
	 * Metoda spremeni barvno shemo in klice "listener" metodo.
	 */
	
	private void changeColorTheme(boolean isOn) {
		// 1.1 - spremeni shemo dialog okna in vseh komponent
		this.mode = (isOn) ? Mode.DARK : Mode.LIGHT;
		for (ToggleSwitch stikalo : this.toggles) {
			stikalo.changeColorTheme(this.mode);
		}
		// 1.2 - klici poslusalca od starsevske plosce
		this.mainPanel.changeColorTheme(this.mode);
	}
	
	private void changeContrastMode(boolean isOn) {
		// 3.1 - spremeni barvo komponent (zelena -> oranzna)
		for (ToggleSwitch stikalo : this.toggles) {
			stikalo.changeContrastMode(isOn);
		}
		// 3.2 - klici poslusalca od starsevske plosce
		this.mainPanel.changeContrastMode(isOn);
	}
	
	private void changeTileShape(boolean isOn) {
		// pri spremembi oblike ploscic, ni na tenutnem oknu treba narediti nic;
		// samo klicemo naprej metodo na glavni plosci 'WordlePanel'
		TileShape tileShape = isOn ? TileShape.SQUARE : TileShape.OCTAGON;
		this.mainPanel.changeTileShape(tileShape);
	}
	
	private void changeDictionary(boolean isOn) {
		this.mainPanel.changeDictionary(isOn);
	}
	
	private static int ri(double value) {
		return (int) Math.round(value);
	}
	
	private WordlePanel mainPanel;
	private Mode mode;
	private ToggleSwitch[] toggles;
	
	private String pisava;	
	private int margin;
	private int panelShadeMargin;
	private int xToggleDesniRob;
	private int xLeft, xRight, yUp, yDown;
	private int xAbout, yAbout;

	private static final int NASLOV_FONT_SIZE = 15;	
	private static final int ABOUT_FONT_SIZE = 11;
	
	private static final int PANEL_SHADE_MARGIN = 5;
	private static final int PANEL_MARGIN = 15;
	private static final String DEFAULT_FONT = "Arial";
	
	private static final Color GRAY_7 = new Color(18, 18, 19);
	private static final Color ALBABASTER = new Color(248, 248, 248);
	private static final Color PASTEL_GREEN = new Color(83, 141, 78);
	private static final Color PASTEL_ORANGE = new Color(245, 121, 58);
	
	private static final int TOGGLE_HEIGHT = 20;
	private static final String[][] OPTIONS = { 
		{ "Hard Mode", "Any revealed hints must be used in subsequent guesses", "HARD_MODE" }, 
		{ "Dark Theme", null, "DARK_THEME" }, 
		{ "High Contract Mode", "Contrast and colorblindness improvements", "HIGH_CONTRAST"},
		{ "Use Square Tiles", "Select squares instead of octagons as tiles", "TILE_SHAPE"},
		{ "English Dictionary", null, "DICTIONARY" }
	};
	
	private static final String ORIGINAL = "nytimes.com";
	private static final String COMPANY = "UNI-LJ, FRI";
}