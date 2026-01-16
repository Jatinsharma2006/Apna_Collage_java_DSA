//Type Promotion (in Expression)


import java.util.Scanner;

public class M_Type_Promotion_In_Expression{
    
    public static void main (String args[])
    {
        //EX-1
        char a = 'a';
        char b = 'b';
        System.out.println(b-a);
        //while doing b-a it will express a and b value as interger (98-97)
        System.out.println((int)a);
        System.out.println((int)b);


        //EX-2
        //char a = 'a';
        short b1 = 50;
        //while doing a+b it will express a value as interger (97+50)
        System.out.println(a+b1);
        
        
      
        //EX-3
        //char a = 'a';
        //char b = 'b';
//char c = b-a;
        //it will give conversion error as when doing b-a it convert them in int value
        //and now we are storing it in a variable with dataype char and 
        //we cant convert int to char without type casting
        //System.out.println(c);
        

        //EX-4
        //short a = 5;
        //byte b = 25;
        //char c = 'c';
//byte bt = a+b+c;
        //it will give conversion error as when doing a+b+c it convert them in int value
        //and now we are storing it in a variable with dataype byte and 
        //we cant convert int to byte without type casting
        //System.out.println(bt);


        //EX-5
        int a2 = 10;
        float b2 = 20.36f;
        long c2 = 25;
        double d2 = 30;
//long result = a2+b2+c2+d2;
        /*it will also give error as the highest datatype is double 
        //so when evaluting the entire expression is expressed as double
        ERROR--cant convert double to long */

        //To solve this we have 2 option
        double result = a2+b2+c2+d2; 
        System.out.println(result);
//or
        long result2= (long)(a2+b2+c2+d2);
        System.out.println(result2);


        //EX-6
        //Type promotion happens when expression is evaluated 
        byte b3=5;
//b = b*2;     
//or
//byte a = b*2;  
        /*both will give error that we cant convert int to byte as when evaluating b*2 ,
        b will be converted to int  
        solve this confilt */
        byte a3 =(byte)(b3*2);
        System.out.print(a3);
    }
}


