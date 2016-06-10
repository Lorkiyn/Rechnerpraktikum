package Debugger;

public class Bug7 {

	// ANFORDERUNG: Das Programm soll ein zweidimensionales
	// Array durchlaufen. Zwei ineinander verschachtelte
	// for-Schleifen sollen zeilenweise den Wert ihrer
	// Laufvariablen und den Wert an den entsprechenden
	// Indizes ausgeben.

	@SuppressWarnings("all")
	public static void main(String[] args) {
		int arr[][] = { {1, 2, 3}, {4, 5, 6} };

		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < 3; i++) {
				int a = arr[i][j]; 
				System.out.println("(" + i + ", " + j + "): " + a);
			}
		}
	}
}
