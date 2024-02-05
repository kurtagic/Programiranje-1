public enum Mode {
	
    LIGHT (0, "LIGHT"),
	DARK (1, "DARK");
	
	private final int mode;
	private final String value;
	
	Mode(int mode, String value) {
		this.mode = mode;
		this.value = value;
	}
	
	private int mode() { 
		return mode; 
	}
	
	private String value() { 
		return value;
	}	
}