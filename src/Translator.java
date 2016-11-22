
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner for user input
        Scanner input = new Scanner(System.in);
        // Ask user for a word to translate
        System.out.println("Enter a word to translate (END to quit program):");
        // Store user's word
        String inWord = input.nextLine();

        // Translate word while program has not been ended
        if (!inWord.equals("END")) {

            // Create new string with all characters in lower case
            String newWord = inWord.toLowerCase();

            // Get length of word
            int wordLength = newWord.length();

            // Loop to check each character
            for (int x = 0; x < (wordLength + 1); x++) {

                // Shortcut to find first vowel
                char fV = newWord.charAt(x);

                // Part of word before first vowel

                // Part of word after first vowel

                // If word starts with y

                // If word starts with vowel

                // Else starts with consonant
            }

            // User has ended the program
        } else {
            // Program ends
        }
    }
}
