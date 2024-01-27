import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.*;
import java.awt.Font;
import java.awt.FontMetrics;

import javax.swing.JComponent;


/** 
 * razred [Stikalo] 
 */

public class ToggleSwitch extends JComponent {
	
	/** konstruktorji */
	
	public ToggleSwitch(int x, int y, int height, int width, String cmd, String oznaka, String hint, Color colorActive, boolean bordered, Mode mode, boolean active, boolean disabled) {
		
		// 1 - koordinate in dimenzije
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		this.slideSize = 2 * this.height / 3.0;
		this.xToggle = x + this.width - this.height - this.slideSize;
		
		// 2 - barve
		this.colorStikalo = Color.WHITE;
		this.colorBackActive = colorActive;
		this.colorBackInactive = (mode == Mode.DARK) ? DARK_GRAY_BACK_TOGGLE : LIGHT_GRAY_BACK_TOGGLE;
		this.colorBackDisabled = MERCURY;
		this.colorRobActive = this.colorBackActive.darker();
		this.colorRobInactive = this.colorBackInactive.darker();
		this.hasBorder = bordered;
		
		// 3 - vrednost in stanje 
		this.actionCommand = cmd;
		this.oznaka = oznaka;
		this.hint = hint;
		this.mode = mode;
		this.active = active;
		this.onemogocen = disabled;
	}
	
	
	/** the most sought-after constructor */
	
	public ToggleSwitch(int x, int y, int height, int width, String cmd, String oznaka, String hint, Mode mode, boolean active) {
		this(x, y, height, width, cmd, oznaka, hint, PASTEL_GREEN, false, mode, active, false);
	}	

	public ToggleSwitch(int x, int y, int height, int width, String cmd, Color colorActive, boolean border, String oznaka) {
		this(x, y, height, width, cmd,  oznaka, null, colorActive, border, Mode.LIGHT, false, false);
	}

	/**
	 * Metoda spremeni izgled stikala v skladu z barvno shemo
	 * @mode Mode.DARK in Mode.LIGHT
	 */
	
	public void changeColorTheme(Mode mode) {
		this.mode = mode;
		this.colorBackInactive = (mode == Mode.DARK) ? DARK_GRAY_BACK_TOGGLE : LIGHT_GRAY_BACK_TOGGLE;
		this.colorRobInactive = colorBackInactive.darker();
	}
	
	/** spremeni barvo ozadja aktivnega stikala */
	
	public void changeContrastMode(boolean hiContrastOn) {
		this.colorBackActive = hiContrastOn ? PASTEL_ORANGE : PASTEL_GREEN;
		this.colorRobActive = this.colorBackActive.darker();
	}	
	
	/**
	 * Narisi obrobo stikala
	 */
	
	private void drawObroba(Graphics2D g2, double x, double y, double visina, double slideSize) {
		Color barvaRoba = this.active ? this.colorBackActive : this.colorBackInactive;
		if (this.hasBorder)
			barvaRoba = this.active ? this.colorRobActive : this.colorRobInactive;
		if (this.onemogocen)
			barvaRoba = this.colorBackDisabled;

		g2.setColor(barvaRoba);
		g2.fill(new Ellipse2D.Double(x, y, visina, visina));
		g2.fill(new Ellipse2D.Double(x + slideSize, y, visina, visina));
		g2.fill(new Rectangle.Double(x + visina / 2.0, y, slideSize, visina));
	}
	
	/**
	 * Narisi ozadje stikala
	 */
	
	private void drawInner(Graphics2D g2, double x, double y, double visina, double slideSize) {
		double xp = x + ROB;
		double yp = y + ROB;
		double innerVisina = visina - 2 * ROB;
		Color barvaOzadja = this.active ? this.colorBackActive : this.colorBackInactive;
		if (this.onemogocen)
			barvaOzadja = this.colorBackDisabled;
		
		g2.setColor(barvaOzadja);
		g2.fill(new Ellipse2D.Double(xp, yp, innerVisina, innerVisina));
		g2.fill(new Ellipse2D.Double(xp + slideSize, yp, innerVisina, innerVisina));
		g2.fill(new Rectangle.Double(xp + visina / 2.0, yp, slideSize, innerVisina));			
	}
	
	/**
	 * Narisi drsnik stikala
	 */
	
	private void drawSwitch(Graphics2D g2, double x, double y, double visina, double slideSize) {
		Color barvaRoba = this.active ? this.colorBackActive : this.colorBackInactive;
		double xp = x + 2 * ROB;
		double yp = y + 2 * ROB;
		double innerVisina = visina - 4 * ROB;
		if (this.hasBorder) {
			barvaRoba = this.active ? this.colorRobActive : this.colorRobInactive;
			xp = x + ROB;
			yp = y + ROB;
			innerVisina = visina - 2 * ROB;
		}
		if (this.onemogocen)
			barvaRoba = this.colorBackDisabled;
		// koordinata x: on/off
		double xObroba = this.active ? x + slideSize : x;
		double xInner = this.active ? xp + slideSize : xp;
		
		g2.setColor(barvaRoba);
		g2.fill(new Ellipse2D.Double(xObroba, y, visina, visina));
		g2.setColor(this.colorStikalo);
		g2.fill(new Ellipse2D.Double(xInner, yp, innerVisina, innerVisina));
	}
	
	private void drawText(Graphics2D g2) {
		Font originalFont = g2.getFont();
		
		// 1 - barve glede na 'mode'
		Color lineColor = (mode == Mode.DARK) ? BLACK_MODE_LINE_COLOR : LINE_COLOR;
		Color textColor = (mode == Mode.DARK) ? TEXT_DARK_MODE : Color.BLACK;
		Color hintColor = (mode == Mode.DARK) ? Color.WHITE : Color.GRAY;

		// 2 - crta pod stikalom
		int descender = (this.hint == null) ? DESCENDER: DESCENDER_HINT;	
		
		int xLineStart = this.x;
		int xLineEnd = this.x + this.width;
		int yLine = this.y - descender;
		g2.setColor(lineColor);
		g2.drawLine(xLineStart, this.y + this.height + descender, xLineEnd, this.y + this.height + descender);
		
		// 3 - izracunaj metriko za tipografijo
		int fontSizeOznaka = 17;
		int fontSizeHint = 11;
		String fontOznaka = "Arial";
		Font arialBold = new Font(fontOznaka, Font.PLAIN, fontSizeOznaka);
		Font arialSmall = new Font(fontOznaka, Font.PLAIN, fontSizeHint);
		FontMetrics fm = g2.getFontMetrics(arialBold);
		FontMetrics fms = g2.getFontMetrics(arialSmall);
		
		// 4 - izracunaj koordinate teksta: Oznaka / Hint
		double xOznaka = x;
		double xHint = x;
		double yOznaka = y + (fm.getAscent() + (this.height - (fm.getAscent() + fm.getDescent())) / 2);
		double yHint = y + (fms.getAscent() + (this.height - (fms.getAscent() + fms.getDescent())) / 2);
		if (this.hint != null) {
			yOznaka = yOznaka - 0.8 * fms.getAscent();
			yHint = yHint + 0.8 * fms.getAscent();
		}
		// 5.1 - izpisi tekst za "Oznaka"
		g2.setFont(arialBold);
		g2.setColor(textColor);
		g2.drawString(this.oznaka, ri(xOznaka), ri(yOznaka));
		// 5.2 - izpisi tekst za "Hint"
		if (this.hint != null) {
			g2.setFont(arialSmall);
			g2.setColor(hintColor);
			g2.drawString(this.hint, ri(xHint), ri(yHint));
		}
		
		g2.setFont(originalFont);
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		// 1 - narisi text
		this.drawText(g2);
		// 1.2 - narisi stikalo
		this.drawObroba(g2, this.xToggle, y, this.height, this.slideSize);
		this.drawInner(g2, this.xToggle, y, this.height, this.slideSize);
		this.drawSwitch(g2, this.xToggle, y, this.height, this.slideSize);
	}
	
	public boolean contains(int mx, int my) {
		if (mx > this.xToggle && mx < this.xToggle + 2 * this.height) {
			if (my > this.y && my < this.y + this.height)
				return true;
		}
		return false;
	}
	
	/**
	 * Metoda (poslusalec), ki jo klice dogodek klika na objekt. 
	 */
	
	public boolean changeState() {
		if (!this.onemogocen) {
			this.active = !this.active;
			this.repaint();
		}
		return this.active;
	}
	
	/** 
	 * Metoda vraca ukaz v obliki niza, ki je povezan z vrsto dogodka (ActionEvent).
	 */
	
	public String getActionCommand() {
		return this.actionCommand;
	}	
	
	public boolean isEnabled() {
		return !this.onemogocen;
	}
	
	public void omogoci() {
		this.onemogocen = false;
		repaint();
	}
	
	public void onemogoci() {
		this.onemogocen = true;
		repaint();
	}
	
	private static int ri(double value) {
		return (int)(Math.round(value));
	}

	private int x;
	private int y;
	private int width;
	private int height;
	private double xToggle;	
	private double slideSize;
	private boolean hasBorder;
	
	private String oznaka;
	private String hint;
	private String actionCommand;
	private Mode mode;
	private boolean active;
	private boolean onemogocen;
	
	private Color colorStikalo;
	private Color colorBackActive;
	private Color colorBackInactive;
	private Color colorBackDisabled;
	private Color colorRobActive;
	private Color colorRobInactive;
	
	private static final int ROB = 1;
	private static final int DEFAULT_HEIGHT = 30;
	
	private static Color LINE_COLOR = new Color(211, 214, 218);
	private static Color BLACK_MODE_LINE_COLOR = new Color(58, 58, 60);
	private static Color TEXT_DARK_MODE = new Color(248, 248, 248);
	private static Color DARK_GRAY_BACK_TOGGLE = new Color(86, 87, 88);
	private static Color LIGHT_GRAY_BACK_TOGGLE = new Color(135, 138, 140);
	
	private static final Color PASTEL_GREEN = new Color(83, 141, 78);
	private static final Color PASTEL_ORANGE = new Color(245, 121, 58);	
	private static final Color MERCURY = new Color(230, 230, 230);
	
	public static final int DESCENDER = 16;
	public static final int DESCENDER_HINT = 21;
}