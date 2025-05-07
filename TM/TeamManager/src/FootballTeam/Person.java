package FootballTeam;

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

// Abstract class Person
// Attributes: name, age (private, with getter & setter)
// Abstract method getRole(), which returns the role of the person.
