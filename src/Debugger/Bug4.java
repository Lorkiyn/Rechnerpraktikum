package Debugger;

public class Bug4 {

	// ANFORDERUNG: Das Programm soll vergleichen, ob
	// 2 gleich 3 ist. Wenn 2 gleich 3 ist, sollen in zwei
	// Zeilen ausgegeben werden: "2 ist 3" und
	// "Mathematik ist kaputt". Zum Schluss des Programms
	// soll die Zeile "Programmende" ausgegeben werden.
	// HINWEIS: 2 ist niemals 3.

	@SuppressWarnings("all")
	public static void main(String[] args) {

		if (2 == 3)                                                                                                                                       
			System.out.println("2 ist 3");
			System.out.println("Mathematik ist kaputt");
		System.out.println("Programmende");
	}
}
