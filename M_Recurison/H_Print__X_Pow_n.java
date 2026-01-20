public class H_Print__X_Pow_n{

public static int Power_fn(int X, int n){

    if( n == 0){
        return 1;
    }

    return X * Power_fn(X,n-1);
}

public static void main(String args[]){

    int result;
    
    result = Power_fn(2,5);
    System.out.println(result);
}
}