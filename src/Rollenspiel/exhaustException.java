package Rollenspiel;

public class exhaustException extends Exception{

	private static final long serialVersionUID = 1L;
	
	private Stats stats;
	
	public exhaustException(Stats stats) {
		this.stats = stats;
	}

	public Stats getStats() {
		return stats;
	}
	
	@Override
	public String getMessage() {
		return "Ausdauer ist aufgebraucht!";
	}

}
