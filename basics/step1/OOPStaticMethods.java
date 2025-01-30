package step1;

public class OOPStaticMethods {

	public static void main(String[] args) {
        // Aufruf einer statischen Methode ohne Erstellen eines Objekts
        StaticExample.generateInfo();
        System.out.println();
        
        // Erstellen eines Objekts und Aufruf einer Instanzmethode
        StaticExample example = new StaticExample();
        System.out.println(example.objectMethod());
        System.out.println();
        
        // Zugriff auf die statische Variable direkt über die Klasse
        System.out.println("Static variable: " + StaticExample.staticInfo);
	}
}
	class StaticExample {
		
		static String staticInfo = "Class wide Info";
		
		static String generateInfo() {
			System.out.println("static methods can be cancelled without "+
								"creating objects");
			return "Special Information";
		}
	String objectMethod() {
		System.out.println("objects methoids must be called on objects");
		System.out.println("static methods/variables are acessible");
		return staticInfo;
		}
	}