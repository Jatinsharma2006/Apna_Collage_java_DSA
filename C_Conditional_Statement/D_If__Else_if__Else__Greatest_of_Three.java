//Conditional Statement 

//if__else-if__else:

/*
Syntax: if(condition) {  }

        else if {  }

        else { }

*/
import java.util.Scanner;

public class D_If__Else_if__Else__Greatest_of_Three
{ 
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A,B,C :");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();

        if(a >= b && a>= c){
            System.out.println("A is greatest");
        }

        else if(b >= c){
            System.out.println("B is greatest");
        }

        
        else{
            System.out.println("C is greatest");
        }
    }
}


/*

                A --> B && A --> C
       "True" /               \  "False"
             /                 \
           "A"                  B >=C 
                         "True" /    \ "False"
                               /      \  
                            "B"        "C"
                            
*/