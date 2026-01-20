/*
Suppose we have a class with multiply fn (Calculator)
*/
import java.util.*;
public class H_Function_Overloading_Basis{
//public class Calculator{

    public static int multiply_fn(int a,int b){
         return a*b;
    }
//This fn accept Integer value only
/*
But what if we want to multiply Float values
we need to make another fn                      */
    public static float multiply_fn2(float a,float b){
         return a*b;
    }
//now for Double values
    public static double multiply_fn3(double a,double b){
         return a*b;
    }
//now what if we want to multiply 3 values another fn 
    public static int multiply_fn4(int a,int b,int c){
         return a*b;
    }
/*We have to make so many function with so many diffrent fn name 
and what they do 

To solve this we use Fn overloading 

Function Overloading :- Multiple fn with same name but different parameter
 
Means all these fn (Multiply_fn , Multiply_fn2 , Multiply_fn3 , Multiply_fn4 )
can have same name (Multiply_fn)

java will automatically decide which fn to call when argument is passed to a fn

There should be a Differentiating factor b/w fn
either:--
            ==> Number of Parameter   (ex-- one take 2, one take 3)
            ==> Type of Parameter     (ex-- one take double,one take int)


NOTE:---
        Fn overloading dont depend on Return Type of fn means :--
        Ex:-
                int Sum (int a, int b)    

                float Sum (int a, int b)  

java will consider both same (as it dont depend on return type)
it will give error when run
*/
       
}