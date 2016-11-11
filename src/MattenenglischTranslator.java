
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class MattenenglischTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new scanner
        Scanner input = new Scanner(System.in);
        // create word variable
        String word = "";
        // make a while loop that breaks when user enters END
        while (!word.equalsIgnoreCase("END")) {
            System.out.println("Please enter a word to translate(Type END to quit the program)");
            // search for word
            word = input.nextLine();
            //if user enters END, kill program
            if (word.equalsIgnoreCase("END")) {
                break;
            }
            // always have user input in lowercase
            word = word.toLowerCase();
            // change variable for changed word
            int aPosition = word.indexOf("a");
            int ePosition = word.indexOf("e");
            int iPosition = word.indexOf("i");
            int oPosition = word.indexOf("o");
            int uPosition = word.indexOf("u");
            int yPosition = word.indexOf("y");
            // create a variable to keep track of vowels in the words
            int vowel1 = aPosition;
            // check if there is an e in the word and if it is before the vowel
            if (vowel1 == -1 || (vowel1 != -1 && ePosition != -1 && ePosition < vowel1)) {
                vowel1 = ePosition;
            }
            // check if there is an i in the word and if it is before the vowel
            if (vowel1 == -1 || (vowel1 != -1 && iPosition != -1 && iPosition < vowel1)) {
                vowel1 = iPosition;
            }
            // check if there is an o in the word and if it is before the vowel
            if (vowel1 == -1 || (vowel1 != -1 && oPosition != -1 && oPosition < vowel1)) {
                vowel1 = oPosition;
            }
            // check if there is an u in the word and if it is before the vowel
            if (vowel1 == -1 || (vowel1 != -1 && uPosition != -1 && uPosition < vowel1)) {
                vowel1 = uPosition;
            }
            // check if there is an y in the word and if it is before the vowel
            if (vowel1 == -1 || (vowel1 != -1 && yPosition != -1 && yPosition < vowel1 && !word.startsWith("y"))) {
                vowel1 = yPosition;
            }
            
            // check user word to see if it begings with a consonants
            if (vowel1 > 0) {
                // break down the word and take everything after the first vowel and move it 
                String end = word.substring(vowel1 + 1);
                // move every letter after the first vowel to the front of the word
                String begin1 = end + word.substring(0, vowel1);
                // add i to the begginign of the chnaged word
                String begin = "i" + begin1;
                // add ee to the end of the changed word
                String end2 = begin + "ee";
                // show user the final word after changes
                System.out.println(word + " in Mattenenglisch is " + end2);
            }//if the word doesn't begin with a consonant but begins with a vowel
            else {
                // manipulate the string if the word begins with a vowel
                // replace the first vowel of the word with an i
                
                String changedWord = word.replaceFirst("" + word.charAt(vowel1), "i");
                // check to see if user word ends in a vowel
                if (word.endsWith("a") || word.endsWith("e") || word.endsWith("i") || word.endsWith("o") || word.endsWith("u")) {
                    // add hee if the word ends with a vowel
                    String end = changedWord + "hee";
                    // show user changed word
                    System.out.println(word + " in Mattenenglisch is " + end);
                } // if the word ends with a consonant, add ee
                else {
                    // add ee to the end of the word
                    String end2 = changedWord + "ee";
                    // show user translated word
                    System.out.println(word + " in Mattenenglisch is " + end2);
                }
            }
        }
    }
}
