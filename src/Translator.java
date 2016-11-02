
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
        //Ask the user for a word to translate
        System.out.println("Please enter a word to translate(Type END to quit the program)");
        //Accept word to translate
        String word = input.nextLine();
        //change the first vowel to ~
        String vowelCheck = word.toLowerCase().replaceAll("[aeiou]", "~");
        //find where the ~ is
        int idk = vowelCheck.indexOf("~");
        //Split up the word where the ~ would be in the original word
        String end = word.substring(idk);
        //Ch
        end = end.replaceFirst("[aeiou]", "i");
        String begin = word.substring(0, idk);
        //Check to see if the original word started and ended with a vowel
        if (vowelCheck.endsWith("~")&&vowelCheck.startsWith("~")) {
            begin = begin + "hee";
        } else {
            begin = begin + "ee";
        }
        String finished = end + begin;
        System.out.println(vowelCheck);
        System.out.println(idk);
        System.out.println(end);
        System.out.println(begin);
        System.out.println(finished);
    }
}
