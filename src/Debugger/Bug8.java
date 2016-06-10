package Debugger;

public class Bug8 {

	// ANFORDERUNG: Das Programm soll zeilenweise die
	// ganzzahligen  Ergebnisse der Teilungen von
	// 1 durch 5, 4, 3, 2 und 1 ausgeben. Danach soll
	// eine Zeile mit dem Wort "Programmende" ausgegeben
	// werden.
	// HINWEIS: Die gesuchten Ergebnisse sind
	// {0; 0; 0; 0; 1}

	public static void main(String[] args) {
		for (int i = 5; i >= 0; i--) {
			System.out.println("result: " + (1 / i));
		}
		System.out.println("Programmende");
	}
}
