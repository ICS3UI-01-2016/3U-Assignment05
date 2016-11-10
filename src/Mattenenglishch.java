
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class Mattenenglishch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new scanner
        Scanner input = new Scanner(System.in);

        //get word
        String word = "";
        //ask for the words
        while (!word.equals("END")) {
            System.out.println("Please enter a word to translate(Type END to quit the program)");

            //scan a word
            word = input.nextLine();
            //if the word is END stop
            if (word.equals("END")) {
                break;
            }
            //lower case
            word = word.toLowerCase();

            //walk through the cahracters using a loop
            int count = 0;
            //gets the length of the word
            int length = word.length();
            //changed word
            String cword = "";

            for (int i = 0; i < length; i++) {
                //variables for beginning and ending    
                String beginning = word.substring(0, i);
                String ending = word.substring(i + 1);

                //if word ends with y and its length is less than 2
                if ((word.charAt(i) == 'y') && (word.endsWith("y") && length < 3)) {
                    cword = "i" + ending + beginning + "ee";
                    break;
                }
                //if the word start with y 
                if ((word.charAt(i) == 'y') && (word.startsWith("y"))) {
                    String beg = word.substring(0, 1);
                    String end = word.substring(i + 2);
                    cword = "i" + end + beg + "ee";
                    break;
                }
                //if y comes at the end of a consonant cluster
                if ((word.charAt(i) == 'y') && (word.endsWith("y") || word.startsWith("y"))) {
                    cword = "i" + ending + beginning + "ee";
                    break;
                }
                //if the word begin with vowel sounds and ends with vowel
                if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'y') && (word.endsWith("a") || word.endsWith("e") || word.endsWith("i") || word.endsWith("o") || word.endsWith("u") || word.endsWith("y"))) {
                    cword = "i" + ending + beginning + "hee";
                    break;
                }
                //if the word start with vowel
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                    cword = "i" + ending + beginning + "ee";
                    break;
                }
            }
            //anser the question
            System.out.println(word + " in Mattenenglish is " + cword);
        }
    }
}
