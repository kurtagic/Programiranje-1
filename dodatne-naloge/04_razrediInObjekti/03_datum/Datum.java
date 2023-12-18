public class Datum {
	
	private static final int START_YEAR = 1583;
	private static final int END_YEAR = 2999;
	private static final int START_MONTH = 1;
	private static final int END_MONTH = 12;
	private static final int START_DAY = 1;
	private static final int LEAP_DAYS = 29;
	private int dan;
	private int mesec;
	private int leto;
	
	private Datum(int day, int month, int year) {
		this.dan = day;
		this.mesec = month;
		this.leto = year;
	}
	
	public static Datum ustvari(int day, int month, int year) {
		return isValid(day, month, year) ? new Datum(day, month, year): null; 
	}
	
	private static boolean isValid(int day, int month, int year) {
		if(year < START_YEAR || year > END_YEAR) return false;
		if(month < START_MONTH || month > END_MONTH) return false;
		
		int maxDays = daysInMonth(month, year);
		if(day < START_DAY || day > maxDays) return false;
		
		return true;
	}
	
	private static int daysInMonth(int month, int year) {
		int[] daysPerMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		return (month == 2 && isLeapYear(year)) ? LEAP_DAYS : daysPerMonth[month-1];
	}
	
	private static boolean isLeapYear(int year) {
		if(year % 400 == 0) return true;
		if(year % 4 == 0 && year % 100 != 0) return true;
		
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("%02d.%02d.%04d", this.dan, this.mesec, this.leto);
	}
	
	public boolean jeEnakKot(Datum datum) {
		return this.toString().equals(datum.toString());
	}
	
	public boolean jePred(Datum datum) {
		if(this.leto < datum.leto) return true;
		if(this.mesec < datum.mesec) return true;
		if(this.dan < datum.dan) return false;
		
		return false;
	}
	
	public Datum naslednik() {
        return this.toString().equals("31.12.2999") ? null : this.cez(1);
    }

    public Datum predhodnik() {
        return this.toString().equals("01.01.1583") ? null : this.cez(-1);
    }
	
	public Datum cez(int delta) {
		int day = this.dan + delta;
		int month = this.mesec;
		int year = this.leto;

		while (!isValidDay(month, year, day)) {
			if (delta > 0) {
				day -= daysInMonth(month, year);
				month = (month == END_MONTH) ? START_MONTH : month + 1;
				year = (month == START_MONTH) ? year + 1 : year;
			} else if (delta < 0) {
				month = (month == START_MONTH) ? END_MONTH : month - 1;
				year = (month == END_MONTH) ? year - 1 : year;
				day += daysInMonth(month, year);
			}
		}	

		return isValidDay(month, year, day) ? ustvari(day, month, year) : null;
	}

	private boolean isValidDay(int month, int year, int day) {
		return day >= START_DAY && day <= daysInMonth(month, year);
	}
	
	public int razlika(Datum datum) {
		return this.calculateDays() - datum.calculateDays();
	}

	private int calculateDays() {		
		return this.dan + daysInMonths(this.mesec, this.leto) + daysInYears(this.leto);
	}
	
	private int daysInMonths(int months, int year) {
		int days = 0;
		for (int month = START_MONTH; month < months; month++) {
			days += daysInMonth(month, year);
		}
		
		return days;
	}

	private int daysInYears(int years) {
		int days = 0;
		for (int year = START_YEAR; year < years; year++) {
			days += daysInMonths(END_MONTH + 1, year);
		}
		
		return days;
	}
}