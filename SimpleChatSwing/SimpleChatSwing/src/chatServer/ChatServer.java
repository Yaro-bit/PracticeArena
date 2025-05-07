package chatServer;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;


public class ChatServer {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter server name:");
			String name = scanner.nextLine().trim();
			
			
			Chat server = new Chat(name);
            Registry registry = LocateRegistry.createRegistry(8888);
            registry.bind("Chat", server);
			
			System.out.println("[System] Server is ready.");
			
		}catch (Exception e) {
            System.out.println("[System] Server failed: " + e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
