public class Prastevila {
	
	private static final int SMALLEST_PRIME = 2;
	private static final int UPPER_BOUND = 1_000_000_000;
	
	private int value;
	
	public Prastevila() {
		this.value = SMALLEST_PRIME;
	}
	
	public void nastaviTrenutno(int prastevilo) {
		this.value = prastevilo;
	}
	
	public int vrniTrenutno() {
		return this.value;
	}
	
	public int naslednje() {
		this.value = neighbouringPrime(this.value, 1);
		
		return this.value;
	}
	
	public int prejsnje() {
		if(this.value == SMALLEST_PRIME) return this.value;
		this.value = neighbouringPrime(this.value, -1);
		
		return this.value;
	}
	
	private int neighbouringPrime(int prime, int delta) {
		for(int neighbour = prime + delta; neighbour >= SMALLEST_PRIME && neighbour < UPPER_BOUND; neighbour += delta) {
			if(isPrime(neighbour)) return neighbour;
		}
		
		return -1;
	}
	
	private static boolean isPrime(int n) { 
        if (n < SMALLEST_PRIME) return false;
		
        for (int i = SMALLEST_PRIME; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; 
		}
		
        return true; 
    }
}
