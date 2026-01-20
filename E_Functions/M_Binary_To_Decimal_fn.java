//Binary To Decimal/

import java.util.*;

public class M_Binary_To_Decimal_fn {


    public static void Binary_To_Decimal_fn(int BinNum){

        int pow = 0;
        int DecNum = 0;
        int myNum = BinNum;
        while(BinNum>0){
            int Lastdigit = BinNum % 10 ;

            DecNum = DecNum + (Lastdigit *(int) Math.pow(2,pow));
            pow++;

            BinNum = BinNum / 10 ;
        }
        System.out.println("Decimal of " + myNum + "=" + DecNum);
    }


    public static void main (String args[])
    {
        Binary_To_Decimal_fn(1010);
    }
}