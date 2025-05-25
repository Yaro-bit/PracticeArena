package model;

public class Student extends Person {
	String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

	public void introduce() {
		System.out.println("Hello my name is " + name + ", I am " + age + " years old, and I study at" + university);
	}
}
