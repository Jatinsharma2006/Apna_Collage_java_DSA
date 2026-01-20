public class Sum_fn{

public static int sum(int n){

    if (n==1){
        return 1;
    }
    int Sum = n + sum(n-1);
    return Sum;
}

public static void main(String args[]){

    int n = 5;
    System.out.println(sum(n));

}
}