
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author keyew7019
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create scanner for input
        Scanner input = new Scanner(System.in);
        String word = "";
        while (!word.equalsIgnoreCase("END")) {
            //Scan in a word
            System.out.println("Please enter a word to translate");
            System.out.println("Type END to quit the program");
            word = input.nextLine();
            //make sure the input is lower case
            word = word.toLowerCase();
            String word2 = word;
            //get the length of the word
            int length = word2.length();

            //Make some rules
            if (word2.equalsIgnoreCase("END")) {
                break;
            }
            //walk through the characters using a loop
            int count = 0;
            for (int i = 0; i < length; i++) {

                //look at the character
                //is the character an a
                if (word2.charAt(i) == 'a') {
                    word2 = word2.replaceFirst("a", "i");

                    //find the first l position
                    int aPosition = word2.indexOf("i");

                    //found an l in the word
                    if (aPosition != -1) {
                        //breaking the String apart
                        //starts at the beginning, goes up to the l
                        String beginning = word2.substring(0, aPosition);
                        //start at the l, take everything after it
                        String ending = word2.substring(aPosition);
                        //reassemble
                        word2 = ending + beginning;
                    }
                        if (word2.endsWith("a")) {
                            word2 = word2 + "hee";
                            break;
                        } else if (word2.endsWith("e")) {
                            word2 = word2 + "hee";
                            break;
                        }else if (word2.endsWith("i")) {
                            word2 = word2 + "hee";
                            break;
                        }else if (word2.endsWith("o")) {
                            word2 = word2 + "hee";
                            break;
                        }else if (word2.endsWith("u")) {
                            word2 = word2 + "hee";
                            break;
                        }else{
                            word2 = word2 + "ee";
                        }
                    break;
                }
                //is the character an e
                if (word2.charAt(i) == 'e') {

                    word2 = word2.replaceFirst("e", "i");

                    //find the first l position
                    int ePosition = word2.indexOf("i");

                    //found an l in the word
                    if (ePosition != -1) {
                        //breaking the String apart
                        //starts at the beginning, goes up to the l
                        String beginning = word2.substring(0, ePosition);
                        //start at the l, take everything after it
                        String ending = word2.substring(ePosition);
                        //reassemble
                        word2 = ending + beginning;
                    }
                        if(word2.endsWith("a")){
                            word2 = word2 + "hee";
                            break;
                        }else if(word2.endsWith("e")){
                            word2 = word2 + "hee";
                            break;
                        }else if(word2.endsWith("i")){
                            word2 = word2 + "hee";
                            break;
                        }else if(word2.endsWith("o")){
                            word2 = word2 + "hee";
                            break;
                        }else if(word2.endsWith("u")){
                            word2 = word2 + "hee";
                            break;
                        }else{
                            word2 = word2 + "ee";
                        }
                    break;
                }
                //is the character an i
                if (word2.charAt(i) == 'i') {

                    //find the first l position
                    int iPosition = word2.indexOf("i");

                    //found an l in the word
                    if (iPosition != -1) {
                        //breaking the String apart
                        //starts at the beginning, goes up to the l
                        String beginning = word2.substring(0, iPosition);
                        //start at the l, take everything after it
                        String ending = word2.substring(iPosition);
                        //reassemble
                        word2 = ending + beginning;
                    }
                        if(word2.endsWith("a")){
                            word2 = word2 + "hee";
                            break;
                        }else if(word2.endsWith("e")){
                            word2 = word2 + "hee";
                            break;
                        }else if(word2.endsWith("i")){
                            word2 = word2 + "hee";
                            break;
                        }else if(word2.endsWith("o")){
                            word2 = word2 + "hee";
                            break;
                        }else if(word2.endsWith("u")){
                            word2 = word2 + "hee";
                            break;
                        }else{
                            word2 = word2 + "ee";
                    }
                    break;
                }
                //is the character an o
                if (word2.charAt(i) == 'o') {
                    word2 = word2.replaceFirst("o", "i");

                    //find the first l position
                    int oPosition = word2.indexOf("i");

                    //found an l in the word
                    if (oPosition != -1) {
                        //breaking the String apart
                        //starts at the beginning, goes up to the l
                        String beginning = word2.substring(0, oPosition);
                        //start at the l, take everything after it
                        String ending = word2.substring(oPosition);
                        //reassemble
                        word2 = ending + beginning;
                    }
                        if(word2.endsWith("a")){
                            word2 = word2 + "hee";
                            break;
                        }else if(word2.endsWith("e")){
                            word2 = word2 + "hee";
                            break;
                        }else if(word2.endsWith("i")){
                            word2 = word2 + "hee";
                            break;
                        }else if(word2.endsWith("o")){
                            word2 = word2 + "hee";
                            break;
                        }else if(word2.endsWith("u")){
                            word2 = word2 + "hee";
                            break;
                        }else{
                            word2 = word2 + "ee";
                    }
                    break;
                }
                //is the character an u
                if (word2.charAt(i) == 'u') {
                    word2 = word2.replaceFirst("u", "i");

                    //find the first l position
                    int uPosition = word2.indexOf("i");

                    //found an l in the word
                    if (uPosition != -1) {
                        //breaking the String apart
                        //starts at the beginning, goes up to the l
                        String beginning = word2.substring(0, uPosition);
                        //start at the l, take everything after it
                        String ending = word2.substring(uPosition);
                        //reassemble
                        word2 = ending + beginning;
                    }
                        if(word2.endsWith("a")){
                            word2 = word2 + "hee";
                            break;
                        }else if(word2.endsWith("e")){
                            word2 = word2 + "hee";
                            break;
                        }else if(word2.endsWith("i")){
                            word2 = word2 + "hee";
                            break;
                        }else if(word2.endsWith("o")){
                            word2 = word2 + "hee";
                            break;
                        }else if(word2.endsWith("u")){
                            word2 = word2 + "hee";
                            break;
                        }else{
                            word2 = word2 + "ee";
                    }
                    break;
                }
                //is the character an y
                if (word2.charAt(i) == 'y' && i != 0) {

                    //find the first l position
                    int yPosition = word2.indexOf("y");
                    if (yPosition != 0) {
                        word2 = word2.replaceFirst("y", "i");
                    } else {
                    }
                    //found an y in the word
                    if (yPosition != -1) {
                        //breaking the String apart
                        //starts at the beginning, goes up to the l
                        String beginning = word2.substring(0, yPosition);
                        //start at the l, take everything after it
                        String ending = word2.substring(yPosition);
                        //reassemble
                        word2 = ending + beginning + "ee";
                    }
                    break;
                }
            }
            System.out.println(word + " in Mattenenglisch is " + word2);
        
    }
}
        }
