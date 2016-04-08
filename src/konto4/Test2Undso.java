package konto4;

public class Test2Undso {

	public static void main(String[] args) {
		
		Adresse a = new Adresse("Musterstraﬂe", "2a", "28325", "Deutschland");
		Person p = new Person("Buggy", "Marciel", a);
		Girokonto test = new Girokonto(p, 500);
		
		System.out.println(test);

	}

}
