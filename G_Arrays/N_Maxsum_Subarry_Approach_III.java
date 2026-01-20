//Approach 3 : Kadane's algorithm

import java.util.*;
public class N_Maxsum_Subarry_Approach_III{


    public static void Maxsum_Subarray_Kandanes_Algo (int numbers[])
    {                                                                                                           
        int MaxSum = Integer.MIN_VALUE;
        int Currsum = 0;

        for(int i=1; i<numbers.length; i++)
        {
            Currsum = Currsum + numbers[i];
            if (Currsum < 0){
                Currsum = 0 ;
            }
            MaxSum = Math.max(Currsum,MaxSum);
        }
        System.out.println("MAXSUM is " + MaxSum);
    }    
    
    public static void main (String args[])
    {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};

        Maxsum_Subarray_Kandanes_Algo(numbers);
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