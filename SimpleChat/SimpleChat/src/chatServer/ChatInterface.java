package chatServer;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatInterface extends Remote {
    String getName() throws RemoteException;
    void send(String msg) throws RemoteException;
    void setClient(ChatInterface client) throws RemoteException;
    ChatInterface getClient() throws RemoteException;
}