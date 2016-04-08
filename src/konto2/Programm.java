 package konto2;

import java.util.Scanner;

public class Programm {

	private static Scanner sc;

	public static void main(String[] args) throws InterruptedException {
		sc = new Scanner(System.in);
		double kontostand = 0;
		Konto k = null;
		boolean goOn = false;

		do {
			System.out.print("Um was für eine Art Konto hanelt es sich? Girokonto[G] oder Sparkonto[S]: ");
			String konto = sc.next();
			if (konto.equalsIgnoreCase("g")) {
				k = new Girokonto("String1", "String2", 500);
				kontostand = k.getKontostand();
				System.out.println("\nKreditlimit: " +k.getKreditlimit());
				goOn = true;
			} else if (konto.equalsIgnoreCase("s")) {
				k = new Sparkonto("String1", "String2");
				kontostand = k.getKontostand();
				goOn = true;
			}
		} while (!goOn);

		System.out.println("\nAktueller Kontostandt: " + kontostand +" €");

		try {
			while (goOn) {
				System.out.print("\nWollen sie einen Betrag abehen[A] oder einzahlen[E] bzw. setter[S]: ");
				String inOut = sc.next();

				if (inOut.equalsIgnoreCase("e")) {
					System.out.print("\nBetrag: ");
					double betrag = sc.nextDouble();
					k.einzahlen(betrag);
					goOn = false;

				} else if (inOut.equalsIgnoreCase("a")) {
					System.out.print("\nBetrag: ");
					double betrag = sc.nextDouble();
					k.abheben(betrag);
					goOn = false;

				} else if (inOut.equalsIgnoreCase("s")) {
					System.out.print("\nBetrag: ");
					double betrag = sc.nextDouble();
					k.setKontostand(betrag);
					goOn = false;

				} else {
					System.out.println("Ungültige Eingabe!");
				}

			}

			System.out.print("Bitte warten");
			for(int i = 0;i < 3;i++){
				System.out.print(".");
				Thread.sleep(700);
			}

			kontostand = k.getKontostand();
			System.out.println("\n\nNeuer Kontostand: " + kontostand +" €");

		} catch (Exception e) {
			System.out.println("Ungültige Eingabe!");
		}
		
	}

}