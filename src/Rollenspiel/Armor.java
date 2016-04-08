package Rollenspiel;

public class Armor {

	private int armor;
	private Stats stats;
	private int durability;
	
	public Armor(Stats stats, int armor, int durability) {
		this.stats = stats;
		this.armor = armor;
		this.durability = durability;
	}

	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

}
