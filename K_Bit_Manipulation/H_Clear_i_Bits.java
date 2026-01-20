/*
Set the i bit to 0 
(counting from last to first <-----)
 
~0  =>  -1  =>  1111 1111

(-1 << 5)  =>   1110 0000
*/

import java.util.Scanner;

public class H_Clear_i_Bits{

    public static int Clear_i_Bits_fn(int n , int i){

        int bitMask = (~0<<i) ;
        return (n & bitMask);
        
    }
    public static void main (String args[])
    {
        System.out.println(Clear_i_Bits_fn(26,3));
    }
}

/*
Ex :  n = 11010  and i bits =2  

(-1 or ~0)

first   (-1<<i) --> -1 =  11111 
                   (-1<<2) = 11(-remove) 11 (+Insert)00

                   ==> 11100

n & (~0<<i)  -->   11010
                 & 11100
                   -----
    result         11000

*/
