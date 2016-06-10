package Debugger;

public class Bug6 {

	// ANFORDERUNG: Das Programm soll zeilenweise alle Namen
	// des Arrays ausgeben.

	@SuppressWarnings("all")
	public static void main(String[] args) {
		String array[] = { "Alice", "Bob", "Charly" };
		int i = 0;
		while (i < array.length) {
			System.out.println(array[++i]);
		}
	}
}
