import java.util.Scanner;

public class D_Relational_logical_Assignment_Operator{
         /*Relatoonal operator
    ==
    !=
    >
    <
    >=
    <=
        */
       /*Assignment operator
    =
    +=
    -=
    *=
    /= 
       */
      /*Logical Operator
    &&
    ||
    !
     */





       
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter A value:");
        int a =sc.nextInt();
        System.out.print("Enter B value:");
        int b =sc.nextInt();


        System.out.println("Addition = "+(a+b));
        System.out.println("Subtract = "+(a-b));
        System.out.println("Multiply = "+(a*b));
        System.out.println("Divide = "+(a/b));
        System.out.println("Modulus(Remainder after division) = "+(a%b));
    
    }
}
