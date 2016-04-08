package Fuﬂball;

public class Trainer {

	private String name;
	private int alter;
	private int erfahrung;
	
	public Trainer(String name, int alter, int erfahrung) {
		this.name = name;
		this.alter = alter;
		this.erfahrung = erfahrung;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public int getErfahrung() {
		return erfahrung;
	}

	public void setErfahrung(int erfahrung) {
		this.erfahrung = erfahrung;
	}
	
	@Override
	public String toString() {
		return name +" " +alter +", Erfahrung: " +erfahrung;
	}
	
}
