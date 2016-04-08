package konto2;

public class Girokonto extends Konto{
	private double kreditlimit;

	public Girokonto(String nachname, String vorname, double kreditlimit) {
		super(nachname, vorname);
		this.kreditlimit = kreditlimit;
	}

	public double getKreditlimit() {
		return kreditlimit;
	}

	public void setKreditlimit(double kreditlimit) {
		this.kreditlimit = kreditlimit;
	}
	
	public void abheben(double betrag) {
		if (((kontostand + kreditlimit) - betrag) >= 0){
			kontostand -= betrag;
		} else {
			System.out.println("Betrag ist zu groß!");
		}

	}

}