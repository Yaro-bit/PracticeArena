package Bibliothekssystem2;

public class Contact {
	String name;
	String telno;
	String email;
	String adress;

	Contact() {
		name = "unbekannt";
		telno = "unbekannt";
		email = "unbekannt";
		adress = "unbekannt";
	}

	public Contact(String name, String telno, String email, String adress) {
		this.name = name;
		this.telno = telno;
		this.email = email;
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", telno=" + telno + ", email=" + email + ", adress=" + adress + "]";
	}
	
}