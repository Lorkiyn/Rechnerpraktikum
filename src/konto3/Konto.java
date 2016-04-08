package konto3;

public abstract class Konto {

	private Person inhaber;
	protected double kontostand;
	protected double kreditlimit;
	
	public Konto(Person inhaber) {
		this.inhaber = inhaber;
	}

	public Person getInhaber() {
		return inhaber;
	}

	public void setInhaber(Person inhaber) {
		this.inhaber = inhaber;
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

	@Override
	public String toString() {
		return "Inhaber: " +inhaber +" Kontostand: " +kontostand;
	}
	
}