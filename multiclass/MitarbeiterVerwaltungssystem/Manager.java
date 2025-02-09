package MitarbeiterVerwaltungssystem;

public class Manager extends Mitarbeiter {
	private String abteilung;

	@Override
	public int berechneBonus() {
		int bonus = (int) (getGehalt() * 0.2);
		return bonus;
	}

	public String getAbteilung() {
		return abteilung;
	}

	public void setAbteilung(String abteilung) {
		this.abteilung = abteilung;
	}

}
//Klasse Manager (erbt von Mitarbeiter)
//Zusätzliches Attribut: abteilung (privat, mit Getter & Setter)
//Implementiert berechneBonus(): Bonus beträgt 20% des Gehalts.
