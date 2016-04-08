package Fußball;

public class Spieler {

	private String name;
	private int alter;
	private int staerke;
	private int torschuss;
	private int motivation;
	private int tore;
	
	public Spieler(String name, int alter, int staerke, int torschuss, int motivation, int tore) {
		this.name = name;
		this.alter = alter;
		this.staerke = staerke;
		this.torschuss = torschuss;
		this.motivation = motivation;
		this.tore = tore;
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

	public int getStaerke() {
		return staerke;
	}

	public void setStaerke(int staerke) {
		this.staerke = staerke;
	}

	public int getTorschuss() {
		return torschuss;
	}

	public void setTorschuss(int torschuss) {
		this.torschuss = torschuss;
	}

	public int getMotivation() {
		return motivation;
	}

	public void setMotivation(int motivation) {
		this.motivation = motivation;
	}

	public int getTore() {
		return tore;
	}

	public void setTore(int tore) {
		this.tore = tore;
	}
	
	@Override
	public String toString() {
		return name +" " +alter +", Stärke: " +staerke +", Torschüsse: " +torschuss +", Motivation: " +motivation +", Tore: " +tore;
	}
}
