//Check if a number is Prime or Not

public class K_Prime_Or_Not_fn {

    public static boolean Prime_Or_Not_fn (int n){
        
        if (n == 2) {
            return true;
        }

        for (int i=2;i<=n-1; i++) {
            if ( n % i == 0) {
                return false;
            }
        }
        
    return true;
    }


    public static void main (String args[])
    {
        System.out.println(Prime_Or_Not_fn(5));
        System.out.println(Prime_Or_Not_fn(2));
        System.out.println(Prime_Or_Not_fn(3));
        System.out.println(Prime_Or_Not_fn(4));
        System.out.println(Prime_Or_Not_fn(6));
    }
}