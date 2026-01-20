/*Possible Pairs of an Array        [ 2 | 4 | 6 | 8 | 10 ]

All possible pairs of this array is 

        (2,4) (2,6) (2,8) (2,10)
        (4,6) (4,8) (4,10)
        (6,8) (6,10)
        (8,10)

*/
import java.util.*;
public class J_Possible_Pairs_Of_An_Array{

    public static void PrintArrayfn(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }


    public static void Pair_of_An_Array_fn (int numbers[])
    {
        int TotalPairs = 0;
        for(int i=0; i<numbers.length; i++)
        {
            for(int j=i+1; j<numbers.length; j++)
            {
                System.out.print( "(" + numbers[i] + "," + numbers[j] + ")");
                TotalPairs++;
            }
            System.out.println();
        }
        System.out.println("TotalPairs" + TotalPairs);
    }
    
    public static void main (String args[])
    {
        int numbers[] = {2,4,6,8,10,12,14};

        PrintArrayfn(numbers);

        Pair_of_An_Array_fn(numbers);
    }
}
