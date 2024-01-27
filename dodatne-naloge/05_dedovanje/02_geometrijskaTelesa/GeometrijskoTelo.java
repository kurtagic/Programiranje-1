public abstract class GeometrijskoTelo {
	
	public static final double PI = 3.14159265;
	
	private String type;
	private int volume;
	private int area;
	
	public GeometrijskoTelo(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public int getVolume() {
		return this.volume;
	}

	public int getArea() {
		return this.area;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	public void setArea(int area) {
		this.area = area;
	}
	
	public abstract int calculateVolume();
	public abstract int calculateArea();
	public abstract void izpisi();
}