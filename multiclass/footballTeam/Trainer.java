package footballTeam;

public class Trainer extends Person {
	private String lizensNummer;
	String role = "Trainer";

	public String getRole() {
		return role;
	}

	public String getLizensNummer() {
		return lizensNummer;
	}

	public void setLizensNummer(String lizensNummer) {
		this.lizensNummer = lizensNummer;
	}

	@Override
	public String toString() {
		return "Trainer [lizensNummer=" + lizensNummer + ", role=" + role + "]";
	}
	

}
//Klasse Trainer (erbt von Person)
//Zusätzliches Attribut: lizenzNummer (privat, mit Getter & Setter)
//Implementiert getRole(), gibt "Trainer" zurück.
