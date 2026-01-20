//Conditional Statement 

//if-else:

/*
Syntax: if(condition){ }

        else { }

*/
import java.util.Scanner;

public class C_If_Else_Even_OR_ODD
{ 
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Number :");
        int num =sc.nextInt();

        if((num%2)==0){
            System.out.println("Num is even");
        }
        
        else{
            System.out.println("Num is odd");
        }
    }
}
