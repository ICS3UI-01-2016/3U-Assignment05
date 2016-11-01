
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baayl3669
 */
public class Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the input for the user
        Scanner in = new Scanner(System.in);

        // make a string for the word
        String word = "";

        // make a while loop to ask for words to translate
        while (!word.equals("END")) {
            System.out.println("Please enter a word to translate(Type END to quit the program): ");
            word = in.nextLine();
            // make a statement if a word STARTS with a vowel
            if (word.startsWith("a")
                    || word.startsWith("e")
                    || word.startsWith("i")
                    || word.startsWith("o")
                    || word.startsWith("u")) {
                String latinvowel = word.replace("" + word.charAt(0), "i");

                // make a statement if ENDS with a vowel
                if (word.endsWith("a")
                        || word.endsWith("e")
                        || word.endsWith("i")
                        || word.endsWith("o")
                        || word.endsWith("u")
                        || word.endsWith("y")) {
                    latinvowel = latinvowel + "hee";

                    }
                }
            }
        }
    }

