
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shieg0688
 */
public class MattenenglischTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask user for word to be translated
        System.out.println("English:");
        //scan in word
        String word = input.nextLine();
        //make sure word is lower case
        word = word.toLowerCase();
        //find vowels
        int vowelA = word.indexOf("a");
        int vowelE = word.indexOf("e");
        int vowelI = word.indexOf("i");
        int vowelO = word.indexOf("o");
        int vowelU = word.indexOf("u");
        int vowelY = word.indexOf("y");
        //keep track of position of first vowel
        int firstVowel = vowelA;
        
        if(vowelA == -1 || (firstVowel != -1 && vowelA != -1 && vowelA < firstVowel )){
            firstVowel = vowelE;
            
        }
        if(vowelE == -1 || (firstVowel != -1 && vowelE!= -1 && vowelE < firstVowel )){
            firstVowel = vowelI;
            
        }
        if(vowelI == -1 || (firstVowel != -1 && vowelI != -1 && vowelI < firstVowel )){
            firstVowel = vowelO;
            
        }
        if(vowelO == -1 || (firstVowel != -1 && vowelO!= -1 && vowelO < firstVowel )){
            firstVowel = vowelU;
            
        }
        if(vowelU == -1 || (firstVowel != -1 && vowelU!= -1 && vowelU < firstVowel )){
            firstVowel = vowelY;
            
        }
        if(vowelY == -1 || (firstVowel != -1 && vowelY!= -1 && vowelY < firstVowel )){
            firstVowel = vowelA;
            
        }
        //break the string
        if(firstVowel > 0){
            
        }
        
    }
}
