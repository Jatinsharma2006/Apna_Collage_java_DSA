/*
finding wheather the ith bit is 0 or 1 
(counting from last to first <-----)

if we do --- (1 & ith Bit) we will be able to know wheather ith bit is 0 or 1 

if we do (1 << i) we will be able to get 1 at i index to peform (1 & ith Bit)

*/

import java.util.Scanner;

public class D_Get_ith_Bits{
    
    
    public static int Get_ith_Bit_fn(int n , int i){

        int bitMask = 1<<i;
        
        if((n & bitMask) == 0)
        {
            return 0 ;
        }
        else{
            return 1;
        }
    }

    public static void main (String args[])
    {
        System.out.println(Get_ith_Bit_fn(10,2));
        System.out.println(Get_ith_Bit_fn(12,2));
        System.out.println(Get_ith_Bit_fn(9,2));
    }
    
}

/*
Ex :  n = 00001111  and ith bit 2 

first(1<<i) --> 1 = 0000 0001 
                (1<<2) = 00(-remove) 00 0001 (+Insert)00

                ==> 0000 0100

n & (1<<i)  -->   0000 1111 
                & 0000 0100
                -----------
    result        0000 0100

if (result == 0) = True ---  ith bit is 0
                 = False---  ith bit is 1
 */
