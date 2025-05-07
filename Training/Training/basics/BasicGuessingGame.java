package basics;



import java.util.Scanner;

public class BasicGuessingGame {

	public static void main(String[] args) {
		boolean game = true;
		Scanner scan = new Scanner(System.in); // Create a Scanner object

		while (game == true) {
			System.out.println("please gues number from 1-10:");
			int num = (int)(Math.random() * 10); 
			int gues = scan.nextInt(); // Read user input
			
			if(num==gues) {
				System.out.println("Yeah you won!");

			}else {
				System.out.println("Sorry you loose!");
			}
            // Consume the leftover newline character
            scan.nextLine();
            
			System.out.println("You want to retry (yes/no)?");
			String yesNo = scan.nextLine();
			
			if (yesNo.equals("yes")) {
				game = true;
			} else if (yesNo.equals("no")) {
				game = false;
			} else {
				System.out.println("Wrong entry \nYou want to retry (yes/no)?");
				yesNo = scan.nextLine(); // Read user input
				scan.close();
			}

		}

	}

}
