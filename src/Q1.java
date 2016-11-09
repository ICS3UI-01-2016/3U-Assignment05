
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
        
        // Create string for user's word
        String engWord = input.nextLine();
        
        // Identify characters that are vowels
        char vowel = 'a';
        
        // User has input a word, translate it
        while(!engWord.equals("END")){
            
            // Set all characters to lower case
            String changeWord = engWord.toLowerCase();
            
            // Does word contain y
      
                // if y at beginning, a consonant
            
                // else not at beginning, a vowel
            
            // Does word start with vowel
            
                // change first vowel to 'i'
            
            // Word starts with consonant
            
            // Word ends in vowel
            
            // Word ends in consonant
            
            https://docs.oracle.com/javase/tutorial/java/data/manipstrings.html
        }
    }
}
