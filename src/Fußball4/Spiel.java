package Fußball4;

public class Spiel {
	
	private Mannschaft heim;
	private Mannschaft gast;
	private Ergebnis ergebnis;
	private StringBuilder spielbericht;
	
	public Spiel(Mannschaft heim, Mannschaft gast) {
		this.heim = heim;
		this.gast = gast;
	}

	public Mannschaft getHeim() {
		return heim;
	}

	public Mannschaft getGast() {
		return gast;
	}

	public Ergebnis getErgebnis() {
		return ergebnis;
	}

	public StringBuilder getSpielbericht() {
		return spielbericht;
	}
	
	@Override
	public String toString() {
		return "Ergebnis: " +ergebnis +"\n\n" 
				+heim
				+"\n" +gast;
	}
}
