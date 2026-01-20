import java.util.Scanner;
public class A_Right_Triangles
{ 
    public static void main (String args[])
    {
/*EX-1 : Print Pattern -- Right Traingle(half Pyramid) 

    *
    **
    ***
    ****                                             */
/*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n =sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
            System.out.print("*");
            }
            System.out.println();
        }
         System.out.println(" Out of loop ! ");      
*/  


/*EX-2 : Print Pattern -- Inverted Right Triangle(Half Pyramid)   
                        
    ****
    ***
    **
    *                                        */
/*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n =sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
            System.out.print("*");
            }
            System.out.println();
        }
         System.out.println(" Out of loop ! ");      
*/ 


/*EX-3 : Print Pattern -- Right Traingle(half Pyramid) with numbers  

    1
    12
    123
    1234                                       */
/*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n =sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
            System.out.print(j);
            }
            System.out.println();
        }
         System.out.println(" Out of loop ! ");      
*/  


/*EX-4 : Print Pattern -- Right Traingle(half Pyramid) with character  

    A
    BC
    DEF
    GHIJ                                       */
/*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n =sc.nextInt();
        char ch = 'A';

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
            System.out.print(ch);
            ch++;
            }
            System.out.println();
        }
         System.out.println(" Out of loop ! ");      
*/ 

/*EX-5 : Print Pattern -- Inverted Right Traingle(half Pyramid) with number 1 to n  

    1 2 3 4 5
    1 2 3 4 
    1 2 3                                   
    1 2 
    1                                                         */

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n =sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
            System.out.print(j);
            }
            System.out.println();
        }   
    





    }
}