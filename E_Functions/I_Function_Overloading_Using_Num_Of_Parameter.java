

//One fn will take 2 parameter, second fn will take 3 parameter.



public class  I_Function_Overloading_Using_Num_Of_ParameterFunction {

    public static int sum (int a, int b){
        return a+b;
    }


    public static int sum (int a, int b, int c){
        return a+b+c;
    }


    public static void main (String args[]){
        System.out.println(sum (3,5));
        System.out.println(sum (3,2,1));
    }
}