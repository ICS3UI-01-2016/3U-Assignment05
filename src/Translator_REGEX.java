
import java.util.Scanner;
import java.util.regex.*;

/**
 * A5,Translator
 *
 * @author micla1676
 */
public class Translator_REGEX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input
        Scanner input = new Scanner(System.in);

        //create an infinite loop
        while (true) {

            //ask for word
            System.out.println("Please enter the word you want translated:");

            //get word
            String word = input.nextLine();

            //if the word is EXIT, break the loop
            if (word.equals("EXIT")) {
                break;
            }

            //change word to lowercase
            word = word.toLowerCase();

            //find the length of the word and store it
            int length = word.length();

            //create pattern
            Pattern checkRegex = Pattern.compile("[aeiou]");
            //check pattern
            Matcher regexMatcher = checkRegex.matcher(word);
            //if match is found
            if (regexMatcher.find()) {

                //create a variable to store the location of first vowel in 
                //word
                int firstV = regexMatcher.start();
                //execute if index value of the first vowel is equal to zero
                if (firstV == 0) {

                    //seperate the word
                    //create a string to store first part of word
                    String Beginning = word.substring(0, 1);

                    //take the end of the word exluding the first Vowel and last
                    //letter
                    String middle = word.substring(firstV + 1, length - 1);
                    //take the last letter of the string
                    String End = word.substring(length - 1);

                    //create pattern
                    Pattern checkRegex3 = Pattern.compile("[aeiouy]");
                    //check pattern of aeiouy
                    Matcher regexMatcher4 = checkRegex3.matcher(End);
                    //if match is found
                    if (regexMatcher4.find()) {
                        //print translated word to screen
                        System.out.println("i" + middle + End + "hee");
                    } //if last letter is a constanant, print to screen
                    else {
                        System.out.println("i" + middle + End + "ee");
                    }
                } //if first vowel occours at an index greater then 0.
                else if (firstV > 0) {
                    //create pattern
                    Pattern checkRegex2 = Pattern.compile("[aeiouy]");
                    //check the pattern
                    Matcher regexMatcher3 = checkRegex2.matcher(word);
                    //if match is found
                    if (regexMatcher3.find()) {
                        //set firstV = to the index value of the first vowel
                        firstV = regexMatcher3.start();
                        //seperate the word
                        //create a string to store first part of word
                        String cBeginning = word.substring(0, firstV);
                        //take the end of the word exluding the first Vowel
                        String cEnd2 = word.substring(firstV + 1, length);
                        //print translated word to screen
                        System.out.println("i" + cEnd2 + cBeginning + "ee");
                    }
                }
            }
        }
    }
}
