import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cowsay {

    private static final int MAX_LINE_WIDTH = 40; // Set the max width for the message

    public static void main(String[] arguments) {

        String filePath = "src/quotes.txt";
        List<String> quotes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            StringBuilder quote = new StringBuilder();
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    if (quote.length() > 0) {
                        quotes.add(quote.toString().trim());
                        quote.setLength(0);
                    }
                } else {
                    quote.append(line).append(" ");
                }
            }
            if (quote.length() > 0) {
                quotes.add(quote.toString().trim());
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Lesen der Datei: " + e.getMessage());
            return;
        }

        if (quotes.isEmpty()) {
            System.out.println("Keine Zitate in der Datei gefunden!");
            return;
        }

        String message = "";

        if (arguments.length == 0) {
            Random random = new Random();
            int randomIndex = random.nextInt(quotes.size());
            message = quotes.get(randomIndex);
        } else {
            for (int i = 0; i < arguments.length; i++) {
                message += arguments[i] + " ";
            }
        }

        // Wrap the message
        List<String> wrappedMessage = wrapMessage(message, MAX_LINE_WIDTH);

        // Print the cowsay box
        System.out.print("  ");
        for (int i = 0; i <= wrappedMessage.get(0).length() + 1; i++) {
            System.out.print("_");
        }
        System.out.println("");

        for (String line : wrappedMessage) {
            System.out.println(" < " + line + " >");
        }

        System.out.print("  ");
        for (int i = 0; i <= wrappedMessage.get(0).length() + 1; i++) {
            System.out.print("-");
        }
        System.out.println("");

        System.out.println("        \\   ^__^");
        System.out.println("         \\  (oo)\\_______");
        System.out.println("            (__)\\       )\\/\\");
        System.out.println("                ||----w |");
        System.out.println("                ||     ||");
    }

    // Method to wrap a message to the specified width
    private static List<String> wrapMessage(String message, int maxLineWidth) {
        List<String> wrappedLines = new ArrayList<>();
        String[] words = message.split(" ");

        StringBuilder currentLine = new StringBuilder();
        for (String word : words) {
            if (currentLine.length() + word.length() + 1 > maxLineWidth) {
                wrappedLines.add(currentLine.toString());
                currentLine.setLength(0); // Reset the current line
            }
            if (currentLine.length() > 0) {
                currentLine.append(" ");
            }
            currentLine.append(word);
        }

        // Add the last line if any words remain
        if (currentLine.length() > 0) {
            wrappedLines.add(currentLine.toString());
        }

        return wrappedLines;
    }
}
