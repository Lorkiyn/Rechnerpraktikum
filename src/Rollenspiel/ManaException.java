package Rollenspiel;

public class ManaException extends Exception{

	private static final long serialVersionUID = 1L;
	
	private int mana;
	
	public ManaException(int mana) {
		this.mana = mana;
	}

	public int getMana() {
		return mana;
	}
	
	@Override
	public String getMessage() {
		return "Mana ist aufgebraucht!";
	}

}
