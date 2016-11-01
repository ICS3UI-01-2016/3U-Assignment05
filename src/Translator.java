
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
        String word = input.nextLine();
        Pattern p = Pattern.compile("(a|e|i|o|u)");
        word.
        int some = word.
        System.out.println(some);
        if(Pattern.matches(p.toString(), word)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
