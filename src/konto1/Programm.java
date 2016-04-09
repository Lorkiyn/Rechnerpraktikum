package konto1;

import java.util.Scanner;

public class Programm {

	private static Scanner sc;

	public static void main(String[] args) throws InterruptedException {
		sc = new Scanner(System.in);
		double kontostand = 0;
		Konto k = new Konto("Seaforest", "Oley", 500000, 500);
		boolean goOn = false;

		System.out.println("Kreditlimit: " +k.getKreditlimit());
		System.out.println("ktueller Kontostandt: " + kontostand +" €");

		try {
			while (!goOn) {
				System.out.print("\nWollen sie einen Betrag abehen[A] oder einzahlen[E] bzw. setter[S]: ");
				String inOut = sc.next();

				if (inOut.equalsIgnoreCase("e")) {
					System.out.print("\nBetrag: ");
					double betrag = sc.nextDouble();
					k.einzahlen(betrag);
					goOn = true;

				} else if (inOut.equalsIgnoreCase("a")) {
					System.out.print("\nBetrag: ");
					double betrag = sc.nextDouble();
					k.abheben(betrag);
					goOn = true;

				} else if (inOut.equalsIgnoreCase("s")) {
					System.out.print("\nBetrag: ");
					double betrag = sc.nextDouble();
					k.setKontostand(betrag);
					goOn = true;

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
