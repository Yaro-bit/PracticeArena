package tikTakToe;

import java.util.Scanner;

public class TikTakToe2 {
    public static void main(String[] args) {
        
        // Positioning
        char mapArray[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        printBoard(mapArray);
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int turnCounter = 0;

        while (turnCounter < 9) {
            // X's turn
            System.out.println("\n X Please enter position: ");
            int position = myObj.nextInt();
            if (makeMove(mapArray, position, 'X')) {
                printBoard(mapArray);
                if (checkWinner(mapArray, 'X')) {
                    System.out.println("X wins!");
                    break;
                }
                turnCounter++;
            }

            // O's turn
            if (turnCounter < 9) {
                System.out.println("\n O Please enter position: ");
                position = myObj.nextInt();
                if (makeMove(mapArray, position, 'O')) {
                    printBoard(mapArray);
                    if (checkWinner(mapArray, 'O')) {
                        System.out.println("O wins!");
                        break;
                    }
                    turnCounter++;
                }
            }
        }

        if (turnCounter == 9) {
            System.out.println("It's a tie!");
        }

        myObj.close();
    }

    public static boolean makeMove(char[] mapArray, int position, char symbol) {
        if (position < 1 || position > 9 || mapArray[position - 1] == 'X' || mapArray[position - 1] == 'O') {
            System.out.println("Invalid or already occupied position. Please try again.");
            return false;
        }
        mapArray[position - 1] = symbol;
        return true;
    }

    public static void printBoard(char[] mapArray) {
        System.out.println("_" + mapArray[0] + "_|_" + mapArray[1] + "_|_" + mapArray[2] + "_");
        System.out.println("_" + mapArray[3] + "_|_" + mapArray[4] + "_|_" + mapArray[5] + "_");
        System.out.println(" " + mapArray[6] + " | " + mapArray[7] + " | " + mapArray[8] + " ");
    }

    public static boolean checkWinner(char[] mapArray, char symbol) {
        // Winning conditions
        return (mapArray[0] == symbol && mapArray[1] == symbol && mapArray[2] == symbol) || // Top row
               (mapArray[3] == symbol && mapArray[4] == symbol && mapArray[5] == symbol) || // Middle row
               (mapArray[6] == symbol && mapArray[7] == symbol && mapArray[8] == symbol) || // Bottom row
               (mapArray[0] == symbol && mapArray[3] == symbol && mapArray[6] == symbol) || // Left column
               (mapArray[1] == symbol && mapArray[4] == symbol && mapArray[7] == symbol) || // Center column
               (mapArray[2] == symbol && mapArray[5] == symbol && mapArray[8] == symbol) || // Right column
               (mapArray[0] == symbol && mapArray[4] == symbol && mapArray[8] == symbol) || // Diagonal
               (mapArray[2] == symbol && mapArray[4] == symbol && mapArray[6] == symbol);   // Diagonal
    }
}
