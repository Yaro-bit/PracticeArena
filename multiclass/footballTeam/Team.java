package footballTeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Team {
	private List<Person> team;
	
    public Team() {
        this.team = new ArrayList<>();
    }
    
    public void addPerson(Person person) {
    	team.add(person);
    }
    
    
    public void showTeam() {
        for (Person person : team) {
            // Wenn die Person ein Spieler ist, gebe die Details des Spielers aus
            if (person instanceof Spieler) {
                Spieler spieler = (Spieler) person;
                System.out.println("Name: " + spieler.getName() + ", Alter: " + spieler.getAge() + 
                    ", Position: " + spieler.getPosition() + ", Rolle: " + spieler.getRole());
            } 
            // Wenn die Person ein Trainer ist, gebe die Details des Trainers aus
            else if (person instanceof Trainer) {
                Trainer trainer = (Trainer) person;
                System.out.println("Name: " + trainer.getName() + ", Alter: " + trainer.getAge() + 
                    ", Lizenznummer: " + trainer.getLizensNummer() + ", Rolle: " + trainer.getRole());
            }
        }
    }

    
}
//Liste von Spielern und ein Trainer (Verwendung von ArrayList)
//Methoden zum Hinzufügen von Spielern/Trainern
//Methode zeigeTeam(), die alle Teammitglieder ausgibt.