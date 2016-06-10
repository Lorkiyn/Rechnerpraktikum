package Debugger;

public class Bug5 {

	// ANFORDERUNG: Die Klasse Bug5 soll ein Attribut
	// der Klasse String halten, dass mit dem Wert "BUG"
	// vorinitialisiert ist. Der Konstruktor soll einen
	// String als Parameter uebernehmen und das Attribut
	// mit diesem Wert fuellen. Die Methode print() soll
	// eine Zeile mit dem Wert des Attributs ausgeben.
	// Das Programm soll die Klasse instanziieren und
	// dabei dem Konstruktor den Wert "TEST" als Parameter
	// uebergeben. Dann soll mit Hilfe der Methode print()
	// der Wert des Attributs ausgegeben werden.

	private String text = "BUG";

	public static void main(String[] args) {
		Bug5 bug = new Bug5("TEST");
		bug.print();
	}

	@SuppressWarnings("all")
	public Bug5(String text) {
		text = text;
	}

	public void print() {
		System.out.println(text);
	}
}

