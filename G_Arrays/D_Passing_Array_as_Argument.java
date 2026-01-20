//Call by Reference

import java.util.*;
public class C_lenght_of_Array_n_Finding_Percentage{
    
    public static void Update (int Marks[],int nonchangeable)
    {
        //This fn change  value  of nonchangeable and  value of items inside array 
        nonchangeable=10;

        for(int i=0;i<Marks.length;i++)
        {
            Marks[i] = Marks[i] + 1;
        }
    }
    
    
    public static void main (String args[])
    {
        int Marks[] = {97,98,99};

        int nonchangeable = 5;

        Update(Marks,nonchangeable);
        
        //Printing value of nonchangeable and items of array after changing them in update fn
        System.out.println(nonchangeable);

        for(int i=0;i<Marks.length;i++)
        {
            System.out.println( Marks[i] +" ");
        }
        System.out.println();

    }
}
/*
Output:
5
98 
99
100                                                            */