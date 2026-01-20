public class Last_Occurance_of_Key{

public static int last_Occurance_of_Key (int arr[] , int Key ,int i ){

    if( arr[i] == Key){
        return i;
    }

    if( i < 0){
        return -1;
    }

    return last_Occurance_of_Key(arr,Key,i-1);
}

public static void main(String args[]){

    
    int result;

    int Key = 2;
    int arr[] = {1,2,4,6,2,8,10};
    int i = arr.length-1;

    
    result = last_Occurance_of_Key(arr,Key,i);
    System.out.println(result);
}
}