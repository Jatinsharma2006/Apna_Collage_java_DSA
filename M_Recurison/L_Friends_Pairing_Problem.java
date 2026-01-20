public class L_Friends_Pairing_Problem{

public static int Friends_Pairing_Problem_fn( int n ){

    if (n == 1 || n == 2 )
    {
        return n;
    }
    //Choice

    //Single
    int fnm1 = Friends_Pairing_Problem_fn( n-1 );
       
    //Pairing
    int fnm2 = Friends_Pairing_Problem_fn( n-2 );
    int pairways =  (n-1)*fnm2;

    int Totalways = fnm1 + pairways;
          
    return Totalways;
}

public static void main(String[] args){

    System.out.println(Friends_Pairing_Problem_fn(5));

}


}

