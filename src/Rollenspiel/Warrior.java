package Rollenspiel;

public class Warrior extends Charakter{
	
	private int def;
	private Armor armor;
	private Weapon weapon;
	private String name;
	
	public Warrior(Stats stats, String name, int def, Weapon weapon, Armor armor) {
		super(stats, name);
		this.armor = armor;
		this.weapon = weapon;
		this.def = def;
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

	public int getDef() {
		return def;
	}
	
	public void setDef(int def) {
		this.def = def;
	}
	
	public String getCName() {
		return "Warrior";
	}
	
	@Override
	public String toString() {
		return getName() +" ist ein " +getCName() +", mit den Stats " +getStats();
	}

}
