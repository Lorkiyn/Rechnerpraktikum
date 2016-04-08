package Rollenspiel;

public class Weapon {

	private int dmg;
	private int durability;
	private Stats stats;
	
	public Weapon(Stats stats, int dmg, int durability) {
		this.stats = stats;
		this.dmg = dmg;
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

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

}
