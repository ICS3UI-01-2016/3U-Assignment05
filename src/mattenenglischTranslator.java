
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author messr2578
 */
public class mattenenglischTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creater the input for the user
        Scanner input = new Scanner(System.in);
        //used for easy testing mabye temporary
        while (true) {
            //scan in a word
            String word = input.nextLine();
            //change it to lowercase
            String changedWord = word.toLowerCase();
            String begining = word;
            String end = word;
            int length = word.length();
            //find the first vowel
            int aPosition = word.indexOf("a");
            int ePosition = word.indexOf("e");
            int iPosition = word.indexOf("i");
            int oPosition = word.indexOf("o");
            int uPosition = word.indexOf("u");
            int yPosition = word.indexOf("y");
            //find the last vowel
            int lastA = word.lastIndexOf("a");
            int lastE = word.lastIndexOf("e");
            int lastI = word.lastIndexOf("i");
            int lastO = word.lastIndexOf("o");
            int lastU = word.lastIndexOf("u");
            int lastY = word.lastIndexOf("y");
            int first = length + 7;
            if ((aPosition < first && aPosition != -1)) {
                first = aPosition;
            }
            if ((ePosition < first && ePosition != -1)) {
                first = ePosition;
            }
            if ((iPosition < first && iPosition != -1)) {
                first = iPosition;
            }
            if ((oPosition < first && oPosition != -1)) {
                first = oPosition;
            }
            if ((uPosition < first && uPosition != -1)) {
                first = uPosition;
            }
            if ((yPosition < first && yPosition != -1 && yPosition != 0)) {
                first = yPosition;
            }


            begining = changedWord.substring(first);
            end = changedWord.substring(0, first);
            changedWord = begining + end;



            aPosition = changedWord.indexOf("a");
            ePosition = changedWord.indexOf("e");
            iPosition = changedWord.indexOf("i");
            oPosition = changedWord.indexOf("o");
            uPosition = changedWord.indexOf("u");
            yPosition = changedWord.indexOf("y");
            //find the last vowel
            lastA = changedWord.lastIndexOf("a");
            lastE = changedWord.lastIndexOf("e");
            lastI = changedWord.lastIndexOf("i");
            lastO = changedWord.lastIndexOf("o");
            lastU = changedWord.lastIndexOf("u");
            lastY = changedWord.lastIndexOf("y");

            //find out where first vowel is
            //then move all previous letters to the end of the word ,add ee 
            if (aPosition == 0) {
                changedWord = changedWord.replaceFirst("a", "i");
                if (changedWord.endsWith("a")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("e")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("i")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("o")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("u")) {
                    System.out.println("your word is " + changedWord + "hee");
                }


            }
            if (ePosition == 0) {
                changedWord = changedWord.replaceFirst("e", "i");
                if (changedWord.endsWith("a")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("e")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("i")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("o")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("u")) {
                    System.out.println("your word is " + changedWord + "hee");
                }


            }
            if (iPosition == 0) {
                changedWord = changedWord.replaceFirst("i", "i");
                if (changedWord.endsWith("a")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("e")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("i")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("o")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("u")) {
                    System.out.println("your word is " + changedWord + "hee");
                }


            }
            if (oPosition == 0) {
                changedWord = changedWord.replaceFirst("o", "i");
                if (changedWord.endsWith("a")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("e")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("i")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("o")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("u")) {
                    System.out.println("your word is " + changedWord + "hee");
                }

            }
            if (uPosition == 0) {
                changedWord = changedWord.replaceFirst("u", "i");
                if (changedWord.endsWith("a")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("e")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("i")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("o")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("u")) {
                    System.out.println("your word is " + changedWord + "hee");
                }

            }
            if (yPosition == 0) {
                changedWord = changedWord.replaceFirst("y", "i");
                if (changedWord.endsWith("a")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("e")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("i")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("o")) {
                    System.out.println("your word is " + changedWord + "hee");
                }
                if (changedWord.endsWith("u")) {
                    System.out.println("your word is " + changedWord + "hee");
                }


            }

            length = changedWord.length();


            if (lastA != length - 1 && lastE != length - 1 && lastI != length - 1 && lastO != length - 1 && lastU != length - 1 && lastY != length - 1) {
                System.out.println("your word is " + changedWord + "ee");
            }

        } //while loop end

    }
}
