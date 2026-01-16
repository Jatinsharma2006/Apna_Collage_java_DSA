//Type conversion 
//byte->short->int->float->long->double

import java.util.Scanner;

public class K_Type_Conversion{
    
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a non decimal value");
        float input=sc.nextInt();
        System.out.println(input);
    }
}

/*here 
This program take int(non-decimal) values as input and then convert it into float(decimal values)
Input:16
Output:16.0
*/
