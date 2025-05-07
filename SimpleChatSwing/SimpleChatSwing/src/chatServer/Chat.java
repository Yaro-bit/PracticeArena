package chatServer;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;


public class Chat extends UnicastRemoteObject implements ChatInterface{
	private String name;
	private ChatInterface client = null;
	
	public Chat(String name) throws
	RemoteException {
		this.name=name;
		
	}
	
	public String getName() throws RemoteException{
		return this.name;
	}
	
	public void setClient(ChatInterface client) {
		this.client = client;
	}
	
	public ChatInterface getClient() {
		return this.client;
	}

	@Override
	public void send(String msg) throws RemoteException {
	    if (client != null) {
	        client.send(msg); // Nachricht an den Client weiterleiten
	    } else {
	        System.out.println(name + ": " + msg); // Falls kein Client verbunden ist, Nachricht lokal ausgeben
	    }
	}
}