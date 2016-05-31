package Debugger;

public class Bug9 {

	// ANFORDERUNG: Das Programm soll vergleichen, ob
	// 2 gleich 3 ist. Wenn 2 gleich 3 ist, sollen die
	// Zeile "Mathematik ist kaputt" ausgegeben werden.
	// HINWEIS: 2 ist niemals 3.

	@SuppressWarnings("all")
	public static void main(String[] args) {

		if (2 == 3)
		{
			System.out.println("Mathematik ist kaputt");
		}
	}
}
