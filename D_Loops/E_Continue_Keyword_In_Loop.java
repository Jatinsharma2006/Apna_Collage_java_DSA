//Continue Keyword

/*Synatx:
        loop{ 
            //do something
            if(condition){
                continue;
            }
        }
*/


import java.util.Scanner;
public class E_Continue_Keyword_Loop
{ 
    public static void main (String args[])
    {

//EX-1 : Continue/Skip when i = 27;
// using for loop
//*
        for(int i=0; i<=50; i++){
            
            if(i==26|i==27|i==28|i==29|i==30){
                continue;
            }
            System.out.println(i);
        }
        System.out.println(" Out of loop ! ");
//*/

/*EX-2 : Let user enter number except multiple of 10
Continue/Skip when user enter multiple of 10
using do loop */
//*
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter a number:");
            int n =sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }while(true);

//*/      
    
    }
}



                        