//Do-While Loop 

/*Synatx:
        do{
             //do something
        }while(condition);
*/


import java.util.Scanner;
public class A_while_loop
{ 
    public static void main (String args[])
    {

//EX-1 : Printing Hello World 10 times
// using do-while loop


        int counter = 0;

        do{
            System.out.println("Hello World! ");
            System.out.println(counter);
            counter++;
        }while(counter<=10);
        
        System.out.println(" Out of loop ! ");
    }
}



                        