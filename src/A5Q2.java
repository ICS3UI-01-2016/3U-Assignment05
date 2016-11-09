
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A5Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create loop so user can input repeatdely, if user type end stop program
        while (true) {

            // Create scanner for input
            Scanner input = new Scanner(System.in);

            // ask the user to input a word
            System.out.println("Please input a word into the translator");

            // scan in a word
            String word = input.nextLine();
            word = word.toLowerCase();

            // get the length of the word
            int length = word.length();
            
            if (word.equals("end")) {
                break;
            }

            // when the word begins with a vowel 
            if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i")
                    || word.startsWith("o") || word.startsWith("u")) {
                // the beginning of the word starts with i
                String beginning = "i";
                // divide the word from the first letter to the rest of the word
                String ending = word.substring(1);
                // if word ends with a vowel and the ending as "hee"
                if (word.endsWith("a") || word.endsWith("e") || word.endsWith("i")
                        || word.endsWith("o") || word.endsWith("u") || word.endsWith("y")) {
                    word = beginning + ending + "hee";    
                } else {
                    // othwerwise if final letter is consonent let the ending of the word end as "ee"
                    word = beginning + ending + "ee";
                }
                // input the translated word
                System.out.println("The translated word in Mattenänglisch is " + word);
                
  
            } else // when the word begins with a consonent
            if (!word.startsWith("a") || !word.startsWith("e") || !word.startsWith("i")
                    || !word.startsWith("o") || !word.startsWith("u")) {
                // let the inital count be zero
                int count = 0;
                // search for the first vowel in the word
                for (int i = 1; i < length; i++) {
                    // look at the character
                    if (word.charAt(i) == ('a') || word.charAt(i) == ('e')
                            || word.charAt(i) == ('i') || word.charAt(i) == ('o')
                            || word.charAt(i) == ('u') || word.charAt(i) == ('y')){
                        // divide the word up into chunks
                        // all the consenents up to the first vowel
                        String begin = word.substring(0, i);
                        // the first vowel itself and the rest of the word
                        String middle = word.substring(i);
                        // divide into two chunks from the first vowel to the rest of the word
                        String firstmiddle = middle.substring(0, 1);
                        // change first vowel into "i"
                        firstmiddle = "i";
                        // rest of the word
                        String secondmiddle = middle.substring(1);
                        // resassemble word
                        word = firstmiddle + secondmiddle + begin + "ee";
                        // output translated word
                        System.out.println("The translated word in Mattenänglisch is " + word);
                        // break from the loop
                        break;
                    }
                }
            }
        }
    }
}