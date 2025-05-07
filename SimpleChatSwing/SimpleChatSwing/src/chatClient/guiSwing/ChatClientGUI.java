package chatClient.guiSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

public class ChatClientGUI extends JFrame {
    private JTextArea chatArea; // Bereich für den Chatverlauf
    private JTextField messageField; // Eingabefeld für Nachrichten
    private Socket socket;
    private PrintWriter writer;
    private BufferedReader reader;

    public ChatClientGUI(String serverAddress, int port) {
        try {
            // Verbindung zum Server herstellen
            socket = new Socket(serverAddress, port);
            writer = new PrintWriter(socket.getOutputStream(), true);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Verbindung zum Server fehlgeschlagen!", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        // GUI erstellen
        setTitle("Chat Client");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        chatArea = new JTextArea();
        chatArea.setEditable(false); // Der Benutzer kann den Chatverlauf nicht bearbeiten
        JScrollPane scrollPane = new JScrollPane(chatArea);

        messageField = new JTextField();
        messageField.addActionListener(new ActionListener() { // Nachricht senden bei Enter-Taste
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = messageField.getText();
                writer.println(message); // Nachricht an den Server senden
                chatArea.append("You: " + message + "\n"); // Nachricht lokal anzeigen
                messageField.setText(""); // Eingabefeld leeren
            }
        });

        add(scrollPane, BorderLayout.CENTER);
        add(messageField, BorderLayout.SOUTH);

        setVisible(true);

        // Thread starten, um Nachrichten vom Server zu empfangen
        new Thread(() -> {
            try {
                String serverMessage;
                while ((serverMessage = reader.readLine()) != null) {
                    chatArea.append("Server: " + serverMessage + "\n");
                }
            } catch (IOException ex) {
                chatArea.append("[System] Verbindung zum Server verloren.\n");
            }
        }).start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ChatClientGUI("localhost", 8888)); // Lokaler Server auf Port 5000
    }
}