
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vandl4973
 */
public class MattenenglischTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating an input scanner
        while (true) {
            Scanner input = new Scanner(System.in);
            //asking user for word to translate
            System.out.println("Please enter the word you are translatting(Type END to terminate the program)");
            String word = input.nextLine();
            // if the user types end it kills the program
            if (word.equals("END")) {
                break;
            }
            //converting it to lower case
            word = word.toLowerCase();
            // finding the vowels location
            int a = word.indexOf("a");
            int e = word.indexOf("e");
            int i = word.indexOf("i");
            int o = word.indexOf("o");
            int u = word.indexOf("u");
            int y = word.indexOf("y");
            // determining the first vowel  
            int vowel = a;
            if (vowel == -1 || (vowel != -1 && e != -1 && e < vowel)) {
                vowel = e;
            }

            if (vowel == -1 || (vowel != -1 && i != -1 && i < vowel)) {
                vowel = i;
            }

            if (vowel == -1 || (vowel != -1 && o != -1 && o < vowel)) {
                vowel = o;
            }

            if (vowel == -1 || (vowel != -1 && u != -1 && i < vowel)) {
                vowel = u;

            }
            if ((!word.startsWith("y") && vowel == -1) || (!word.startsWith("y") && vowel != -1 && y != -1 && i < vowel)) {
                vowel = y;

            }

            //isolating the vowel A
            if (!word.startsWith("a") && vowel == a) {
                String achangedWord = word.replaceFirst("a", "i");
                int aPosition = achangedWord.indexOf("i");
                //moving letters to correct spots
                String abeginning = achangedWord.substring(0, aPosition);
                String aending = achangedWord.substring(aPosition);
                achangedWord = aending + abeginning + "ee";
                System.out.println("the word is " + achangedWord);
            } else // isolating the vowel E
            if (!word.startsWith("e") && vowel == e) {
                String echangedWord = word.replaceFirst("e", "i");
                int ePosition = echangedWord.indexOf("i");
                //moving letters to correct spots
                String ebeginning = echangedWord.substring(0, ePosition);
                String eending = echangedWord.substring(ePosition);
                echangedWord = eending + ebeginning + "ee";
                System.out.println("the word is " + echangedWord);
            } else // isolating the vowel I
            if (!word.startsWith("i") && vowel == i) {
                String ichangedWord = word.replaceFirst("i", "i");
                int iPosition = ichangedWord.indexOf("i");
                //moving letters to correct spots
                String ibeginning = ichangedWord.substring(0, iPosition);
                String iending = ichangedWord.substring(iPosition);
                ichangedWord = iending + ibeginning + "ee";
                System.out.println("the word is " + ichangedWord);
            } else // isolating the vowel O
            if (!word.startsWith("o") && vowel == o) {
                String ochangedWord = word.replaceFirst("o", "i");
                int oPosition = ochangedWord.indexOf("i");
                //moving letters to correct spots
                String obeginning = ochangedWord.substring(0, oPosition);
                String oending = ochangedWord.substring(oPosition);
                ochangedWord = oending + obeginning + "ee";
                System.out.println("the word is " + ochangedWord);
            } else // isolating the vowel U
            if (!word.startsWith("u") && vowel == u) {
                String uchangedWord = word.replaceFirst("u", "i");
                int uPosition = uchangedWord.indexOf("i");
                //moving letters to correct spots
                String ubeginning = uchangedWord.substring(0, uPosition);
                String uending = uchangedWord.substring(uPosition);
                uchangedWord = uending + ubeginning + "ee";
                System.out.println("the word is " + uchangedWord);

            }

            // If word starts with a
            if (word.startsWith("a")) {
                String achangedWord = word.replaceFirst("a", "i");
                achangedWord = achangedWord + "hee";
                System.out.println("the word is " + achangedWord);
            }
            // If word starts with e
            if (word.startsWith("e")) {
                String achangedWord = word.replaceFirst("e", "i");
                achangedWord = achangedWord + "hee";
                System.out.println("the word is " + achangedWord);
            }
            // If word starts with i
            if (word.startsWith("i")) {
                String achangedWord = word.replaceFirst("i", "i");
                achangedWord = achangedWord + "hee";
                System.out.println("the word is " + achangedWord);
            }
            // If word starts with o
            if (word.startsWith("o")) {
                String achangedWord = word.replaceFirst("o", "i");
                achangedWord = achangedWord + "hee";
                System.out.println("the word is " + achangedWord);
            }
            // If word starts with u
            if (word.startsWith("u")) {
                String achangedWord = word.replaceFirst("u", "i");
                achangedWord = achangedWord + "hee";
                System.out.println("the word is " + achangedWord);
            }
            // getting Y
            if (!word.startsWith("y") && vowel == y) {
                String ychangedWord = word.replaceFirst("y", "i");
                int yPosition = ychangedWord.indexOf("i");
                //moving letters to correct spots
                String ybeginning = ychangedWord.substring(0, yPosition);
                String yending = ychangedWord.substring(yPosition);
                ychangedWord = yending + ybeginning + "ee";
                System.out.println("the word is " + ychangedWord);
            }


        }
    }
}