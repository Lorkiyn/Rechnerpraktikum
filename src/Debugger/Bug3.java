package Debugger;

public class Bug3 {
	
	// ANFORDERUNG: Das Programm soll mit der Methode
	// concat() die zwei Strings a und b verknuepfen
	// und ausgeben.

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String a = null;
		String b = new String("TEST");

		String c = a.concat(b);
		System.out.println(c);
	}
}

