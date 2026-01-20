public class L_FastExponentiation {

    public static int fastPower(int a, int n) {
        
        int ans = 1;

        while (n > 0) {
            if ((n & 1) == 1) {   
                ans = ans * a;
            }
            a = a * a;           
            n = n >> 1;          
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastPower(3,5)); 
    }
}

/*
a = 3, n = 5

1.Ans = 1 

    (n(5) > 0) {

                n & 1 = 101 & 1  =>    1 & 0 = 0 
                                       0 & 0 = 0
                                       1 & 1 = 1

                001 != 0  so do     ans = ans * a;
                                    ans = 1 * 3
                                    ans = 3
                    
                a = 3 * 3   //a^2
                a = 9

                n = n>>1 
                n = 101>>1   =>010  => 2
                n = 2
}




2. Ans =3, A = 9 , n = 2 or 010

    while (2>0){
                n & 1 => 2 & 1 => 010 & 001 =>  1 & 0 = 0
                                                0 & 1 = 0

                00 = 0 so skip if part
                
                a = 9 * 9 ;   //a^4
                a = 81
                
                n = n >> 1; 
                    2 >> 1; 
                    010 >> 1   =>001  =>1
    }



3. Ans 3, A = 81 , n = 1 or 001

    while (1>0){
                n & 1 => 1 & 1 => 001 & 001 => 1 & 1 = 1

                1 != 0 so do    ans = ans *a;
                                ans = 81 * 3 
                                ans = 243

                a = 81 * 81 
                a = 6561

                n = n >> 1; 
                    1 >> 1; 
                    001 >> 001   =>000  =>0
    }

4. Ans = 243 , A = 6561, n = 0

    while (0>0 //false )   //loop end 

return ans = 243.



*/