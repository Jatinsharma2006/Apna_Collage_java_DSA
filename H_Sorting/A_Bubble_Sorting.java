import java.util.*;
public class A_Bubble_Sorting{

    public static void Bubble_Sort_Fn (int UnSortedArray[])
    {    
        for(int i=0; i<UnSortedArray.length-1; i++)
        {
            for(int j=0; j<UnSortedArray.length-1-i; j++)
            {
                if (UnSortedArray[j] > UnSortedArray[j+1] ) //if 1st element is greater then 2nd Swap  
                { 
                    int temp = UnSortedArray[j];
                    UnSortedArray[j] = UnSortedArray[j+1];
                    UnSortedArray[j+1] = temp;
                }
            }
        }
    }
    
    public static void main (String args[])
    {
        int UnSortedArray[] = {5,4,1,3,2,7};
        Bubble_Sort_Fn(UnSortedArray);
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
