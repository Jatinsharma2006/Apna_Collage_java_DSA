//Conditional Statement 

//Switch Case:

/*
Syntax: 
        switch(variable) {  
                    
            case A: Statement;

            case B: Statement;

            case C: Statement;

            case D: Statement;

            default:Statement;
                
        }
*/

import java.util.Scanner;

public class A_If_Else_Vote_or_Not
{ 
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number between 1-5 :");
        int number =sc.nextInt();

        switch(number) {  
                    
            case 1: System.out.println("Your number is 1");

            case 2: System.out.println("Your number is 2");

            case 3: System.out.println("Your number is 3");

            case 4: System.out.println("Your number is 4");

            default: System.out.println("Your number is 5");     
        };
/*
    Input: 2
    Output: 
            Your number is 2
            Your number is 3
            Your number is 4
            Your number is 5

whenever one case is switch return true it makes
all the next statement true & execute them
 
if none of case get match/return true default is executed 

TO avoid executing rest of statement we use BREAK keyword
EX:
    case 2: System.out.println("Your number is 2");
                    break;*/
    }
}
