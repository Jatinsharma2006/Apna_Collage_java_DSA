
import java.util.Scanner;

public class J_Area_of_Circle_TakingInput_Radius{
    
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Radius");
        Float radius=sc.nextFloat();

        /*
        Float area = 3.14*radius*radius;
                     double*float*Float
        it will give compilation error as a java consider decimal values by default as double datatype not float 
        */


  //To Solve this we use f after decimal value this  make them float 
        Float area = 3.14f*radius*radius;
        System.out.println(area);
    }
}


