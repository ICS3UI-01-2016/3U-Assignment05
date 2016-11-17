
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner for user input
        Scanner input = new Scanner(System.in);

        // Ask user for a word to translate
        System.out.println("Enter a word to translate (END to quit program):");

        // Store user's word
        String engWord = input.nextLine();

        // Translate user's word while they have not ended the program
        while (!engWord.equals("END")) {

            // Store engWord in new string with all characters in lower case
            String changeWord = engWord.toLowerCase();

            // Get the length of changeWord
            int wordLength = changeWord.length();

            // Cycle through each character to find the first vowel
            for (int firstVowel = 0; firstVowel < wordLength; firstVowel++) {

                // Variable for first half of word before firstVowel
                String firstHalf = changeWord.substring(0, firstVowel);

                // Variable for second half of word after firstVowel
                String secondHalf = changeWord.substring(2);

                // Create shortcut for finding the first vowel (fV)
                char fV = changeWord.charAt(firstVowel);

                // If word starts with y, find first vowel 
                if (changeWord.startsWith("y") && (fV == 'a' || fV == 'e' || fV == 'i' || fV == 'o' || fV == 'u')) {
                    // Put word back together
                    changeWord = "i" + secondHalf + firstHalf + "ee";
                    // Changes are complete; end this loop
                    break;
                }

                // Output the translation to user
                System.out.println(engWord + " in Mattenenglisch is " + changeWord);
                // End loop
                break;
            }
            // User has ended the program
            if (engWord.equals("END")) {
                // No action; program ends
            }
        }
    }
}
// Does word start with vowel
// Word starts with consonant or y
// Word ends in vowel
// Word ends in consonant
