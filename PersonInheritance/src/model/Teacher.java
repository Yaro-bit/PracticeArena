package model;

public class Teacher extends Person {
	String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
	}

public void introduce() {
	System.out.println("Hello my name is " + name + ", I am " + age + " and I teach" + subject+".");

}
}