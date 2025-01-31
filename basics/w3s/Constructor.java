package w3s;

public class Constructor {
	int x; // Attribute

	// a special method that is used to initialize objects
	public Constructor() { // same name as the class
		x = 5;
	}

	public static void main(String[] args) {
		Constructor myObj = new Constructor();
		System.out.println(myObj.x);
	}
}
//All classes have constructors by default
//if you do not create -  Java creates one for you