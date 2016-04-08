package Rollenspiel;

public class Mage extends Charakter{
	
	private int mana;
	private Armor armor;
	private Weapon weapon;
	private String name;
	
	public Mage(Stats stats, String name, int mana, Weapon weapon, Armor armor) {
		super(stats, name);
		this.armor = armor;
		this.weapon = weapon;
		this.mana = mana;
		this.name = name;
	}
	
	public void zaubern() {
		try {
			if (mana >= 0) {
				System.out.println("Attake! Verbleibende mana " +mana);
				mana--;
			} else {
				throw new ManaException(mana);
			}
		} catch (ManaException m) {
			m.printStackTrace();
		}
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
		return mana;
	}
	
	public void setSpell(int mana) {
		this.mana = mana;
	}
	
	public String getCName() {
		return "Mage";
	}
	
	@Override
	public String toString() {
		return getName() +" ist ein " +getCName() +", mit den Stats " +getStats();
	}

}
