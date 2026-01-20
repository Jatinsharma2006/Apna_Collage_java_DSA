/*
User will specify wether to put 1 or 0 on ith bit 

*/

import java.util.Scanner;

public class G_Update_ith_Bits{

/*
//Approach - I Simpliest Approach

    public static int Update_ith_Bit_fn(int n , int i ,int newbit){

        int result = 0;

        if(newbit == 0)
        {
            result = Clear_ith_Bit_fn(n, i) ;
        }
        else{
            result = Set_ith_Bit_fn(n ,i);
        }
        return result;
    }
*/

//Approach - II
/* 
    public static int Update_ith_Bit_fn(int n , int i ,int newbit){    

        n = Clear_ith_Bit_fn(n ,i);

        int bitMask = newbit<<i;
        
        return n | bitMask ;
    }
*/
    public static void main (String args[])
    {
        System.out.println(Update_ith_Bit_fn(26,3,0));
        System.out.println(Update_ith_Bit_fn(10,2,1));
    }

 



    public static int Set_ith_Bit_fn(int n , int i){

        int bitMask = 1<<i;
        return n|bitMask ;
    }

    public static int Clear_ith_Bit_fn(int n , int i){

        int bitMask = ~ (1<<i) ;
        return (n & bitMask);
    }
}


/*Approach 2 logic 



Ex:  = 10l01 , i = 2 , nb = 0

        first its clearing the ith bit where we want to update bit--- 10001

        then wo its doing left Shift  i on the newbit:   newbit << i    --->    0 << 2   ---> 00000
        
        store it on BitMask 00000

        then we are doing or ( | ) operation n and Bit Mask =) 10001 | 00000         1 | 0 -> 1
/                                                                                    0 | 0 -> 0
/                                                                                    0 | 0 -> 0
/                                                                                    0 | 0 -> 0
/                                                                                    1 | 0 -> 1
        result = 10001


Ex: n = 10101 , i = 2, nb = 1

10001 

newbit << i    --->    1 << 2   ---> 00100

⇒10001 | 00100 ==> 10101