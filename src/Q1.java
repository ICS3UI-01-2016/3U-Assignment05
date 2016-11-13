
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
        
        // Ask user for an english word to translate
        System.out.println("Enter a word to translate (END to quit program):");
        
        // Store user's english word
        String engWord = input.nextLine();

        // Translate user's word while they have not ended the program
        while (!engWord.equals("END")) {
            
            // Store engWord in new string with all characters in lower case
            String changeWord = engWord.toLowerCase();

            // Get the length of changeWord
            int wordLength = changeWord.length();
    
            // Check each character in the word
            for (int i = 0; i < wordLength; i++) {
                
                // Create shortcut for finding a specific char in word
                char findChar = changeWord.charAt(i);

                // Variable for first half of word (before first vowel)
                String firstHalf = changeWord.substring(0, i);
                
                // Variable for second half of word (after first vowel)
                String secondHalf = changeWord.substring(i);
                
                if((findChar == 'a' || findChar == 'e' || findChar == 'i' || findChar == 'o' || findChar == 'u') && changeWord.startsWith("y")){
                    changeWord = "i" + secondHalf + firstHalf + "ee";
                    break;
                }
            }


            // Output the translation to user
            System.out.println(engWord + " in Mattenenglisch is " + changeWord);
            break;
        }
        // User has ended the program
        if (engWord.equals("END")) {
            // No action; program ends
        }
    }
}

// Does word start with vowel
// change first vowel to 'i'
// Word starts with consonant
// Word ends in vowel
// Word ends in consonant
