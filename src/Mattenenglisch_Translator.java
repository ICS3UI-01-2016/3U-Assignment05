
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Mattenenglisch_Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a while loop to run and end program if the word typed is end
        while (true) {

            //Create a scanner
            Scanner input = new Scanner(System.in);

            //Tell user to input a word
            System.out.println("Please enter a word to translate(Type END to quit the program)");

            //create another variable to store value of user
            String word = input.nextLine();

            //Make a variable to store the word length
            int length = word.length();

            //if the word is end, terminate the program
            if (word.equalsIgnoreCase("end")) {
                break;
            }

            //convert sentence to all lower case
            word = word.toLowerCase();

            //**Determine if word starts with a VOWEL                
            if (word.startsWith("a") || word.startsWith("e")
                    || word.startsWith("o") || word.startsWith("u")
                    || word.startsWith("i")) {
                //starts at the beginning, goes UP TO first letter
                String beginning = "i";
                //starts at the second letter, take everything after it
                String ending = word.substring(1);
                //if *THAT* word ends with a vowel, add hee
                if (word.endsWith("a") || word.endsWith("e") || word.endsWith("o")
                        || word.endsWith("u") || word.endsWith("i") || word.endsWith("y")) {
                    //change word ending into "hee"
                    String changedWord = beginning + ending + "hee";
                } else {
                    //otherwise, add ee
                  String changedWord = beginning + ending + "ee";
                    //System outprint the word to the user
                    System.out.println("The word in Mattenenglish is " + changedWord);
                }
            }
                
            //**Determine if word starts with a CONSONANT
            if (!word.startsWith("a") || !word.startsWith("e")
                    || !word.startsWith("o") || !word.startsWith("u")
                    || !word.startsWith("i") || !word.startsWith("y")) {

                //Create an Integer variable "count"
                int count = 0;

                //Make for loop to find the first vowel in the word
                for (int v = 1; v < length; v++) {
                    //identify the letters
                    if (word.charAt(v) == ('a') || word.charAt(v) == ('e') || word.charAt(v) == ('o')
                            || word.charAt(v) == ('u') || word.charAt(v) == ('i') || word.charAt(v) == ('y')) {
                        //Begin deconstructing word
                        //Take all consonants up to the first vowel
                        String beginning = word.substring(0, v);
                        //Take the first vowel and everything after it
                        String ending = word.substring(v);
                        //divide the end into 2 chunks
                        String firstEnding = ending.substring(0, 1);
                        //change the first vowel into an 'i'
                        firstEnding = "i";
                        //now the rest of the word
                        String secondEnding = ending.substring(1);
                        //Reassemble the Word
                       String changedWord = firstEnding + secondEnding + beginning + "ee";
                        //Outprint translated word to the user
                        System.out.println("The word in Mattenenglish is " + changedWord);
                        //break the loop
                        break;
                    }
                }
            }
        }
    }
}
