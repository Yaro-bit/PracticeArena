package footballTeam;

public class Spieler extends Person{
	
	private String position;
	String role = "Spieler";
	
	
	@Override
	public String getRole() {
		return role;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	@Override
	public String toString() {
		return "Spieler [position=" + position + ", role=" + role + "]";
	}
	
	
}
//Klasse Spieler (erbt von Person)
//Zusätzliches Attribut: position (privat, mit Getter & Setter)
//Implementiert getRole(), gibt "Spieler" zurück.