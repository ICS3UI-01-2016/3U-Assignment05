
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
        if(!word.startsWith("a")||!word.startsWith("e")||!word.startsWith("i")||!word.startsWith("o")||!word.startsWith("u")){
            int firstA = word.indexOf("a");
            int firstE = word.indexOf("e");
            int firstI = word.indexOf("i");
            int firstO = word.indexOf("o");
            int firstU = word.indexOf("u");
        }
    }
}
