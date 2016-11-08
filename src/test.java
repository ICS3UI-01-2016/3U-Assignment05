
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schum0689
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int number;
        
        Scanner input = new Scanner(System.in);
        
        
        while ((number = input.nextInt()) !=0){
            System.out.println("Input an integer:");
            System.out.println("You entered " + number);
        }
        
        System.out.println("Out of loop");
        
        //http://www.programmingsimplified.com/java/tutorial/java-while-loop
    }
}
