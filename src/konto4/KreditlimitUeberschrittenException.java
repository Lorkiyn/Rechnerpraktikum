package konto4;

public class KreditlimitUeberschrittenException extends Exception {

	private static final long serialVersionUID = 1L;

	private double kontostand;
	private double kreditlimit;
	private double betrag;

	public KreditlimitUeberschrittenException(double kontostand, double kreditlimit, double betrag) {
		this.kontostand = kontostand;
		this.kreditlimit = kreditlimit;
		this.betrag = betrag;
	}

	public double getKontostand() {
		return kontostand;
	}

	public double getKreditlimit() {
		return kreditlimit;
	}

	public double getBetrag() {
		return betrag;
	}

	private double getCount() {
		return (kreditlimit + kontostand) - betrag; 
	}		

	@Override
	public String getMessage() {
		return "Kreditlimit um " +getCount() +" überschritten!";
	}

}
