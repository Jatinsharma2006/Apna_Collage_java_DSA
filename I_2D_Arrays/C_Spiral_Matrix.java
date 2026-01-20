//Creating an 2D Array
/*
Synatx: 
        Datatype ArrayName/Matrix[][] = new Datatype [Row][Column];
*/
import java.util.*;
public class C_Spiral_Matrix{
    
    public static void Print_Spiral_Matrix_fn(int Matrix[][]){
        int n = Matrix.length;
        int m = Matrix[0].length;


        int StartingRow = 0 ;
        int StartingCol = 0 ;
        int EndingRow = n-1  ;
        int EndingCol = m-1  ;


        while( StartingRow <= EndingRow && StartingCol <= EndingCol )
        {
            //Right 
            for(int j=StartingCol; j<=EndingCol; j++)
            {
                System.out.print(Matrix[StartingRow][j] + "  "); 
            }

            //Down 
            for(int i=StartingRow+1; i<=EndingRow; i++)
            {
                System.out.print(Matrix[i][EndingCol] +"  "); 
            }

            //Left 
            if (StartingRow < EndingRow) 
            { 
                for(int j=EndingCol-1; j>=StartingCol; j--)
                {
                    System.out.print(Matrix[EndingRow][j] + "  ");
                } 
            }
               
          
            //Top 
            if (StartingCol < EndingCol) 
            {  
                for(int i=EndingRow-1; i>StartingRow; i--)
                {
                     System.out.print(Matrix[i][StartingCol] +"  "); 
                }
            }
           
        StartingRow ++;
        StartingCol ++;
        EndingRow -- ;
        EndingCol --;
        }  
        System.out.println(); 
    }
    
    
    public static void main (String args[])
    {
        int Matrix [][] = { {1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16} };
        
        Print_Spiral_Matrix_fn(Matrix);
    }   

}

        
 

      
        
       

