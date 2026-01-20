//Inbuilt sort 

/*
Syntax :  import java.util.Arrays; 
          Arrays.sort(arrayname);
*/ 
import java.util.*;
public class D_Count_Sorting{
    public static void main (String args[])
    {

        int UnSortedArray[] = {5,4,1,3,2,7};
        int UnSortedArray2[] = {5,4,1,3,2,7};


//Ex-1 : A Basic Sort using In-built fn  
        /*
        Syntax :  import java.util.Arrays; 
                   Arrays.sort(arrayname);
        */ 
        Arrays.sort(UnSortedArray);
        PrintArrayfn(UnSortedArray);


//Ex-2 : Sorting only few indexes
        /*
        Syntax :  
                  Arrays.sort(arrayname, Starting index , Ending index);
        */

        Arrays.sort(UnSortedArray2,0,3);
        PrintArrayfn(UnSortedArray2);

//Ex-3 : Sorting in Decending order
        /*
        Syntax: import java.util.Collections;
                Arrays.sort(arrayname,Si ,Ei ,Collection.reverseOrder());
        */
        Integer UnSortedArrayR[] = {5,4,1,3,2,7};
        Arrays.sort(UnSortedArrayR,0,3,Collections.reverseOrder());
        PrintArrayfn(UnSortedArrayR);

/*
Note: 
while doing it decending order 
it dont take  input --- int Array 
so we have to change it to ----Interger Array           */

    }



    public static void PrintArrayfn(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void PrintArrayfn(Integer arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}
