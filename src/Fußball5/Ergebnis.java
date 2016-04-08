package Fuﬂball5;

public class Ergebnis {
	
	private int toreHeim = 0;
	private int toreGast = 0;
	
	public Ergebnis() {}

	public int getToreHeim() {
		return toreHeim;
	}

	public void setToreHeim(int toreHeim) {
		this.toreHeim = toreHeim;
	}

	public int getToreGast() {
		return toreGast;
	}

	public void setToreGast(int toreGast) {
		this.toreGast = toreGast;
	}
	
	public void addTorHeim() {
		toreHeim++;
	}
	
	public void addTorGast() {
		toreGast++;
	}
	
	@Override
	public String toString() {
		return "Tore - H:" +toreHeim +", G: " +toreGast;
	}
	
}
