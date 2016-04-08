package Rollenspiel;

public class Programm {

	public static void main(String[] args) {
		
		Stats wStats = new Stats(20, 5, 16, 1, 10);
		Weapon wWeapon = new Weapon(wStats, 10, 100);
		Armor wArmor = new Armor(wStats, 10, 100);
		
		Stats mStats = new Stats(3, 6, 6, 20, 10);
		Weapon mWeapon = new Weapon(mStats, 10, 100);
		Armor mArmor = new Armor(mStats, 10, 100);
		
		Warrior warrior = new Warrior(wStats, "Lorkin", 10, wWeapon, wArmor);
		Mage mage = new Mage(wStats, "Lorkin", 10, mWeapon, mArmor);
		
		
		System.out.println(warrior);
		System.out.println(mage);

	}

}
