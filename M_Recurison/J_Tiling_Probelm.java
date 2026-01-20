public class J_Tiling_Problem{

public static int Tiling_Problem(int n){

    //Base Case
    if( n == 0 ||n == 1){
        return 1;
    }
    //Choices
        //Vertical choice
        int fnm1 = Tiling_Problem(n-1);

        //Horizontal choice
        int fnm2 = Tiling_Problem(n-2);

    
    int Total_Ways = fnm1 + fnm2;
    return Total_Ways;
}

public static void main(String args[]){

    int result;
    result = Tiling_Problem(5);
    System.out.println(result);
}
}