package tikTakToe;

import java.util.Scanner;

public class TikTakToe1 {
    public static void main(String[] args) {
        
        // Positioning
        char mapArray[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println("_" + mapArray[0] + "_|_" + mapArray[1] + "_|_" + mapArray[2] + "_");
        System.out.println("_" + mapArray[3] + "_|_" + mapArray[4] + "_|_" + mapArray[5] + "_");
        System.out.println(" " + mapArray[6] + " | " + mapArray[7] + " | " + mapArray[8] + " ");
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        for (int i = 0; i <= 4; i++) {
            System.out.println("\n X Please enter position: ");
            int position = myObj.nextInt();
            
            // Place 'X' in the chosen position
            switch (position) {
                case 1:
                    if (mapArray[0] != 'X' && mapArray[0] != 'O') mapArray[0] = 'X';
                    else System.out.println("Position already occupied!");
                    break;
                case 2:
                    if (mapArray[1] != 'X' && mapArray[1] != 'O') mapArray[1] = 'X';
                    else System.out.println("Position already occupied!");
                    break;
                case 3:
                    if (mapArray[2] != 'X' && mapArray[2] != 'O') mapArray[2] = 'X';
                    else System.out.println("Position already occupied!");
                    break;
                case 4:
                    if (mapArray[3] != 'X' && mapArray[3] != 'O') mapArray[3] = 'X';
                    else System.out.println("Position already occupied!");
                    break;
                case 5:
                    if (mapArray[4] != 'X' && mapArray[4] != 'O') mapArray[4] = 'X';
                    else System.out.println("Position already occupied!");
                    break;
                case 6:
                    if (mapArray[5] != 'X' && mapArray[5] != 'O') mapArray[5] = 'X';
                    else System.out.println("Position already occupied!");
                    break;
                case 7:
                    if (mapArray[6] != 'X' && mapArray[6] != 'O') mapArray[6] = 'X';
                    else System.out.println("Position already occupied!");
                    break;
                case 8:
                    if (mapArray[7] != 'X' && mapArray[7] != 'O') mapArray[7] = 'X';
                    else System.out.println("Position already occupied!");
                    break;
                case 9:
                    if (mapArray[8] != 'X' && mapArray[8] != 'O') mapArray[8] = 'X';
                    else System.out.println("Position already occupied!");
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }

            // Update the game field
            System.out.println("_" + mapArray[0] + "_|_" + mapArray[1] + "_|_" + mapArray[2] + "_");
            System.out.println("_" + mapArray[3] + "_|_" + mapArray[4] + "_|_" + mapArray[5] + "_");
            System.out.println(" " + mapArray[6] + " | " + mapArray[7] + " | " + mapArray[8] + " ");
            
            // Player O's turn
            System.out.println("\n O Please enter position: ");
            position = myObj.nextInt();
            
            switch (position) {
                case 1:
                    if (mapArray[0] != 'X' && mapArray[0] != 'O') mapArray[0] = 'O';
                    else System.out.println("Position already occupied!");
                    break;
                case 2:
                    if (mapArray[1] != 'X' && mapArray[1] != 'O') mapArray[1] = 'O';
                    else System.out.println("Position already occupied!");
                    break;
                case 3:
                    if (mapArray[2] != 'X' && mapArray[2] != 'O') mapArray[2] = 'O';
                    else System.out.println("Position already occupied!");
                    break;
                case 4:
                    if (mapArray[3] != 'X' && mapArray[3] != 'O') mapArray[3] = 'O';
                    else System.out.println("Position already occupied!");
                    break;
                case 5:
                    if (mapArray[4] != 'X' && mapArray[4] != 'O') mapArray[4] = 'O';
                    else System.out.println("Position already occupied!");
                    break;
                case 6:
                    if (mapArray[5] != 'X' && mapArray[5] != 'O') mapArray[5] = 'O';
                    else System.out.println("Position already occupied!");
                    break;
                case 7:
                    if (mapArray[6] != 'X' && mapArray[6] != 'O') mapArray[6] = 'O';
                    else System.out.println("Position already occupied!");
                    break;
                case 8:
                    if (mapArray[7] != 'X' && mapArray[7] != 'O') mapArray[7] = 'O';
                    else System.out.println("Position already occupied!");
                    break;
                case 9:
                    if (mapArray[8] != 'X' && mapArray[8] != 'O') mapArray[8] = 'O';
                    else System.out.println("Position already occupied!");
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }

            // Update the game field
            System.out.println("_" + mapArray[0] + "_|_" + mapArray[1] + "_|_" + mapArray[2] + "_");
            System.out.println("_" + mapArray[3] + "_|_" + mapArray[4] + "_|_" + mapArray[5] + "_");
            System.out.println(" " + mapArray[6] + " | " + mapArray[7] + " | " + mapArray[8] + " ");
        }
        
        myObj.close();
    }
}
