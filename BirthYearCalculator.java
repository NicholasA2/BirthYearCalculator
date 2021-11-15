/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthyearcalculator;
import java.util.Scanner;
/**
 *
 * @author Nicholas Adiohos
 */
public class BirthYearCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Preparing user input
        Scanner birthYear = new Scanner(System.in);
        
        //Get user input
        System.out.print("Please input a birth year: ");
        String birthYearGot = birthYear.nextLine();
       
        //Convert input to int
        String centuryStepOne = birthYearGot.substring(0, 2);
        int centuryStepTwo = Integer.parseInt(centuryStepOne);
        //Now turn it into the century
        int centuryStepThree = centuryStepTwo + 1;
        
        //Get the decade, which we will add 0 to later
        char decade = birthYearGot.charAt(2);
        
        //Print results
        System.out.printf("Birth Year \t:%s\n", birthYearGot);
        System.out.printf("Century \t:%d\n", centuryStepThree);
        System.out.printf("Decade \t\t:%s0\n", decade);
    }
    
}
