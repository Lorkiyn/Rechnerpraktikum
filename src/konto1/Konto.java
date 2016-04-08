package konto1;

public class Konto {

	private String nachname;
	private String vorname;
	private double kontostand;
	private double kreditlimit;

	public Konto(String nachname, String vorname, double kontostand, double kreditlimit) {
		this.nachname = nachname;
		this.vorname = vorname;
		this.kontostand = kontostand;
		this.kreditlimit = kreditlimit;
	}

	public String getNachname() {
		return nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public Double getKontostand() {
		return kontostand;
	}

	public Double getKreditlimit() {
		return kreditlimit;
	}

	void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

	public void setKreditlimit(double kreditlimit) {
		this.kreditlimit = kreditlimit;
	}

	public void einzahlen(double betrag) {
		this.kontostand += betrag;
	}

	public void abheben(double betrag) {
		if (((kontostand + kreditlimit) - betrag) >= 0 ){
			this.kontostand -= betrag;
		} else {
			System.out.println("Betrag ist zu groß!");
		}

	}


}