//Call by Value
//reason for diffrent output due to call by value and scope of fn
import java.util.*;
public class E_Swap_A_n_B_Fn{

/*
1_ST
        public static void swapfn(int num1 , int num2)
        {
                int temp = num1;
                num1 = num2;
                num2=temp;
                return;
        }

    
        public static void main (String args[])
        {
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter A : ");
                int a =sc.nextInt();
                System.out.print("Enter B : ");
                int b =sc.nextInt();

                swapfn(a,b);
                System.out.println("A is :" + a);
                System.out.println("B is :" + b);
        }

        
*/
/*
Input :A=5
       B=7        

Output:A is 5
       B is 7 */



//*
//2nd
        public static void swapfn(int a , int b)
        {
                int temp = a;
                a = b;
                b=temp;

                System.out.println("A is :" + a);
                System.out.println("B is :" + b);
                return;
        }

    
        public static void main (String args[])
        {
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter A : ");
                int a =sc.nextInt();
                System.out.print("Enter B : ");
                int b =sc.nextInt();

                swapfn(a,b);
               
        }

//*/

/*
Input :A=5
       B=7        

Output:A is 7
       B is 5
 */


}
