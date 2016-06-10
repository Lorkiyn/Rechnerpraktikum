package Debugger;

public class Bug1 {
	
	// Anforderung: Das Programm soll zeilenweise alle Namen
	// des Arrays ausgeben und in einer weiteren Zeile die
	// Anzahl der Personen ausgeben.

	@SuppressWarnings("all")
	public static void main(String[] args) {
		String array[] = { "Alice", "Bob", "Charly" };
		for (int i = 0; i <= array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println(array.length + " Personen");
	}
}
