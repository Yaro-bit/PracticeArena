//Bewertung: 9/10 Punkten

//    -0.5: Schleifen sollten von 100 bis 999 laufen, um effizienter zu sein.
//   -0.5: Kleinere Lesbarkeitsprobleme (z. B. prod in product umbenennen, {} für Klarheit nutzen).

package step1;

public class Palindrome {
    public static void main(String[] args) {
        int largestPalindrome = 0;  // To keep track of the largest palindrome found

        for (int x = 1; x < 999; x++) {
            for (int y = 1; y < 999; y++) {
                int prod = x * y;

                // Calculate the reverse of the product
                int reversedNum = 0;
                int num = prod;

                while (num != 0) {
                    reversedNum = reversedNum * 10 + num % 10;
                    num = num / 10;
                }

                // Check if the product is a palindrome
                if (prod == reversedNum) {
                    if (prod > largestPalindrome) {
                        largestPalindrome = prod;  // Update largest palindrome
                    }
                }
            }
        }
        
        System.out.println("The largest palindrome is: " + largestPalindrome);
    }
}
