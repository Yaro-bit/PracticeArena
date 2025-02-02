package footballTeam;

public class MainFootballTeam {

    public static void main(String[] args) {
        // Erstellen von Spielern
        Spieler spieler1 = new Spieler();
        spieler1.setName("Max Mustermann");
        spieler1.setAge(25);
        spieler1.setPosition("Stürmer");
        
        Spieler spieler2 = new Spieler();
        spieler2.setName("Anna Schmidt");
        spieler2.setAge(28);
        spieler2.setPosition("Mittelfeld");
        
        Spieler spieler3 = new Spieler();
        spieler3.setName("Jonas Becker");
        spieler3.setAge(22);
        spieler3.setPosition("Verteidiger");

        // Erstellen eines Trainers
        Trainer trainer = new Trainer();
        trainer.setName("Peter Müller");
        trainer.setAge(40);
        trainer.setLizensNummer("T12345");

        // Erstellen des Teams und Hinzufügen der Personen
        Team team = new Team();
        team.addPerson(spieler1);
        team.addPerson(spieler2);
        team.addPerson(spieler3);
        team.addPerson(trainer);

        // Ausgabe des gesamten Teams
        team.showTeam();
    }
}
