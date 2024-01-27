import java.util.*;

public class Krozek {
	
	private String name;
	private int day;
	private int hour;
	private int capacity;
	private List<Ucenec> members;
	
	public Krozek(String naziv, int dan, int ura, int kvota) {
		this.name = naziv;
		this.day = dan;
		this.hour = ura;
		this.capacity = kvota;
		members = new ArrayList<>();
	}
	
	public String vrniNaziv() {
		return this.name;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public List<Ucenec> getMembers() {
		return this.members;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public int steviloClanov() {		
		return members.size();
	}
}
