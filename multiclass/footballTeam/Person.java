package footballTeam;

abstract class Person {

	private String name;
	private int age;

	public abstract String getRole();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	class Role extends Person {
		public String role;
		public String getRole() {
			return role;
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}

//Abstrakte Klasse Person
//Attribute: name, alter (privat, mit Getter & Setter)
//Abstrakte Methode getRole(), die die Rolle der Person zurückgibt.