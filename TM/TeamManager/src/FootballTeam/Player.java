package FootballTeam;

public class Player extends Person {
	
	private String position;
	String role = "Player";
	
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
		return "Player [position=" + position + ", role=" + role + "]";
	}
}
