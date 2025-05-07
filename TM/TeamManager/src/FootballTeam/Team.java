package FootballTeam;
import java.util.ArrayList;
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
            // If the person is a player, display the player's details
            if (person instanceof Player) {
                Player player = (Player) person;
                System.out.println("Name: " + player.getName() + ", Age: " + player.getAge() + 
                    ", Position: " + player.getPosition() + ", Role: " + player.getRole());
            } 
            // If the person is a coach, display the coach's details
            else if (person instanceof Coach) {
                Coach coach = (Coach) person;
                System.out.println("Name: " + coach.getName() + ", Age: " + coach.getAge() + 
                    ", License Number: " + coach.getLicenseNumber() + ", Role: " + coach.getRole());
            }
        }
    }
}
