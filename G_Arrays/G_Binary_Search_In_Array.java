

import java.util.*;
public class G_Binary_Search_In_Array{
    
    public static int Binary_Search (int numbers[],int key)
    {

        int Start = 0 ;
        int End = numbers.length - 1 ;

        while (Start <= End)
        {
            int mid = (Start+End)/2;  

            if(numbers[mid] == key )
            {
                return mid ;
            }

            if(numbers[mid] > key )
            {
                End   = mid -1;
            }
            else
            {
                Start = mid +1 ;
            }
            
        }
        return -1 ;
    }
    
    public static void main (String args[])
    {
        int numbers[] = {2,4,6,8,10,12,14};

        int key = 12 ;

        int index = Binary_Search(numbers,key);

        System.out.println("Key : " + key +" is at index : " + index );
    }
}
