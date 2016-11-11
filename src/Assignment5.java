
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for the user
        Scanner input = new Scanner (System.in);
        
        // Scan in a word
        System.out.println("Please enter your word you want to translate:");
        String term = input.nextLine();
        
       
        // get the length of the word using a loop
        int length = term.length ();
        
        // converting the word to lower case
        term = term.toLowerCase();
        
        
        int count = 0; 
        char ch;
        // change word
        String changeword = "";
        
        
        //walk thorough the charcters 
        for (int i = 0; i < length; i++){
            //create a variable for beginning word and ending word to store
            String beginning = term.substring (0 , i);
            String ending = term.substring (i + 1);     
            
        // walk thorough the characters to find any vowels in the word
           ch = term.charAt(i);
           if ((ch == 'y') && (term.endsWith("y") && length < 3)){
               changeword = "i" + ending + beginning + "ee" ;
               break;
           }
           // it the term starts with a letter y
           if ((ch == 'y') && term.startsWith("y")){
            String first =  term.substring(0 , 1);
            String last = term.substring(i + 2);
            changeword = "i" + last + first + "ee";
            break;
           }
           // if y comes at the end of a consonant letter
           if ((ch == 'y') && (term.endsWith("y") || term.startsWith("y"))){
               changeword = "i" + ending + beginning + "hee";
               break;
           }
           //if the term begin with vowel sound end with a vowel
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
               changeword = "i" + ending + beginning + "ee";
               break;
           }
           //if the term start with a vowel
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
               changeword = "i" + ending + beginning + "ee";
               break;
               }
        }
            System.out.println(term + " in Mattenenglish is " + changeword);
               
       }           
    }
           
        
               
               
               
           
           

               
                       
                       
                       

                           
                   
               
               
           
   



    

    
   


               
               
               
           
           
       
        
  
        
        
        
        
        
    
        
    



