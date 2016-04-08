package konto3;

public class Person {
	private String vorname;
	private String nachname;
	private Adresse adresse;
	
	public Person(String nachname, String vorname, Adresse adresse) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.adresse = adresse;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	@Override
	public String toString() {
		return vorname +" " +nachname +", " +adresse;
	}

}