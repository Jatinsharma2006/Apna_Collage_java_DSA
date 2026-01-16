
import java.util.Scanner;

public class C_Arithmetic_Ternary_Operator{
    /*
    SYNTAX:
            datatype variable = Condition? Statement1 :Statement2;
    condition is checked 
    If condition is True Statement1 is executed
    else Statement2 is executed
    */
    
    public static void main (String args[])
    {
      Scanner sc=new Scanner(System.in);

    //EX-1 which is greater 
      System.out.print("Enter A : ");
      int A =sc.nextInt();

      System.out.print("Enter B : ");
      int B =sc.nextInt();

      char greater = (A>B)?'A':'B';
      System.out.println(greater + " is greater");


    //EX-2 even or odd
      System.out.print("Enter number : ");
      int num =sc.nextInt();

      String type = ((num%2)==0)?"Even":"Odd";
      System.out.println(type);


    //EX-3 if marks in a subject is less than 33 student fail
      System.out.print("Enter marks : ");
      float marks =sc.nextFloat();

      String Result = (marks>=33)?"Pass":"Fail";
      System.out.println(Result);
    }
}

/*

*/