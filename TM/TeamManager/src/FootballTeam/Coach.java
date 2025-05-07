package FootballTeam;

public class Coach extends Person {
	private String licenseNumber;
	String role = "Coach";

	public String getRole() {
		return role;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	@Override
	public String toString() {
		return "Coach [licenseNumber=" + licenseNumber + ", role=" + role + "]";
	}
}
