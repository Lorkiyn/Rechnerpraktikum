package Rollenspiel;

public abstract class Charakter{

	private Stats stats;
	private String name;

	public Charakter(Stats stats, String name) {
		this.stats = stats;
		this.name = name;
	}

	public void laufen() {
		try {
			if (stats.getExhaust() >= 0) {
				System.out.println("Charakter läuft. Verbleibende Ausdauer " +stats.getExhaust());
				stats.action(1);
			} else {
				throw new exhaustException(stats);
			}
		} catch (exhaustException e) {
			e.printStackTrace();
		}
	}

	public void klettern() {
		try {
			if (stats.getExhaust() >= 0) {
				System.out.println("Charakter läuft. Verbleibende Ausdauer " +stats.getExhaust());
				stats.action(2);
			} else {
				throw new exhaustException(stats);
			}
		} catch (exhaustException e) {
			e.printStackTrace();
		}
	}

	public void kämpfen() {
		try {
			if (stats.getExhaust() >= 0) {
				System.out.println("Charakter läuft. Verbleibende Ausdauer " +stats.getExhaust());
				stats.action(3);
			} else {
				throw new exhaustException(stats);
			}
		} catch (exhaustException e) {
			e.printStackTrace();
		}
	}

	public void lvlUp() {
		stats.levelUp();
	}

	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
