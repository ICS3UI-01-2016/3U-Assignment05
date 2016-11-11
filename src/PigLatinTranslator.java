
import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayyaf3300
 */
public class PigLatinTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // create a scanner for the input
        Scanner input = new Scanner(System.in);
        // tell the user to enter the input
        String word = "";
        // loop the program until the user decides to type in "END"
        while (!word.equalsIgnoreCase("END")) {
            // ask the user to input the word they wish to enter
            System.out.println("Please enter a word to translate(Type END to quit the program): ");
            // scan in a word
            word = input.nextLine();
            // if they type in "END" then break the program
            if (word.equalsIgnoreCase("END")) {
                break;
            }
            // the word must be in lowercase
            word = word.toLowerCase();
            // create a variable for each vowel
            int aPosition = word.indexOf("a");
            int ePosition = word.indexOf("e");
            int iPosition = word.indexOf("i");
            int oPosition = word.indexOf("o");
            int uPosition = word.indexOf("u");
            int yPosition = word.indexOf("y");
            // create a variable for the beginning of the word
            int beginningvowel = aPosition;
            // check if there is an e and if it comes before the a vowel
            if (beginningvowel == -1 || (beginningvowel != -1 && ePosition != -1 && ePosition < beginningvowel)) {
                beginningvowel = ePosition;
            }
            // check if there is an i and if it comes before the e vowel
            if (beginningvowel == -1 || (beginningvowel != -1 && iPosition != -1 && iPosition < beginningvowel)) {
                beginningvowel = iPosition;
            }
            // check if there is an o and if it comes before the i vowel
            if (beginningvowel == -1 || (beginningvowel != -1 && oPosition != -1 && oPosition < beginningvowel)) {
                beginningvowel = oPosition;
            }
            // check if there is an u and if it comes before the o vowel
            if (beginningvowel == -1 || (beginningvowel != -1 && uPosition != -1 && uPosition < beginningvowel)) {
                beginningvowel = uPosition;
            }
            // check if there is a y and if it comes before the u vowel, but also make sure the word is a constant (if it starts with y)
            if ((beginningvowel == -1 || (beginningvowel != -1 && yPosition != -1 && yPosition < beginningvowel)) && !word.startsWith("y")) {
                beginningvowel = yPosition;
            }
            // check the word to see if it starts with a constant
            if (beginningvowel > 0) {
                // break down the word and take everything after the beginning vowel
                String end = word.substring(beginningvowel + 1);
                // move all the letters after the vowels to the front
                String start = end + word.substring(0, beginningvowel);
                // add i to the beggining of the word
                String beginning = "i" + start;
                // add ee to the end of the word
                String end2 = beginning + "ee";
                // give the user the final translation
                System.out.println(word + " in Mattenenglisch is " + end2);
            } // it begins with a vowel if nit a constant
            else {
                // work the string if it begins with a vowel
                // replace the first vowel with an i
                String newword = word.replaceFirst("" + word.charAt(beginningvowel), "i");
                // check if the word ends with a vowel
                if (word.endsWith("a") || word.endsWith("e") || word.endsWith("i") || word.endsWith("o") || word.endsWith("u")) {
                    // add hee to the word if it ends with a vowel
                    String end = newword + "hee";
                    // give the user the finished word
                    System.out.println(word + " in Mattenenglisch is " + end);
                } // if the word ends with a constant add "ee"
                else {
                    // add "ee" to the end of the word
                    String end2 = newword + "ee";
                    // give the user the final word
                    System.out.println(word + " in Mattenenglisch is " + end2);
                }
            }
        }
    }
}