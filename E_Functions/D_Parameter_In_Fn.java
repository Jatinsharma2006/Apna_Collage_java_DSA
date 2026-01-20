//Function with Parameter
/*
Syntax:  
        Access_modifiers  Return_type  Fn_name(datatype Parmeter1,dtype Parmeter)
        {
            //body
           
            return statement;
        }                                                                                */

import java.util.*;
public class D_Parameter_In_Fn{

        public static int CalculateSum(int num1 , int num2)
        {
                int Sum = num1 + num2;
                return Sum;
        }

    
        public static void main (String args[])
        {
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter A : ");
                int a =sc.nextInt();
                System.out.print("Enter B : ");
                int b =sc.nextInt();

                int Sum = CalculateSum(a,b);
                System.out.print("Sum is :" + Sum);
        }


/*                       Parameter
                        /         \
                       /           \
           Formal Parameter       Actual Parameter
              (Parameter)           (Arguments)
                   |                      |
                   |                      |
During fn      Defination                Call 


Ex: 
        public static int CalculateSum(int num1 , int num2)

        ===> here "int num1","int num2"  are formal parameter


        int Sum = CalculateSum(a,b);
        ===> here "a","b"  are actual parameter(arguments)

*/







}
