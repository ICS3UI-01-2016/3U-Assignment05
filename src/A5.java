
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input 
        Scanner input = new Scanner(System.in);
        //create a while loop
        while (true) {
            //set integers
            int A = 0;
            int B = 0;

            //ask user to enter a word or quit the program
            System.out.println("Please enter a word to translate: (Type END to quit the program): ");
            String word = input.nextLine();

            //end the program
            if (word.equals("END")) {
                break;
            }

            //change the word from user to lower case
            word.toLowerCase();
            String trans = word;

            //checking if user entered word begins with a vowel
            if (!word.startsWith("a") && !word.startsWith("e") && !word.startsWith("i") && !word.startsWith("o") && !word.startsWith("u")) {
                B = B + 1;

                //move the first letter of the user entered word to the end of the word
                trans = trans + trans.substring(0, 1);
                A = trans.length();
                trans = trans.substring(1, A);

                //if the user entered word has a y not at the beginning of the word
                if (word.contains("y") && !word.startsWith("y")) {
                    trans = trans + trans.substring(0, 1);
                    A = trans.length();
                    trans = trans.substring(1, A);

                }
            }

            //double check user entered word
            A = trans.length();
            trans = trans.substring(1, A);

            //adding the letter i to the front of user entered word
            trans = "i" + trans;

            //adding ee or hee to the end of the user entered word
            if (!trans.endsWith("h") && B == 0) {
                trans = trans + "hee";
            } else {
                trans = trans + "ee";

            }

            System.out.println(trans);

        }
    }
}
