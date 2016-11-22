
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
                String firstHalf = newWord.substring(0, x);

                // Part of word after first vowel
                String secondHalf = newWord.substring(x + 1);

                // If word starts with y, find first vowel
                if (newWord.startsWith("y") && (fV == 'a' || fV == 'e' || fV == 'i' || fV == 'o' || fV == 'u')) {
                    // Put word together
                    newWord = "i" + secondHalf + firstHalf + "ee";
                }
                
                // For vowel and consonant starting words, find first vowel
                if (fV == 'a' || fV == 'e' || fV == 'i' || fV == 'o' || fV == 'u' || fV == 'y') {
                    // If word ends in a vowel
                    // Put word together

                    // If word ends in consonant
                    // Put word together
                    newWord = "i" + secondHalf + firstHalf + "ee";
                }
            }
            // Output translation to user
            System.out.println(inWord + " in Mattenenglisch is " + newWord);

        // User has ended the program
        } else {
            // Program ends
        }
    }
}
