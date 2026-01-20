//Break Keyword

/*Synatx:
        loop
        { 
            //do something
            if(condition){
                break;
            }
        }
*/


import java.util.Scanner;
public class D_Break_Keyword_Loop
{ 
    public static void main (String args[])
    {

//EX-1 : Break when counter =27;
// using for loop
/*
        for(int i=0; i<=50; i++){
            System.out.println(i);
            if(i==27){
                break;
            }
        }
        System.out.println(" Out of loop ! ");
*/

/*
EX-2 : Let user enter number 
Break when user enter multiple of 10
Using do loop */
/*
        Scanner sc=new Scanner(System.in);
        
       do{
            System.out.print("Enter a number:");
            int n =sc.nextInt();
            System.out.println(n);
            if(n%10==0){
                break;
            }
        }while(true);

*/      
    
    }
}



                        