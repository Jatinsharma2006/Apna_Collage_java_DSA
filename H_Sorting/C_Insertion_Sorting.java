import java.util.*;
public class C_Insertion_Sorting{

    public static void Insertion_Sort_Fn (int UnSortedArray[])
    {    
        for(int i=1; i<UnSortedArray.length; i++)
        {
            int Curr = UnSortedArray[i];
            int Previous = i-1;
            //for decending all we have to do is 
            // while( Previous >= 0 && UnSortedArray[Previous]< Curr )
            while( Previous >= 0 && UnSortedArray[Previous]> Curr )
            {
                UnSortedArray[Previous+1] = UnSortedArray[Previous];
                Previous--;
            }
            UnSortedArray[Previous+1] = Curr;
        }
    }
    
    public static void main (String args[])
    {
        int UnSortedArray[] = {5,4,1,3,2,7};
        Insertion_Sort_Fn(UnSortedArray);
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
