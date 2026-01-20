//Creating an 2D Array
/*
Synatx: 
        Datatype ArrayName/Matrix[][] = new Datatype [Row][Column];
*/
import java.util.*;
public class B_Search_In_Two_D_Array{
    
    public static boolean Search_2D_Array_fn(int Matrix[][],int Key){
        int n = Matrix.length;
        int m = Matrix[0].length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if( Matrix[i][j] == Key)
                {
                    System.out.println("Key" + Matrix[i][j] + "Found at " + "( "+ i + "," + j +" )"); 
                    return true;
                }  
            }
        } 
        System.out.println(" Key Not Found ");
        return false;             
    }
    
    
    public static void main (String args[])
    {
 
        int Matrix [][] = { {1,2,3},
                            {4,5,6},
                            {7,8,9} };
        int Key = 15;
        
        System.out.println(Search_2D_Array_fn(Matrix,Key));
    }   

}

        
 

      
        
       

