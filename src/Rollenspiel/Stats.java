package Rollenspiel;

public class Stats {

	private int strength;
	private int agility;
	private int endurance;
	private int intelligence;
	private int exhaust;

	public Stats(int strength, int agility, int endurance, int intelligence, int exhaust) {
		this.strength = strength;
		this.agility = agility;
		this.endurance = endurance;
		this.intelligence = intelligence;
		this.exhaust = exhaust;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public int getAgility() {
		return agility;
	}
	
	public void setAgility(int agility) {
		this.agility = agility;
	}
	
	public int getEndurance() {
		return endurance;
	}
	
	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}
	
	public int getIntelligence() {
		return intelligence;
	}
	
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public int getExhaust() {
		return exhaust;
	}

	public void setExhaust(int exhaust) {
		this.exhaust = exhaust;
	}
	
	public void action(int value) {
		this.exhaust -= value;
	}
	
	public void levelUp() {
		strength++;
		agility++;
		endurance++;
		intelligence++;
	}
	
	@Override
	public String toString() {
		return "Str: " +strength +", Bew: " +agility +", HP: " +endurance +", Int: " +intelligence +", Ausdauer: " +exhaust;
	}
	
}
