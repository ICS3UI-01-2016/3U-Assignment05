
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schum0689
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create scanner for input
        Scanner input = new Scanner(System.in);
        
        // Scan a word
        String word = input.nextLine();
        
        // Make sure the input is lower case
        word = word.toLowerCase();
        
        // MAKE SOME CHANGES
        // Make sure to store in a new string
        String changeWord = word.replaceFirst("a", "@");
        
        // Find the first l
        int lPosition = changeWord.indexOf("l");

        if (lPosition != -1){
            // Breaking the String apart
            // Starts at the beginning, goes UP TO the L
            String beginning = changeWord.substring(0, lPosition);
            // Starts at l, take away after it
            String ending = changeWord.substring(lPosition);
            // Reassemble
            changeWord = ending + beginning + "ay";
        }
        
        // Check if the word typed out is "hello"
        if (word.equals("Hello") || word.equals ("hello")){
            System.out.println("Hi there!");
        }
        
        // Get the length of the word
        int length = word.length();
        // Walk through the characters using a loop
        int count = 0;
        for (int i = 0; i < length; i++){
            // Look at the character
            // Is the character an L
            if (word.charAt(i) == 'l'){
                // or count + 1
                // count it!
                count++;
            }
        }
        System.out.println("The L is at position " + lPosition);
        System.out.println("The word is " + changeWord);
        System.out.println("There are " + count + " Ls.");
    }
}
