package Fuﬂball2;

public class Programm {

	public static void main(String[] args) {
		Spieler s = new Spieler("Kevin", 17, 10, 22, 10, 22);
		Trainer t = new Trainer("Darian", 17, 10);
		Torwart tw = new Torwart("Alex", 17, 10, 10, 10);
		
		System.out.println(s +"\n" +tw +"\n" +t);

	}

}
