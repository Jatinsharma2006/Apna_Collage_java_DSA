import java.util.*;
public class D_Count_Sorting{

    public static void Count_Sort_Fn (int UnSortedArray[])
    {   
        int Largest = Integer.MIN_VALUE; 
        for(int i=0; i<UnSortedArray.length; i++)
        {            
            Largest = Math.max(Largest,UnSortedArray[i]);
        }

        int Count[] = new int [Largest+1];

        for(int i=0; i<UnSortedArray.length; i++)
        {            
            Count[UnSortedArray[i]]++;
        }


        int j = 0 ;

        for(int i=0; i<Count.length; i++)
        {   
            while(Count[i] > 0)
            {
                UnSortedArray[j] = i;
                j++;
                Count[i]--;
            }      
            
        }
    }
    
    public static void main (String args[])
    {
        int UnSortedArray[] = {5,4,1,3,2,7};
        Count_Sort_Fn(UnSortedArray);
        PrintArrayfn(UnSortedArray);
    }



    public static void PrintArrayfn(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}
