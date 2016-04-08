package konto3;

import java.util.Scanner;

public class Programm {

	private static Scanner sc = new Scanner(System.in);
	static boolean debug = true;

	public static String readString(String defaultValue) {
		if (debug) {
			System.out.println(defaultValue);
			return defaultValue;
		} else {
			return sc.next();
		}
	}

	public static double readDouble(double defaultValue) {
		if (debug) {
			System.out.println(defaultValue);
			return defaultValue;
		} else {
			return sc.nextDouble();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Konto k = null;
		Person p = null;
		Adresse a = null;
		double kontostand = 0;
		boolean goOn = false;

		String surname = null;		
		String name = null;	
		String adress = null;		
		String houseNumber = null;	
		String country = null;
		String zip = null;

		try {
			System.out.print("Nachname: ");
			surname = readString("Musterman");

			System.out.print("Vorname: ");
			name = readString("Max");

			System.out.print("Adresse: ");
			adress = readString("Musterstraße");

			System.out.print("Hausnummer: ");
			houseNumber = readString("1a");

			System.out.print("Land: ");
			country = readString("Deutschland");

			System.out.print("Postleitzahl: ");
			zip = readString("28325");

		} catch (Exception e) {
			System.out.println("Error! Ungültige Eingabe!");
		}

		a = new Adresse(adress, houseNumber, country, zip);
		p = new Person(surname, name, a);

		do {
			System.out.print("\nWas für ein Konto wollen sie erstellen? Girokonto[G] oder Sparkonto[S]: ");
			String konto = readString("g");
			System.out.println("\nAktueller Kontostandt von " +name +" " +surname +"'s Konto: " + kontostand +" €");
			if (konto.equalsIgnoreCase("g")) {
				k = new Girokonto(p, 500);
				kontostand = k.getKontostand();
				System.out.println("Kreditlimit: " +k.getKreditlimit());
				goOn = true;
			} else if (konto.equalsIgnoreCase("s")) {
				k = new Sparkonto(p);
				kontostand = k.getKontostand();
				goOn = true;
			}
		} while (!goOn);

		try {
			while (goOn) {
				System.out.print("\nWollen sie einen Betrag abehen[A] oder einzahlen[E] bzw. setter[S]: ");
				String inOut = readString("e");

				if (inOut.equalsIgnoreCase("e")) {
					System.out.print("Betrag: ");
					double betrag = readDouble(500);
					k.einzahlen(betrag);
					goOn = false;

				} else if (inOut.equalsIgnoreCase("a")) {
					System.out.print("Betrag: ");
					double betrag = readDouble(800);
					k.abheben(betrag);
					goOn = false;

				} else if (inOut.equalsIgnoreCase("s")) {
					System.out.print("\nBetrag: ");
					double betrag = readDouble(5000);
					k.setKontostand(betrag);
					goOn = false;

				} else {
					System.out.println("Ungültige Eingabe!");
				}

			}

			if (!debug) {
				System.out.print("Bitte warten");
				for (int i = 0; i < 3; i++) {
					System.out.print(".");
					Thread.sleep(700);
				} 
			}

			kontostand = k.getKontostand();
			System.out.println("\n\nNeuer Kontostandt von " +name +" " +surname +"'s Konto: " + kontostand +" €");

		} catch (Exception e) {
			System.out.println("Ungültige Eingabe!");
		}

	}

}