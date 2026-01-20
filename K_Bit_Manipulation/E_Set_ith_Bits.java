/*
Set the ith bit to 1 
(counting from last to first <-----)

if we do --- (1 | ith Bit) we will be able set ith bit  to 1 

if we do (1 << i) we will be able to get 1 at i index to peform (1 | ith Bit)

*/

import java.util.Scanner;

public class D_Get_ith_Bits{

    public static int Set_ith_Bit_fn(int n , int i){

        int bitMask = 1<<i;
        return n|bitMask ;
    }
    public static void main (String args[])
    {
        System.out.println(Set_ith_Bit_fn(10,2));
    }
}

/*
Ex :  n = 0001 0010  and ith bit 3 

first(1<<i) --> 1 = 0000 0001 
                (1<<3) = 000(-remove) 0 0001 (+Insert)000

                ==> 0000 1000

n | (1<<i)  -->   0001 0010 
                | 0000 1000
                -----------
    result        0001 1010


 */
