package Debugger;

public class Bug2 {

	// ANFORDERUNG: Das Programm soll pruefen, ob die zwei
	// Strings "TEST" und "TEST" vergleichen. Sind beide
	// Strings ungleich, soll das Programm eine Ausgabe
	// machen.
	// HINWEIS: Die Werte der Strings sind gleich.

	@SuppressWarnings("all")
	public static void main(String[] args) {
		String a = new String("TEST");
		String b = new String("TEST");
		if (a != b) {
			System.out.println(a + " ist nicht gleich " + b);
		}
	}
}
