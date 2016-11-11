
import java.util.Scanner;

/*import java.util.Scanner;

 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wangk9757
 */
public class Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //scan in a word
        String word = "";
        //make it so that if they want to end, let it end
        while (!word.equalsIgnoreCase("END")) {
            System.out.println("Type End if you want to quit, otherwise, enter a word to be translated");
            word = input.nextLine();
            if (word.equalsIgnoreCase("END")) {
                System.out.println("You have quit!");
            }
            break;
        }
        //for every changed word, create a variable
        int aPosition = word.indexOf("a");
           int ePosition = word.indexOf("e");

        int iPosition = word.indexOf("i");
        
        int oPosition = word.indexOf("o");

        int uPosition = word.indexOf("u");

        int yPosition = word.indexOf("y");
          //make sure the answer is in lower case 
            word = word.toLowerCase();
        //make a variable to identify the vowel
        int firstVowel = aPosition;
        //check for all the vowels :
        // check for an e and if it comes before the a vowel
        if (firstVowel == -1 || (firstVowel != -1 && ePosition != -1 && ePosition < firstVowel)) {
            firstVowel = ePosition;
            }

            // check for an i and if it comes before the e vowel
        if (firstVowel == -1 || (firstVowel != -1 && iPosition != -1 && iPosition < firstVowel)) {
                    firstVowel = iPosition;
        }
        // check for an o and if it comes before the i vowel
        if (firstVowel == -1 || (firstVowel != -1 && oPosition != -1 && oPosition < firstVowel)) {
            firstVowel = oPosition;
        }
        // check for an u and if it comes before the o vowel
        if (firstVowel == -1 || (firstVowel != -1 && uPosition != -1 && uPosition < firstVowel)) {
            firstVowel = uPosition;
        }
        // check for a y and if it comes before the u vowel, unless the whole word begins with a y, making it a constanent 
            if ((firstVowel == -1 || (firstVowel != -1 && yPosition != -1 && yPosition < firstVowel)) && !word.startsWith("y")) {
            firstVowel = yPosition;
        }

        // check word to see if it begins with consonant
        if (firstVowel > 0) {


            // break the word down and take everything after the first vowel after the first vowel
              String ending = word.substring(firstVowel + 1);

            // move all the letters after the vowels to the front
            String beginning1 = ending + word.substring(0, firstVowel);
            // add i to the beggining of the word

            String beginning = "i" + beginning1;

            // add ee to the end of the word 
                  String ending2 = beginning + "ee";

            // output the final translation to the user
            System.out.println(word + " in Mattenenglisch is " + ending2);
        } // if the word does not begin with a consonant, it begins with a vowel
        else {


            // manipulate the string if it begins with a vowel

            // replace the first vowel with i
            

            String changedWord = word.replaceFirst("" + word.charAt(firstVowel), "i");
            // check to see if the word ends with a vowel

            if (word.endsWith("a") || word.endsWith("e") || word.endsWith("i") || word.endsWith("o") || word.endsWith("u")) {

                // add hee if the word ends with a vowel
                String ending = changedWord + "hee";
                // output the word to the user
                System.out.println(word + " in Mattenenglisch is " + ending);
            } // if it ends with a consonant add ee
              else {
                // add ee to the end of the word
                String ending2 = changedWord + "ee";
                // output the final translation to the user
                System.out.println(word + " in Mattenenglisch is " + ending2);
            }
        }
    }
}
