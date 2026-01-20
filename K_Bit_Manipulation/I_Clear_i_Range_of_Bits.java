

import java.util.Scanner;

public class I_Clear_i_Range_of_Bits{

    public static int Clear_i__Range_of_Bits_fn(int n , int i , int j){

        int A = (~0 << (j+1)) ;
        int B = (1 << i) -1 ;
       
        int bitMask = (A|B) ;
        return (n & bitMask);
        
    }
    public static void main (String args[])
    {
        System.out.println(Clear_i__Range_of_Bits_fn(2515,2,7));
    }
}


/*
n = 1001 1101 0011   ,i = 2   , j = 7          So bits 2 to 7 are cleared.

Result should be:     1001 0000 0011  (2307)



for this our & should ne looking like : 1111 0000 0011 
To get this we will do 2 steps:  
                    A =  1111 0000 0000
                    B =  0000 0000 0011

and when we do A|B it will result 1111 0000 0011


To get A we will do 
(~0 << (j+1))  =  1111 1111 1111  --Shift by-- (7+1)  =  1111 0000 0000


To get B we will do 
(1 << i) -1)   = (1 << 2) -1 =  100 -1  == 011  


and when doing  A|B it will look like this ---  1111 0000 0000 | 0000 0000 0011
this will result : 1111 0000 0011


Ex-3
        n = 26 → 11010
        i = 1, j = 3

        Mask = 10001
        Result = 10000 → 16
*/