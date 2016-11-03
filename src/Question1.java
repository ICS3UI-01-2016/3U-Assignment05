
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slatz8075
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //tell them how to exit program 
        System.out.println("Enter 'end' to end program");
        while (true) {
            //ask them to enter their word they wish to turn into Mattenänglisch
            System.out.println("Please enter your word you wish to turn into Mattenänglisch");
            //scan in a word
            String word = input.nextLine();
            //change word to lower case
            word = word.toLowerCase();
            //see if that word is 'end'
            if (word.equalsIgnoreCase("end")) {
                //if so end loop
                break;
            }
            //make some changes 
            String changedWord = word;
            //find the first vowel
            int aPosition = changedWord.indexOf("a");
            int ePosition = changedWord.indexOf("e");
            int iPosition = changedWord.indexOf("i");
            int oPosition = changedWord.indexOf("o");
            int uPosition = changedWord.indexOf("u");
            int yPosition = changedWord.indexOf("y");
            //find if it ends with a vowel
            String h = "h";
            if (changedWord.endsWith("a") || changedWord.endsWith("e") || changedWord.endsWith("i")|| changedWord.endsWith("i") || changedWord.endsWith("o") || changedWord.endsWith("u")) {
                changedWord = changedWord + h;
            }
            //assume a is the lowest value
            int lowest = aPosition;
            char letter = 'a';
            //check to see if e is a lower value than the lowest
            if ((lowest == -1 && ePosition != -1) || (lowest != -1 && ePosition != -1 && ePosition < lowest)) {
                //if so e is the new lowest value
                lowest = ePosition;
                letter = 'e';
            }
            //check to see if i is a lower value than the lowest
            if ((lowest == -1 && iPosition != -1) || (lowest != -1 && iPosition != -1 && iPosition < lowest)) {
                //if so i is the new lowest value
                lowest = iPosition;
                letter = 'i';
            }
            //check to see if e is a lower value than the lowest
            if ((lowest == -1 && oPosition != -1) || (lowest != -1 && oPosition != -1 && oPosition < lowest)) {
                //if so o is the new lowest value
                lowest = oPosition;
                letter = 'o';
            }
            //check to see if u is a lower value than the lowest
            if ((lowest == -1 && uPosition != -1) || (lowest != -1 && uPosition != -1 && uPosition < lowest)) {
                //if so u is the new lowest value
                lowest = uPosition;
                letter = 'u';
            }
            if ((lowest == -1 && yPosition != -1) || (lowest != -1 && yPosition != -1 && yPosition != 0&& yPosition < lowest )) {
                //if so y is the new lowest value
                lowest = yPosition;
                letter = 'y';
            }           
            //found the earliest vowel in the word
            if (lowest != -1) {
                //breaking the string apart
                //starts at the beginning, goes UPTO the lowest value
                String beginning = changedWord.substring(0, lowest);
                //start at the A, take everythig after it
                String ending = changedWord.substring(lowest);
                //reassemble 
                changedWord = ending + beginning + "ee";
            }
            String changederWord = "i" + changedWord.replaceFirst("" + letter, "");
            System.out.println(changederWord);
        }
    }
}