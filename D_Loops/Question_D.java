import java.util.Scanner;
public class Question_D
{ 
    public static void main (String args[])
    {

//Question 1: How many times 'Hello' is printed in this java program ?
        
/*
for(int i=0;i<5;i++){
    System.out.println("Hello"); 
    i+=2;
}
0
+1 +2 =3
+1 +2 =6 i<5 so not print         
*/


//Question 2: Write a program that reads a set of integer and then
// prints the Sum of the even and odd interger ?

/*
        Scanner sc=new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.print("Enter a number:");
            number =sc.nextInt();
            
            if(number%2==0){
                evenSum += number;
            }
            else{
                oddSum += number;
            }                 
            System.out.println("Do you want to continue? Press 1 for Yes or 0 for No");
            choice =sc.nextInt();    
        }while(choice==1); 

        System.out.println("Sum of even number:" + evenSum);
        System.out.println("Sum of odd number:" + oddSum);
   
*/     


/*Question 3: Write a program to find factorial of any number entered by user?
(Hint:Factorial of a number n= n*(n-1)*(n-2)*(n-3)*........*1  and 
exists only for positive numbers only and we write factorial of n as n!
so factorial of 0! = 1, 1! = 1,2! = 2,3! = 6,4! = 24 and so on....)
Note: Please dont confuse Factorial(!) with Not Equal To operator (!=) they are not same
/*
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a number:");
        int number =sc.nextInt();

        int factorial = 1;
       

        for(int i=1;i<=number;i++){
            factorial=factorial * i;
        }
        System.out.println("factorial is :" + factorial);
   
*/         


//Question 4: Write a program to print multiplication table of any N number entered by user?
/*
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a number:");
        int num =sc.nextInt();
        for(int i=0;i<=20;i++){
            System.out.println( num + " X " +  i + " = " + num*i);
        }
        
   
*/         
    }
}
 



                        