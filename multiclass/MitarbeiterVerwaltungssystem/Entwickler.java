package MitarbeiterVerwaltungssystem;

public class Entwickler extends Mitarbeiter {
	String programmiersprache;

	@Override
	public int berechneBonus() {
		int bonus = (int) (getGehalt() * 0.15);
		return bonus;
	}

	public String getProgrammiersprache() {
		return programmiersprache;
	}

	public void setProgrammiersprache(String programmiersprache) {
		this.programmiersprache = programmiersprache;
	}

}
//Klasse Entwickler (erbt von Mitarbeiter)
//Zusätzliches Attribut: programmiersprache (privat, mit Getter & Setter)
//Implementiert berechneBonus(): Bonus beträgt 15% des Gehalts.
