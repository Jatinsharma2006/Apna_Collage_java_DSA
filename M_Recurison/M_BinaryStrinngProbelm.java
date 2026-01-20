public class M_BinaryStrinngProbelm{

public static void BinaryString_fn( String Str,int n ,int LP){

    if (n == 0)
    {
        System.out.print(Str + "\n");
        return;
    }

    
    if(LP == 0)
    {
        //Choice
        BinaryString_fn( Str + "0", n-1, 0 );
        BinaryString_fn( Str + "1", n-1, 1 );
    } 
    else
    {
       BinaryString_fn( Str + "0", n-1, 0 );
    }
}

public static void main(String[] args){

    BinaryString_fn("", 5 , 0);

}


}

