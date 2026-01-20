//While loop 

/*Synatx:
        while(condition){
                 //do something
                        }
*/


import java.util.Scanner;
public class A_while_loop
{ 
    public static void main (String args[])
    {

//EX-1 : Printing Hello World 100 times
// using while loop
/*
        int counter = 0;

        while(counter<=100){
            System.out.println("Hello World! ");
            System.out.println(counter);
            counter++;
        }
         System.out.println(" Out of loop ! ");
*/


//EX-2 : Printing 1 to 10 times
//using while loop
/*
        int counter = 0;

        while(counter<=10){
            System.out.println(counter);
            counter++;
        }
         System.out.println(" Out of loop ! ");
*/    
    
    
//EX-3 : Printing 1 to n times
//using while loop
/*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n =sc.nextInt();
        int counter = 0;

        while(counter<=n){
            System.out.println(counter);
            counter++;
        }
         System.out.println(" Out of loop ! ");
*/    
    
//EX-4 : Printing sum of first n natural number
//using while loop

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n =sc.nextInt();
        int counter = 0;
        int Sum = 0;
        while(counter<=n){
              Sum += counter; //Sum= Sum + counter;
              counter++;
        }
         System.out.println("Sum is "+ Sum);  
    
    
    }
}



                        