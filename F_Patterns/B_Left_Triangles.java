import java.util.Scanner;
public class B_Left_Triangles
{ 

/*EX-1 : Print Pattern -- Left Traingle(Rotated half Pyramid) 
        *       
       **
      *** 
     ****
    ***** 
   ******                               */
//*
    
    public static void Left_triangle (int n)
    {
        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        System.out.println();
        }    
    }

    public static void main (String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n =sc.nextInt();
        Left_triangle(n);
    
    }
    
    
    
    
    
    
    
/*    
    

          
*/  

}