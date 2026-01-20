
import java.util.Scanner;

public class B_Odd_or_Even{
    
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int input=sc.nextInt();
         
        if((input & 1) == 0)
        {
            System.out.print("Even");
        }
        else{
            System.out.print("Odd");
        }
    }
}