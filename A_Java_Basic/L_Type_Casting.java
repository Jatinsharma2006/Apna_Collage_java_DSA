//Type casting 
//Doing type conversion even tho it may result in data loss
//SYNTAX: 
//         datatype1 variable= (datatype1) value;
//                                                  value with datatype2
import java.util.Scanner;

public class L_Type_Casting{
    
    public static void main (String args[])
    {
        float a = 21.213f;
        int b = (int)a;
        System.out.println(b);


        char ch1='a';
        char ch2='b';
        System.out.println(ch1);
        System.out.println(ch2);

        int num1=ch1;
        int num2=ch2;
        System.out.println(num1);
        System.out.println(num2);
    }
}

/*
In this program it convert a decimal value(21.213) to a int value 
And while coverting it loss value after point .213
*/
