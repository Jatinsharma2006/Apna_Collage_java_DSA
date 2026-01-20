/*Possible Subarray of an Array        [ 2 | 4 | 6 | 8 | 10 ]

All possible Subarray of this array is 

        [2] [2|4] [2|4|6] [2|4|6|8] [2|4|6|8|10]
        [4] [4|6] [4|6|8] [4|6|8|10]
        [6] [6|8] [6|8|10]
        [8] [8|10]
        [10]

*/
import java.util.*;
public class J_Possible_Subarray_Of_An_Array{

    public static void PrintArrayfn(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }


    public static void Subarray_of_An_Array_fn (int numbers[])
    {
        int Start = 0;
        int End = 0;
        int TotalSubarray = 0;
        for(int i=0; i<numbers.length; i++)
        {
            Start = i;
            for(int j=i; j<numbers.length; j++)
            {
                End = j;
                System.out.print("[ ");
                for (int k=Start; k<=End ;k++){
                    System.out.print(numbers[k] );
                    if (k != End){
                        System.out.print(" | ");
                    }
                }
                System.out.print("]     ");
                TotalSubarray++;
            }
            System.out.println();
        }
        System.out.println("TotalSubarray = " + TotalSubarray);
        
    }
    
    public static void main (String args[])
    {
        int numbers[] = {2,4,6,8,10};

        PrintArrayfn(numbers);

        Subarray_of_An_Array_fn(numbers);
    }
}
