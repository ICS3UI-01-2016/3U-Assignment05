
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gavra1870
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Scan in the word
        String word = input.nextLine();

        //convert all of the letters to lower case
        word = word.toLowerCase();

        // walk through the length of the word
        int length = word.length();

        //walk through the characters
        int count = 0;
        char ch;
        String countword = "";

        for (int i = 0; i < length; i++) {
            //variables for the beginning and ending 
            String beginning = word.substring(0, i);
            String ending = word.substring(i + 1);

            // if word ends with y and its length is less then 2
            if ((word.charAt(i) == 'y') && (word.endsWith("y") && length < 3)) {
                countword = "i" + ending + beginning + "ee";
                break;
            }
            //if the word starts with y
            if ((word.charAt(i) == 'y') && (word.startsWith("y"))) {
                String beg = word.substring(0, 1);
                String end = word.substring(i + 2);
                countword = "i" + end + beg + "ee";
                break;
            }
            //if y comes at the end of the constant cluster
            if ((word.charAt(i) == 'y') && (word.endsWith("y"))) {
                countword = "i" + ending + beginning + "hee";
                break;
            }
            // if the word begin with a vowel, the results  of the word will have a vowel at the end
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'i') {
                countword = "i" + ending + beginning + "ee";
                break;
            }
            // if the word starts with a vowel
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'i') {
                countword = "i" + ending + beginning + "ee";
                break;
            }
        }
            // the computer prints out the answer
            System.out.println(word + " in Matteneglish is " + countword);
        }
    }

