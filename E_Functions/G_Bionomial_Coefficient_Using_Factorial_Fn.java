/*Bionomial_Coefficient 

n          n!                    factorial(n)
 C   = ----------    ==>  ---------------------------
  r     r!(n-r)!          factorail(r)*factorial(n-r)
*/



import java.util.*;
public class G_Bionomial_Coefficient_Using_Factorial_Fn{

        public static int factorial_fn(int num)
        {
                int f = 1;
                for(int i=1; i<=num ;i++) {
                        f=f*i;
                }
                return f;
        }


        public static int Bionomial_Coefficient_fn(int n , int r)
        {
                int fact_n = factorial_fn(n);
                int fact_r = factorial_fn(r);
                int fact_n_minus_r = factorial_fn(n-r);
                
                int Bionomial_Coefficient = fact_n /(fact_r*fact_n_minus_r);
                return Bionomial_Coefficient ; 

        }
        

    
        public static void main (String args[])
        {
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter N : ");
                int n =sc.nextInt();
                System.out.print("Enter R : ");
                int m =sc.nextInt();
              
                System.out.print(Bionomial_Coefficient_fn(n,m));
        }


}
