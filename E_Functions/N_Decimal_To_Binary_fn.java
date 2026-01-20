//Decimal To Binary/

import java.util.*;

public class N_Decimal_To_Binary_fn {


    public static void Decimal_To_Binary_fn(int DecNum){

        int pow = 0;
        int BinNum = 0;
        int myNum = DecNum;
        while(DecNum>0){
            int Remainder = DecNum % 2 ;

            BinNum = BinNum + (Remainder *(int) Math.pow(10,pow));
            pow++;

            DecNum = DecNum / 2 ;
        }
        System.out.println("Binary of " + myNum + "=" + BinNum);
    }


    public static void main (String args[])
    {
        Decimal_To_Binary_fn(10);
    }
}