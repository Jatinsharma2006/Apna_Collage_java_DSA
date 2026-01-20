//Approach I : Using a Backward Loop

import java.util.*;
public class H_Reversing_An_Array{

    public static void PrintArrayfn(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
    }


    public static void Approach_I_Reversing_Array_fn (int numbers[],int reversed[])
    {
        int j=0;
        for( int i=numbers.length-1 ; i>=0 ; i-- )
        {
            reversed[j] = numbers[i];
            j++;
        }
    }
    
    public static void main (String args[])
    {
        int numbers[] = {2,4,6,8,10,12,14};

        int reversed[] = new int [numbers.length];

        Approach_I_Reversing_Array_fn(numbers,reversed);

        PrintArrayfn(numbers);
        System.out.println();
        PrintArrayfn(reversed);

        

        

        
    }
}
