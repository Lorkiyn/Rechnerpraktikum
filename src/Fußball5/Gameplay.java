package Fu�ball5;

import java.util.Random;

public class Gameplay {
	
	private static final int spielzeit = 90;
	private static final int maxNachspielzeit = 5;
	private static final int maxDauerBisAktion = 10;
	
	static StringBuilder spielbericht = new StringBuilder();
	
	/**
	 * Simuliert ein Spiel.
	 * @param spiel Das zu spielende Spiel.
	 * @throws SpielAbbruchException 
	 */
	
	public static void spielen(Spiel spiel) throws SpielAbbruchException {
		spielbericht = new StringBuilder();
		Random random = new Random();
		Mannschaft offensiv;
		Mannschaft defensiv;
		// Zufällige Spieldauer festlegen
		int spielDauer = spielzeit + random.nextInt(maxNachspielzeit + 1);
		// Zufällige Spielminute für erste Aktion festlegen
		int spielMinute = 1 + random.nextInt(maxDauerBisAktion);
		do {
			// Spielabbruch überprüfen
			if (brecheSpielAb()) {
				throw new SpielAbbruchException(spielMinute);
			}
			// Ermittlung der offensiven bzw. defensiven Mannschaft
			int heimWert = ermittelMannschaftsWert(spiel.getHeim());
			int gastWert = ermittelMannschaftsWert(spiel.getGast());
			int summe = heimWert + gastWert;
			long zufall = random.nextInt(Math.round(summe + 1));
			if (zufall <= heimWert) {
				offensiv = spiel.getHeim();
				defensiv = spiel.getGast();
			}
			else {
				offensiv = spiel.getGast();
				defensiv = spiel.getHeim();
			}
			// Schütze bestimmen
			int schuetze = random.nextInt(offensiv.getKader().size());
			// Ermitteln ob Torschuss erfolgreich oder nicht
			boolean getroffen = erzieltTor(offensiv.getKader().get(schuetze), defensiv.getTorwart());
			if (getroffen) {
				offensiv.getKader().get(schuetze).addTor();
				if (offensiv == spiel.getHeim()) {
					spiel.getErgebnis().addTorHeim();
				}
				else {
					spiel.getErgebnis().addTorGast();
				}
				spiel.getSpielbericht().append(spielMinute + ": Tor von " + offensiv.getKader().get(schuetze).getName() + "!\n");
			}
			else {
				spiel.getSpielbericht().append(spielMinute + ": Schuss von " + offensiv.getKader().get(schuetze).getName() + " gehalten.\n");				
			}
			// Zufällige Spielminute für nächste Aktion festlegen
			spielMinute = spielMinute + random.nextInt(maxDauerBisAktion);
		}while(spielMinute <= spielDauer);
		spiel.getSpielbericht().append(spiel.getErgebnis());
	}
	
	/**
	 * Errechnet den aktuellen Stärkewert eine Mannschaft. 
	 * Errechnet sich aus der Spielstärke und Motivation der Mannschaft, der Erfahrung des Trainers und einem Zufallswert zwischen -3 und +3. 
	 * @return Der Stärkewert.
	 */
	private static int ermittelMannschaftsWert(Mannschaft mannschaft) {
		Random random = new Random();
		int wert = mannschaft.getStaerke() * mannschaft.getMotivation() * mannschaft.getTrainer().getErfahrung() + random.nextInt(7) - 3;
		wert = Math.max(1, wert);
		return wert;
	}
	
	/**
	 * Ermittelt, ob ein Torschuss erfolgreich ist oder nicht.
	 * @param schuetze Der Torschütze.
	 * @param torwart Der Torwart.
	 * @return Ja, wenn der Torschuss erfolgreich ist. Sonst nein.
	 */
	private static boolean erzieltTor(Spieler schuetze, Torwart torwart) {
		boolean getroffen;
		Random random = new Random();
		// Stärke des Schusses ermitteln
		int schuss = schuetze.getTorschuss() + random.nextInt(5) - 2;
		schuss = Math.max(1, schuss);
		// Stärke der Abwehr ermitteln
		int abwehr = torwart.getReaktion() + random.nextInt(5) - 2;
		abwehr = Math.max(1, abwehr);  
		// Ermitteln, ob Schütze trifft
		if (schuss > abwehr) {
			getroffen = true;
		}
		else {
			getroffen = false;
		}
		return getroffen;
	}
	
	/**
	 * Ermittelt, ob ein Spiel abgebrochen wird oder nicht.
	 * @return Ja, wenn das Spiel abgebrochen wird. Sonst nein.
	 */
	private static boolean brecheSpielAb() {
		Random random = new Random();
		boolean abbrechen = false;
		int wert1 = random.nextInt(1000);
		if (wert1 == 0) {
			abbrechen = true;
		}
		return abbrechen;
	}

}