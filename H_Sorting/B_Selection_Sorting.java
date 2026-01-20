import java.util.*;
public class B_Selection_Sorting{

    //for decreasing order all we have to do is 
    // if (UnSortedArray[minPos] < UnSortedArray[j] )


    public static void Selection_Sort_Fn (int UnSortedArray[])
    {    
        for(int i=0; i<UnSortedArray.length-1; i++)
        {
            int minPos = i;
            for(int j=i+1; j<UnSortedArray.length; j++)
            {
                if (UnSortedArray[minPos] > UnSortedArray[j] )
                { 
                   minPos = j;
                } 
            }
            int temp = UnSortedArray[minPos];
            UnSortedArray[minPos] = UnSortedArray[i];
            UnSortedArray[i] = temp;
        }
    }
    
    public static void main (String args[])
    {
        int UnSortedArray[] = {5,4,1,3,2,7};
        Selection_Sort_Fn(UnSortedArray);
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
