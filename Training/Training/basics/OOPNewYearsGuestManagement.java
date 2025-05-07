package basics;

public class OOPNewYearsGuestManagement {

    public static void main(String[] args) {
        GuestManagementApplication app = new GuestManagementApplication();

        System.out.println("Filter nach Name (Anna):");
        app.filterByName("Anna");

        System.out.println("\nFilter nach Gruppengröße (größer als 2):");
        app.filterByGroupNumber(2);
    }
}

class GuestManagementApplication {
    // Liste der Gäste
    Guest[] guests = new Guest[] { 
        new Guest("Anna", 3, "Vegan"), 
        new Guest("Peter", 2, "Vegetarian"),
        new Guest("Maria", 5, "None"), 
        new Guest("John", 4, "Vegan"), 
        new Guest("Sophia", 1, "Gluten-Free"),
        new Guest("Lucas", 3, "None"), 
        new Guest("Emma", 2, "Vegetarian") 
    };

    // Filtert Gäste anhand ihres Namens
    void filterByName(String name) {
        for (int i = 0; i < guests.length; i++) {
            Guest currentGuest = guests[i];
            if (currentGuest.name.equals(name)) {
                System.out.println(currentGuest);
            }
        }
    }

    // Filtert Gäste, deren Gruppengröße größer als ein bestimmter Wert ist
    void filterByGroupNumber(int groupNumber) {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i].groupNumber > groupNumber) {
                System.out.println(guests[i]);
            }
        }
    }
}

class Guest {
    String name;         
    int groupNumber;     
    String foodSpec;     

    // Standard-Konstruktor
    public Guest() {
        this("Unbekannt", 0, "Unbekannt");
    }

    // Konstruktor mit Parametern
    Guest(String name, int groupNumber, String foodSpec) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.foodSpec = foodSpec;
    }

    // Ausgabe der Gast-Details
    @Override
    public String toString() {
        return "Guest [name=" + name + ", groupNumber=" + groupNumber + ", foodSpec=" + foodSpec + "]";
    }
}


//Aufgabe: SilvesterPartyManagementApp
//Erstelle eine Java-Anwendung, um eine Gästeliste für eine Silvesterparty zu verwalten.
//Anforderungen:
//
//    Filter nach Name: Finde Gäste mit einem bestimmten Namen.
//    Filter nach Gruppengröße: Zeige alle Gäste, deren Gruppengröße mindestens X beträgt.
//    Gast-Details: Jeder Gast hat:
//        Name (z. B. "Anna")
//        Gruppengröße (z. B. 3)
//        Ernährungswunsch (z. B. "Vegan")
//
//Aufgaben:
//    Implementiere die Filtermethoden filterByName und filterByGroupSize.
//    Teste mit einer Gästeliste (Guest[]) mit mindestens 5 Gästen.
//    Erstelle eine toString()-Methode für die Ausgabe der Gast-Details.
//
//Tipps:
//    Nutze for-each-Schleifen und String.equals() für die Filter.
//    Testaufrufe der Methoden sollten in der main-Methode erfolgen.