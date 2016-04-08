package konto4;

public class Adresse {
	private String adresse;
	private String hausnummer;
	private String land;
	private String plz;
	
	public Adresse(String adresse, String hausnummer, String plz, String land) {
		this.adresse = adresse;
		this.hausnummer = hausnummer;
		this.land = land;
		this.plz = plz;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}
	
	@Override
	public String toString() {
		return adresse +" " +hausnummer +", " +plz +", " +land;
	}

}
