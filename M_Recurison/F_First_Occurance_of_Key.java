public class First_Occurance_of_Key{

public static int first_Occurance_of_Key (int arr[] , int Key ,int i ){

    if( arr[i] == Key){
        return i;
    }

    if( i == arr.length-1){
        return -1;
    }

    return first_Occurance_of_Key(arr,Key,i+1);
}

public static void main(String args[]){

    int i = 0;
    int result;

    int Key = 10;
    int arr[] = {1,2,4,6,8,10};

    result = first_Occurance_of_Key(arr,Key,i);
    System.out.println(result);
}
}