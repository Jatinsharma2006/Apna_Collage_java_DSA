//Approach I : Swapping values of orignal array

import java.util.*;
public class I_Reversing_An_Array{

    public static void PrintArrayfn(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
    }


    public static void Approach_II_Reversing_Array_fn (int numbers[])
    {
        int First = 0 ;
        int Last  = numbers.length-1 ;
        int temp = 0 ;
        while(First < Last)
        {
            //Swap
            temp = numbers[First];
            numbers[First] = numbers[Last] ;
            numbers[Last]  = temp ;
            
            First++ ;
            Last--  ;
        }
    }
    
    public static void main (String args[])
    {
        int numbers[] = {2,4,6,8,10,12,14};

        PrintArrayfn(numbers);

        Approach_II_Reversing_Array_fn(numbers);

        System.out.println();

        PrintArrayfn(numbers);
        

        

        

        
    }
}
