package w3s;

class AbstractTest {
	public static void main(String[] args) {
		Student myObj = new Student();

		System.out.println("Name: " + myObj.fname);
		System.out.println("Age: " + myObj.age);
		System.out.println("Grad.Year: " + myObj.gradYear);
		myObj.study();
	}
}