package Rollenspiel;

public class Priest extends Charakter{
	
	private int spell;
	private Armor armor;
	private Weapon weapon;
	private String name;
	
	public Priest(Stats stats, String name, int spell, Weapon weapon, Armor armor) {
		super(stats, name);
		this.armor = armor;
		this.weapon = weapon;
		this.spell = spell;
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
		return spell;
	}
	
	public void setSpell(int spell) {
		this.spell = spell;
	}
	
	public String getCName() {
		return "Priest";
	}
	
	@Override
	public String toString() {
		return getName() +" ist ein " +getCName() +", mit den Stats " +getStats();
	}

}
