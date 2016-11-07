
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
       
        // SET-UP
        // Create scanner for user input
        Scanner input = new Scanner(System.in);

        
        // Ask user for a word to translate
        System.out.println("Enter a word to translate (END to quit program):");
        
        // Get word to translate
        String engWord = input.next();
        
        // Change word to all lower case
        engWord = engWord.toLowerCase();
        
        // CHANGE THE WORD
        // Store word in a new string
        String changeWord = engWord;
        
        // Does word contain "y"?
            // If starts with y, consonant
            // else if vowel
        
        // Does word begin with consonant sound?
        
            // Move all consonants up to first vowel (a, e, i, o, u, sometimes y)
            // Add suffix -ee
            // Change first vowel to i
        // Does word begin with vowel sound?
            // Add suffix -ee if ends in consonant
            // Add suffix -hee if ends in vowel
            // Change the first vowel into i
        
    }
}
