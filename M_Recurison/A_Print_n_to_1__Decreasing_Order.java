public class Print_n_to_1__Decreasing_Order{

public static void PrintDec(int n){

    if (n==1){
        System.out.println(n);
        return;
    }
    System.out.println(n + " ");
    PrintDec( n-1 );
    
}

public static void main(String args[]){

    int n = 10;
    PrintDec(n);

}
}