package basics;

/**
 * Demonstriert OOP-Konzepte:
 * - Erstellen und Referenzieren von Objekten
 * - Verwendung von Konstruktoren (Default- und parametrisiert)
 * - Konstruktor-Chaining
 * - Überschreiben der toString()-Methode
 * - Attribute und Wertebelegung
 * - Referenztypen und null-Zuweisung
 */
public class OOPConcepts {

    public static void main(String[] args) {
        // 1. Objekterstellung und Referenzen
        Car myCar = new Car(); // Standardkonstruktor
        Car otherCar = myCar; // Referenz auf dasselbe Objekt
        otherCar = null; // Ändert die Referenz, aber myCar bleibt erhalten
        System.out.println(myCar + "\n" + otherCar); // Demonstration der Referenzen
        
        // 2. Werte der Attribute lesen (Standardwerte)
        System.out.println();
        System.out.println(myCar.brand + "\n" + myCar.color + "\n" + myCar.horsePower);

        // 3. Werte der Attribute zuweisen
        System.out.println();
        System.out.println("***Wertebelegung der Attribute***");
        myCar.brand = "Audi";
        myCar.color = "BLUE";
        myCar.horsePower = 220;
        System.out.println(myCar.brand + "\n" + myCar.color + "\n" + myCar.horsePower);
        System.out.println("Class mit toString: \t" + myCar);

        // 4. Neues Objekt erstellen und Werte zuweisen
        System.out.println();
        System.out.println("***Erzeugen wir ein neues Auto***");
        Car myCar2 = new Car(); // Standardkonstruktor
        System.out.println("Ohne Werte: \t\t" + myCar2); // Standardwerte
        myCar2.brand = "BMW";
        myCar2.color = "BLACK";
        myCar2.horsePower = 145;
        System.out.println("Class mit toString: \t" + myCar2);

        // 5. Objekt mit parametrisiertem Konstruktor erstellen
        System.out.println();
        System.out.println("***Erzeugen wir ein neues Auto***");
        Car myCar3 = new Car("VW", "WHITE", 140);
        System.out.println("Class mit toString: \t" + myCar3);

        // 6. Demonstration des Konstruktor-Chaining und der Default-Werte
        System.out.println();
        System.out.println("***Verdeutlichung der Implementierung des Default-Konstruktors***");
        System.out.println("***Erzeugen wir ExamplePerson***");
        ExamplePerson person = new ExamplePerson(); // Standardkonstruktor
        System.out.println(person); // Standardwerte ausgeben
    }
}

/**
 * Klasse Car:
 * - Demonstriert Konstruktoren, Attribute und toString().
 */
class Car {
    // Attribute
    String brand;
    String color;
    int horsePower;

    // Standardkonstruktor mit Konstruktor-Chaining
    public Car() {
        this("Unbekannt", "Unlackiert", -1);
    }

    // Parametrisierter Konstruktor
    public Car(String brand, String color, int horsePower) {
        this.brand = brand;
        this.color = color;
        this.horsePower = horsePower;
    }

    // Überschreiben der toString()-Methode
    @Override
    public String toString() {
        return "Car [brand=" + brand + ", color=" + color + ", horsePower=" + horsePower + "]";
    }
}

/**
 * Klasse ExamplePerson:
 * - Demonstriert Standardwerte bei Objekten und Attributen.
 */
class ExamplePerson {
    String name;       // Standard: null
    int age;          // Standard: 0
    boolean isAdult; // Standard: false

    // Überschreiben der toString()-Methode
    @Override
    public String toString() {
        return "ExamplePerson [name=" + name + ", age=" + age + ", isAdult=" + isAdult + "]";
    }
}
