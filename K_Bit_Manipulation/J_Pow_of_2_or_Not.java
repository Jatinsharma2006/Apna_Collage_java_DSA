
import java.util.Scanner;

public class J_Pow_of_2_or_Not{
    
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int n =sc.nextInt();
         
        if( (n & ( n -1)) == 0)
        {
            System.out.print("Divisble by 2");
        }
        else{
            System.out.print("Not Divisible by 2");
        }
    }
}

/*

Logic:      4 -> 2^2

            8 -> 2^3

            7 -> 2^n  XXXX Not posible

logic :-- if a number divisible by 2


Binarry Approach :---

4 -> 100
3 -> 011
    ------ & 
     000 ----> 0

8 -> 1000
7 -> 0111
    ------ & 
     0000 ----> 0


16 -> 10000
15 -> 01111
     ------- & 
      00000----> 0

If we notice for every n

            n & (n-1) == 0

If its Pow of*/