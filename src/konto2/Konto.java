package konto2;

public abstract class Konto {

	protected String nachname;
	protected String vorname;
	protected double kontostand;
	protected double kreditlimit;
	
	public Konto(String nachname, String vorname) {
		this.nachname = nachname;
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public double getKreditlimit() {
		return kreditlimit;
	}

	public void setKreditlimit(double kreditlimit) {
		this.kreditlimit = kreditlimit;
	}

	public Double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

	public void einzahlen(double betrag) {
		kontostand += betrag;
	}

	public void abheben(double betrag) {
		if ((kontostand - betrag) >= 0 ){
			kontostand -= betrag;
		} else {
			System.out.println("Betrag ist zu groß!");
		}

	}
	
}