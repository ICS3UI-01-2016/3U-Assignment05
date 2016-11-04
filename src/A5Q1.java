
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner for input
        Scanner input = new Scanner(System.in);

        // scan in a word
        String word = input.nextLine();
        word = word.toLowerCase();

        int length = word.length();



        if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i")
                || word.startsWith("o") || word.startsWith("u")) {
            String beginning = "i";
            String ending = word.substring(1);
            if (word.endsWith("a") || word.endsWith("e") || word.endsWith("i")
                    || word.endsWith("o") || word.endsWith("u")) {
                word = beginning + ending + "hee";

            } else {
                word = beginning + ending + "ee";
            }
            System.out.println(word);
            

        }
        if (!word.startsWith("a") || !word.startsWith("e") || !word.startsWith("i")
                || !word.startsWith("o") || !word.startsWith("u")) {
            int count = 0;
            for (int i = 0; i < length; i++) {
                // look at the character
                if (word.charAt(i) == ('a') || word.charAt(i) == ('e')
                        || word.charAt(i) == ('i') || word.charAt(i) == ('o')
                        || word.charAt(i) == ('u')) {
                    String middle = word.substring(i);
                    String firstL = middle.substring(0, 1);
                    firstL = "i";
                    String rest = middle.substring(1);
                    String beginning = word.substring(0, i);
                    word = firstL + rest + beginning + "ee";
                    System.out.println(word);

                    // count it!
                    count = count + 1;
                    break;






                }
            }
        }
    }
}