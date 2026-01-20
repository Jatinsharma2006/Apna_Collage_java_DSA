//Conditional Statement 

//if__else-if__else:

/*
Syntax: if(condition) {  }

        else if {  }

        else { }

*/
import java.util.Scanner;

public class E_If__Else_if__Else__IncomeTax_Calculator
{ 
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Income : ");
        int Income =sc.nextInt();

        int Tax;

        if(Income<700000){
            Tax = 0;
        }

        else if(Income>=700000 && Income<=1200000)
        {
            Tax = (int)(Income*0.2);
        }

        else{
            Tax = (int)(Income*0.3);
        }

        System.out.println("Your tax is : "+Tax);
    }
}


/*
Income Tax Calculator

Income<7L : 0% tax

Income b/w 7L--12L : 20% tax

Income>12L : 30% tax

*/