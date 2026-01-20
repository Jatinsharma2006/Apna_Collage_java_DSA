public class Fabonacci_Series{

public static int fib(int n){

    if (n == 0 || n == 1){
        return n;
    }
    int fib_N_m_1 = fib(n-1);
    int fib_N_m_2 = fib(n-2);

    int fib_N = fib_N_m_1 + fib_N_m_2 ;
    return fib_N;
}

public static void main(String args[]){

    System.out.println(fib(5));
    System.out.println(fib(8));
    System.out.println(fib(23));
    System.out.println(fib(24));
    System.out.println(fib(25));
    System.out.println(fib(26));
    System.out.println(fib(27));
    System.out.println(fib(28));

}
}