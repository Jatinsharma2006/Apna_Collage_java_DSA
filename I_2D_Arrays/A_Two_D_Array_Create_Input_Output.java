//Creating an 2D Array
/*
Synatx: 
        Datatype ArrayName/Matrix[][] = new Datatype [Row][Column];
*/
import java.util.*;
public class A_Two_D_Array_Create_Input_Output{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);


//Creating a 2D Array
        
        int Matrix [][] = new int [3][3];
        int n = Matrix.length;
        int m = Matrix[0].length;
        System.out.println( n );
        System.out.println( m );


//Inserting items        
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {   System.out.print("Enter items : ");
                Matrix[i][j] = sc.nextInt(); 
            }
        }


//Output items        
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.println( Matrix[i][j] + "  "); 
            }
            System.out.println(); 
        }           

        
    }
}
