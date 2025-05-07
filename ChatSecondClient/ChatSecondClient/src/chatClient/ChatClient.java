package chatClient;

import java.rmi.Naming;
import java.util.Scanner;

import chatServer.Chat;
import chatServer.ChatInterface;

public class ChatClient {
	public static void main(String[] args) {
        try {
            System.setProperty("java.security.policy", "file:./security.policy");
   

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = scanner.nextLine().trim();

            ChatInterface client = new Chat(name);
            ChatInterface server = (ChatInterface) Naming.lookup("rmi://localhost:8888/Chat");

            server.setClient(client);

            System.out.println("[System] Connected to chat server.");
            while (true) {
                String msg = scanner.nextLine().trim();
                server.send("[" + client.getName() + "] " + msg);
            }
        } catch (Exception e) {
            System.out.println("[System] Client error: " + e);
        }
    }
}
