package MitarbeiterVerwaltungssystem;


public class MainMitarbeiterVerwaltungssystem {
	public static void main(String[] args) {
		
    	Manager ma1 = new Manager();
    	ma1.setName("Max Mustermann");
    	ma1.setAlter(25);
        ma1.setGehalt(2700);
        ma1.setAbteilung("Sales");
        
        Manager ma2 = new Manager();
        ma2.setName("Anna Schmidt");
        ma2.setAlter(28);
        ma2.setGehalt(2700);
        ma2.setAbteilung("Sales");
        
        Manager ma3 = new Manager();
        ma3.setName("Jonas Becker");
        ma3.setAlter(22);
        ma3.setGehalt(2000);
        ma3.setGehalt(2500);
        ma3.setAbteilung("Sales");
        
        Entwickler ma4 = new Entwickler();
        ma4.setName("Peter Müller");
        ma4.setAlter(40);
        ma4.setGehalt(3500);
        ma4.setProgrammiersprache("Java");
		
		Firma company = new Firma();
		
		company.mitarbeiterHinzufügen(ma1);
		company.mitarbeiterHinzufügen(ma2);
		company.mitarbeiterHinzufügen(ma3);
		company.mitarbeiterHinzufügen(ma4);
		
		company.zeigeMitarbeiter();
		
		
		
	}
}
//Erstelle im main() eine Firma, füge Manager und Entwickler hinzu und lasse zeigeMitarbeiter() sowie gesamtLohnkosten() ausführen.