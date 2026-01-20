import java.util.Scanner;
public class F_Butterfly_Pattern
{ 

/*EX-1 : Print Pattern -- Butterfly
    X                 X 
    X X             X X
    X X X         X X X
    X X X X     X X X X
    X X X X X X X X X X
    X X X X X X X X X X
    X X X X     X X X X
    X X X         X X X
    X X             X X
    X                 X                                       */
//*
    
    public static void Butterfly_fn (int n)
    {

        for(int i=1; i<=n; i++){

                //Stars
                for(int j=1; j<=i; j++){
                    System.out.print("X ");
                }

                //Spaces--2*(n-i)
                for(int j=1; j<= 2*(n-i); j++){
                    System.out.print("  ");
                }

                //Stars-i
                for(int j=1; j<=i; j++){
                    System.out.print("X ");
                }
        System.out.println();
        }


        for(int i=n; i>=1; i--){

                //Stars
                for(int j=1; j<=i; j++){
                    System.out.print("X ");
                }

                //Spaces--2*(n-i)
                for(int j=1; j<= 2*(n-i); j++){
                    System.out.print("  ");
                }

                //Stars-i
                for(int j=1; j<=i; j++){
                    System.out.print("X ");
                }
        System.out.println();
        }
    }

/*
*/   

    public static void main (String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n =sc.nextInt();
        Butterfly_fn(n);
    
    }  
/*              
*/  

}