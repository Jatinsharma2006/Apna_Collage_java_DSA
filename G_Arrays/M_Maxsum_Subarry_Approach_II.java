//Approach 2 : Prefix Sum Appoach

import java.util.*;
public class M_Maxsum_Subarry_Approach_II{


    public static void Maxsum_Subarray_fn (int numbers[])
    {                                                                                                           
        int Prefix[] = new int [numbers.length];

        Prefix[0] = numbers[0];   //Speacial case

        for(int i=1; i<numbers.length; i++)
        {
            Prefix[i] = Prefix [i-1] + numbers[i];
        }
        int MaxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++)
        {                                                                        
            for (int j=i; j<numbers.length ; j++)
            {   
                
                int Currsum = 0;    
                Currsum = i == 0 ? Prefix [j] : Prefix[j] - Prefix[i-1];
                if (Currsum > MaxSum){
                        MaxSum = Currsum ;
                }
            }
            System.out.println("CURRSUM is " + Currsum);
            Currsum = 0 ;
        }
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