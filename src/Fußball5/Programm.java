package Fuﬂball5;

import java.util.ArrayList;

public class Programm {

	public static void main(String[] args) throws SpielAbbruchException {
		ArrayList<Spieler> mannschaft1 = new ArrayList<Spieler>();
		ArrayList<Spieler> mannschaft2 = new ArrayList<Spieler>();
		
		//Team 1
		Trainer trainer1 = new Trainer("Serhat", 17, 10);
		Torwart torwart1 = new Torwart("Raphael", 17, 10, 10, 10);
		Spieler kevin = new Spieler("Kevin", 17, 10, 22, 10, 22);
		Spieler marcel = new Spieler("Marcel", 17, 10, 22, 10, 22);
		mannschaft1.add(kevin);
		mannschaft1.add(marcel);
		Mannschaft man1 = new Mannschaft("Heim Mannschaft", trainer1, torwart1, mannschaft1);
		
		//Team 2
		Trainer trainer2 = new Trainer("Oley", 17, 10);
		Torwart torwart2 = new Torwart("Olexey", 17, 10, 10, 10);
		Spieler darian = new Spieler("Darian", 17, 10, 22, 10, 22);
		Spieler alex = new Spieler("Alex", 17, 10, 22, 10, 22);
		mannschaft2.add(darian);
		mannschaft2.add(alex);
		Mannschaft man2 = new Mannschaft("Gast Mannschaft", trainer2, torwart2, mannschaft2);
		
		Ergebnis ergebnis = new Ergebnis();
		Spiel spiel = new Spiel(man1, man2, ergebnis);
		
		Gameplay.spielen(spiel);
		StringBuilder test = Gameplay.spielbericht;
		System.out.println(spiel);
	}

}
