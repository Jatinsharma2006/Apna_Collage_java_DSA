//Approach 1 : LOOP THROUGH EVERY SUBARRAY AND FNIDING THEIR SUM 
// MAXSUM < CURRSUM ??

import java.util.*;
public class L_Maxsum_Subarry_Approach_I{


    public static void Maxsum_Subarray_fn (int numbers[])
    {                                                                                                           int TotalSubarray = 0;
        int MaxSum = Integer.MIN_VALUE;
        int Currsum = 0;

        for(int i=0; i<numbers.length; i++)
        {
            
            for(int j=i; j<numbers.length; j++)
            {                                                                                                  System.out.print("[ ");
                for (int k=i; k<=j ;k++)
                {                                                                                              System.out.print(numbers[k] );  if (k != j){System.out.print(" | ");}
                    Currsum += numbers[k];
                }                                                                                              System.out.print("]");     TotalSubarray++;
                if (Currsum > MaxSum){
                            MaxSum = Currsum ;
                    }
                System.out.println("CURRSUM is " + Currsum);
                Currsum = 0 ;
            }                                                                                                  System.out.println();                
        }                                                                                                      System.out.println("TotalSubarray = " + TotalSubarray);
        System.out.println("MAXSUM is " + MaxSum);
    }
    
    public static void main (String args[])
    {
        int numbers[] = {1,-2,6,-1,3};

        Maxsum_Subarray_fn(numbers);
    }

}
/*MaxSum Subarray of an Array        [ 1 | -2 | 6 | -1 | 3 ] 

        [1] [1|-2] [1|-2|6] [1|-2|6|-1] [1|-2|6|-1|3]
         V     V       V         V            V 
Sum      1    -1       5         4            7

        [-2] [-2|6] [-2|6|-1] [-2|6|-1|3]
         V      V       V          V         
        -2      4       3          6

        [6] [6|-1]  [6|-1|3]
         V    V         V                
         6    5         8      
        [-1] [-1|3]
          V     V                    
         -1    2      
        [3]
         V                       
         3 

        MAXSUM : 8
*/