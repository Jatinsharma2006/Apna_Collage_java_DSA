

import java.util.*;
public class F_Largest_n_Smallest_Element_In_Array{
    
    public static void Largest_n_Smallest (int numbers[])
    {

        int Largest = Integer.MIN_VALUE ;
        int Smallest = Integer.MAX_VALUE ;

        for(int i=0;i< numbers.length;i++)
        {
            if(numbers[i] > Largest )
            {
                Largest = numbers[i];
            }

            if(numbers[i] < Smallest )
            {
                Smallest = numbers[i];
            }
        }
        System.out.println("Largest is " + Largest );
        System.out.println("Smallest is " + Smallest );
    }
    
    
    public static void main (String args[])
    {
        int numbers[] = {2,4,6,8,10,12,14};

        Largest_n_Smallest(numbers);
    }
}
