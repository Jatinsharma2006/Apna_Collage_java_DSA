/*
Set the ith bit to 0 
(counting from last to first <-----)

if we do --- (0 & ith Bit) we will be able set ith bit  to 0 

But we need our  0 only at ith index so it just clear ith bit 

if we do (1 << i)  it will result in  00010 
and if we do  ~(1 << i) it will reult in  11101

*/

import java.util.Scanner;

public class F_Clear_ith_Bits{

    public static int Clear_ith_Bit_fn(int n , int i){

        int bitMask = ~ (1<<i) ;
        return (n & bitMask);
        
    }
    public static void main (String args[])
    {
        System.out.println(Clear_ith_Bit_fn(26,3));
    }
}

/*
Ex :  n = 0001 1010  and ith bit 3 

first   (1<<i) --> 1 = 0000 0001 
                   (1<<3) = 000(-remove) 0 0001 (+Insert)000

                   ==> 0000 1000

Second ~(1<<i) --> 1111 0111

n & ~(1<<i)  -->   0001 1010 
                 & 1111 0111
                  -----------
    result         0001 0010


 */
