//Conditional Statement 

//Switch Case: Making a Calculator using switch case
                   // +,-,*,/,%

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

public class G_Switch_Case_Calculator
{ 
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A and B : ");
        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.print("Enter OPERATOR : ");
        char Operator =sc.next().charAt(0);
    


        switch(Operator) {  
                    
            case '+': System.out.println(a+b);
                            break;

            case '-': System.out.println(a-b);
                            break;

            case '*': System.out.println(a*b);
                            break;

            case '/': System.out.println(a/b);
                            break;

            case '%': System.out.println(a%b);
                            break;

            default: System.out.println("wrong operator");     
        };
     
    }
}
/*
    Input: 20  30  *
    Output:600
*/      