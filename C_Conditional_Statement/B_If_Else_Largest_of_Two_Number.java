//Conditional Statement 

//if-else:

/*
Syntax: if(condition){ }

        else { }

*/
import java.util.Scanner;

public class B_If_Else_Largest_of_Two_Number
{ 
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter A :");
        int a =sc.nextInt();

        System.out.print("Enter B :");
        int b =sc.nextInt();

        if(a >= b){
            System.out.println("A is greater");
        }
        
        else{
            System.out.println("B is greater");
        }
    }
}
