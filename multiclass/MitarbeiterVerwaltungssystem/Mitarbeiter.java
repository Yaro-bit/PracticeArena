package MitarbeiterVerwaltungssystem;

abstract class Mitarbeiter {
	String name;
	int alter;
	int gehalt;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}

	public int getGehalt() {
		return gehalt;
	}

	public abstract int berechneBonus();
}
//Abstrakte Klasse Mitarbeiter
//Attribute: name, alter, gehalt (privat, mit Getter & Setter)
//Abstrakte Methode berechneBonus(), die den Bonus des Mitarbeiters berechnet.