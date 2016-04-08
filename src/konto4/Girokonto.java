package konto4;

public class Girokonto extends Konto{
	private double kreditlimit;

	public Girokonto(Person inhaber, double kreditlimit) {
		super(inhaber);
		this.kreditlimit = kreditlimit;
	}

	public double getKreditlimit() {
		return kreditlimit;
	}

	public void setKreditlimit(double kreditlimit) {
		this.kreditlimit = kreditlimit;
	}

	public void abheben(double betrag) {
		try {
			if (((kontostand + kreditlimit) - betrag) >= 0){
				kontostand -= betrag;
			} else {
				throw new KreditlimitUeberschrittenException(kontostand, kreditlimit, betrag);
			}
		} catch (KreditlimitUeberschrittenException e) {
			System.out.println(e);
		}

	}

}