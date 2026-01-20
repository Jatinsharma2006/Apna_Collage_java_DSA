public class Is_Sorted_or_not{

public static boolean is_Sorted(int arr[] , int i){

    if( i == arr.length-1){
        return true;
    }
    
    if( arr[i] > arr[i+1] ){
        return false;
    }

    return is_Sorted(arr,i+1);
}

public static void main(String args[]){

    int i = 0;
    boolean result;

    int arr[] = {1,2,4,6,8,10};
    result = is_Sorted(arr,i);
    System.out.println(result);


    int arr2[] = {6,1,8,2,5,10};
    result = is_Sorted(arr2,i);
    System.out.println(result);
}
}