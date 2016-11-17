
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

        // Translate user's word while they have not ended the program
        if (!inWord.equals("END")){
           
            // Store word in new string with all characters in lower case
           String newWord = inWord.toLowerCase();
           
           // Get the length of word
           int wordLength = newWord.length();
           
           
           
        // User has ended the program
        }else{
            
        }
    }
}
