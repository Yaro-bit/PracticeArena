package FootballTeam;

public class MainFootballTeam {

    public static void main(String[] args) {
        // Creating players
        Player player1 = new Player();
        player1.setName("Max Mustermann");
        player1.setAge(25);
        player1.setPosition("Striker");
        
        Player player2 = new Player();
        player2.setName("Anna Schmidt");
        player2.setAge(28);
        player2.setPosition("Midfield");
        
        Player player3 = new Player();
        player3.setName("Jonas Becker");
        player3.setAge(22);
        player3.setPosition("Defender");

        // Creating a coach
        Coach coach = new Coach();
        coach.setName("Peter Müller");
        coach.setAge(40);
        coach.setLicenseNumber("T12345");

        // Creating the team and adding the individuals
        Team team = new Team();
        team.addPerson(player1);
        team.addPerson(player2);
        team.addPerson(player3);
        team.addPerson(coach);

        // Displaying the entire team
        team.showTeam();
    }
}
