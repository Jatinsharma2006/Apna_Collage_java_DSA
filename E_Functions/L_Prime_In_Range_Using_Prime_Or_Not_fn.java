//Check if a number is Prime or Not

public class L_Prime_In_Range_Using_Prime_Or_Not_fn {

    public static boolean Is_Prime (int i){
        if (i==2) {
            return true;
        }
        for (int j=2;j<=i-1; j++) {
            if(i % j == 0) {
                return false;
            }
        }
    return true;
    }


    public static void Prime_In_Range (int n){
        
        for (int i=0;i<=n; i++) {
            if(Is_Prime(i)) {
                System.out.println(i + " ");
            }
        }
    }




    public static void main (String args[])
    {
        Prime_In_Range(33);
    }
}