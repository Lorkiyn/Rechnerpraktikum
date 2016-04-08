package Fuﬂball5;

public class SpielAbbruchException extends Exception{
	private static final long serialVersionUID = 1L;
	private double spielMinute;

	public SpielAbbruchException(double spielMinute) {
		this.spielMinute = spielMinute;
	}
	
	public double getSpielMinute() {
		return spielMinute;
	}
	
	public String getMessage() {
		return "Spielzeit:" +spielMinute;
	}

}
