
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manok5757
 */
public class MattenenglischTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner for input
        Scanner input = new Scanner(System.in);
        // ask the user for input 
        
        String word = "";
        // make the program loop until they press end
        while (!word.equalsIgnoreCase("END")) {
        System.out.println("Please enter a word to translate(Type END to quit the program): ");
        // scan in a word
         word = input.nextLine();

        // make sure the input is lowercase
        word = word.toLowerCase();
       
            // make changes to a word if it begins with a constant
            if (!word.startsWith("a") || !word.startsWith("e") || !word.startsWith("i")
                    || !word.startsWith("o") || !word.startsWith("u") || (word.length() > 1 && !word.startsWith("y"))) {

                // create variable for changed word 

                int aPosition = word.indexOf("a");
                int ePosition = word.indexOf("e");
                int iPosition = word.indexOf("i");
                int oPosition = word.indexOf("o");
                int uPosition = word.indexOf("u");
                int yPosition = word.indexOf("y");

                // create a variable to keep track of the first vowel in the word
                int firstVowel = aPosition;

                // check if there is an e and if it comes before the a vowel
                if (firstVowel == -1 || (firstVowel != -1 && ePosition != -1 && ePosition < firstVowel)) {
                    firstVowel = ePosition;
                }

                // check if there is an i and if it comes before the e vowel
                if (firstVowel == -1 || (firstVowel != -1 && iPosition != -1 && iPosition < firstVowel)) {
                    firstVowel = iPosition;
                }
                // check if there is an o and if it comes before the i vowel
                if (firstVowel == -1 || (firstVowel != -1 && oPosition != -1 && oPosition < firstVowel)) {
                    firstVowel = oPosition;
                }
                // check if there is an u and if it comes before the o vowel
                if (firstVowel == -1 || (firstVowel != -1 && uPosition != -1 && uPosition < firstVowel)) {
                    firstVowel = uPosition;
                }
                // check if there is a y and if it comes before the u vowel
                if (firstVowel == -1 || (firstVowel != -1 && yPosition != -1 && yPosition < firstVowel)) {
                    firstVowel = yPosition;
                }
               
               
                
                // break the word down and take everything after the first vowel after the first vowel
                String ending = word.substring(firstVowel + 1);
                // add i to the beggining of the word
                 String beginning1 =  ending + word.substring(0, firstVowel);
                String beginning = "i"+beginning1;
                // add ee to the end of the word
                String ending2 = beginning+"ee";
                
                // output the final translation to the user
                System.out.println(word + "in Mattenenglisch is " + ending2);
                
                















            }

        }
    }
}
