//Creating an 2D Array
/*
Synatx: 
        Datatype ArrayName/Matrix[][] = new Datatype [Row][Column];
*/
import java.util.*;
public class D_Sum_of_Diagnol_In_Two_D_Array{
    
    public static void Sum_Of_Diagnol_2D_Array_fn(int Matrix[][]){
        int n = Matrix.length;
        int m = Matrix[0].length;

        int Sum = 0;

        if (n != m){
            System.out.println("Please provide a Square matrix");
            return;
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if( i == j)
                {
                    System.out.println( Matrix[i][j]); 
                    Sum += Matrix[i][j];
                    System.out.println( "Curr Sum = " + Sum);
                }  
                else if( i + j == m-1)
                {
                    System.out.println( Matrix[i][j]); 
                    Sum += Matrix[i][j];
                    System.out.println( "Curr Sum = " + Sum);
                } 
            }
        }
        System.out.println( "Total Sum = " + Sum);             
    }
    
    
    public static void main (String args[])
    {
 
        int MatrixOdd [][] = { {1,2,3},
                               {4,5,6},
                               {7,8,9} };

        int MatrixEven [][] = { {1,2,3,4},
                                {5,6,7,8},
                                {9,10,11,12},
                                {13,14,15,16} };                    
        
        Sum_Of_Diagnol_2D_Array_fn(MatrixEven);
        Sum_Of_Diagnol_2D_Array_fn(MatrixOdd);
    }   

}

        
 

      
        
       

