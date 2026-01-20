//Conditional Statement 

//if-else:

/*
Syntax: if(condition){ }

        else { }

*/
import java.util.Scanner;

public class A_If_Else_Vote_or_Not
{ 
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Age:");
        int age =sc.nextInt();

        if(age>=18){
            System.out.println("Adult:Can Drive & Vote");
        }
        
        else{
            System.out.println("Not Adult:Cant Drive & Vote");
        }
        
        //we can also have 2 condition and both become true the statement inside if get executed
        if(age>13 && age<18){
            System.out.println("teenager");
        }
    }
}
