package Rollenspiel;

public class Hunter extends Charakter{
	
	private int range;
	private Armor armor;
	private Weapon weapon;
	private String name;
	
	public Hunter(Stats stats, String name, int range, Weapon weapon, Armor armor) {
		super(stats, name);
		this.armor = armor;
		this.weapon = weapon;
		this.range = range;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public int getSpell() {
		return range;
	}
	
	public void setSpell(int range) {
		this.range = range;
	}
	
	public String getCName() {
		return "Hunter";
	}
	
	@Override
	public String toString() {
		return getName() +" ist ein " +getCName() +", mit den Stats " +getStats();
	}

}
