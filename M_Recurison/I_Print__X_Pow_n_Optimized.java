public class I_Print__X_Pow_n_Optimized{

public static int Optimized_Power_fn(int X, int n){

    if( n == 0){
        return 1;
    }

    int halfpower = Optimized_Power_fn(X,n/2);
    int halfpowersq = halfpower*halfpower;

    if(n%2 != 0){
       halfpowersq = X * halfpowersq;
    }
    return halfpowersq;
}

public static void main(String args[]){

    int result;
    
    result = Optimized_Power_fn(2,5);
    System.out.println(result);
}
}

// int halfpowersq = Optimized_Power_fn(X,n/2)*Optimized_Power_fn(X,n/2);