package basics;

public class Methods {
	static void myStaticMethod() { // static without creating object
		System.out.println("Das ist mein \"static\" Method");
	}

	public void myPublicMethod() {// public only with creating object of the class
		System.out.println("Das ist mein \"public\" Method");
	}

	public static void main(String[] args) {
		myStaticMethod();

		Methods met = new Methods();
		met.myPublicMethod();
	}
}
