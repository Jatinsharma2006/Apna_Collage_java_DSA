
import java.util.Scanner;

public class I_Sum_n_Product_of_a_n_b_TakingInput{
    
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number A");
        int a =sc.nextInt();
        System.out.print("Enter number B");
        int b=sc.nextInt();

        int Sum=a+b;
        System.out.println(Sum);

        int Product=a*b;
        System.out.println(Product);
    }
}
/*
Input: 10 
        5
Output: 15
        50
 */
