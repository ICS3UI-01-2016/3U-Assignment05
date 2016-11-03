
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitaa8228
 */
public class Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create scanner for user input
        Scanner input = new Scanner(System.in);
        while (true) {
            //Ask the user for a word to translate
            System.out.println("Please enter a word to translate(Type END to quit the program)");
            //Accept word to translate
            String word = input.nextLine();
            //if user inputs END end the program
            if (word.equals("END")) {
                break;
            }
            //change the first vowel to ~
            String vowelCheck = word.toLowerCase().replaceAll("[aeiou]", "~");
            //change all y's to `
            String yWordCheck = word.toLowerCase().replaceAll("y", "=");
           //Check to see if a y could be a vowel
            int yCheck = yWordCheck.indexOf("=");
            if (yCheck > 0) {
                vowelCheck = word.toLowerCase().replaceAll("y", "~");
            }
            //Check to see where the first vowel is
            int vowel = vowelCheck.indexOf("~");
            //Split up the word where the ~ would be in the original word
            String end = word.substring(vowel);
            //replace the first vowel with an i
            end = end.replaceFirst("[aeiouy]", "i");
            String begin = word.substring(0, vowel);
            //Check to see if the original word started and ended with a vowel
            if (vowelCheck.endsWith("~") && vowelCheck.startsWith("~")) {
                begin = begin + "hee";
            } else {
                begin = begin + "ee";
            }
            //Make the finished word
            String finished = end + begin;
            //Show the user the translation
            System.out.println(word + " in Mattenenglisch is " + finished.toLowerCase());
        }
    }
}
