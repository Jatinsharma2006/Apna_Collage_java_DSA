//Reversing a number using while loop 

import java.util.Scanner;
public class A_Reversing_a_Number
{ 
    public static void main (String args[])
    {

/*Way 1 : 1_Get last digit of number :- number%10  
          2_Print it
          3_Remove last digit using :- number=number/10
          4_Send the number back to 1_
*/

/*
        int number = 10899;
        while(number>0){
            int lastdigit= number%10;
            System.out.print(lastdigit);
            number=number/10;
        }      
*/

/*Way 2 : 1_Get last digit of number :- number%10  
          2_Use last digit value in formula 
                    reverse=(reverse*10)+lastdigit
          3_Remove last digit using :- number=number/10
          4_Send the number back to 1_
          5_And after loop end print reverse
*/

/*
        int number = 10899;
        int reverse=0;
        while(number>0){
            int lastdigit= number%10;
            reverse=(reverse*10)+lastdigit;
            number=number/10;
        }  
        System.out.println(reverse);    
*/ 
    }
}



                        