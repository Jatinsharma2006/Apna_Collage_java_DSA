import java.util.Scanner;

public class Question_Set_A{
    
    public static void main (String args[])
    {

//Question 1: In a program input 3 numbers A,B,C. 
//You have to output average of these 3 numbers.
        
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 number");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int average = ((a+b+c)/3);

        System.out.println("average is "+ average);
        */

//Question 2: In a program input side of square 
//You have to output area of square.

        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Side of square");
                int side = sc.nextInt();
                int area = side*side;

        System.out.println("Area of square is "+ area);
        */


/*Question 3: Enter cost of 3 item from user(using Float dataypes)
                        -a pencil,a pen and eraser.
You have to output total cost of the item back to user as their bill
(ADD ON: You can also try adding 18% gst tax to items in the bill as on advanced problem)*/

        Scanner sc=new Scanner(System.in);
                System.out.println("Enter price of Pencil");
                        float pencil = sc.nextFloat();

                System.out.println("Enter price of Pen");
                        float pen = sc.nextFloat();

                System.out.println("Enter price of Eraser");
                        float eraser = sc.nextFloat();

                float Total= pencil+pen+eraser;
                System.out.println("Total is "+ Total);
        //ADD ON:18% gst
                float newTotal= Total+((18*Total)/100);
                System.out.println("Total after gst is "+ newTotal);







//Question 4: What will be datatype of result in this code
// HINT-- look for the largest datatype among them
        /*
        byte b = 4;
        char c = 'a';
        short s = 510;
        int i = 10000;
        float f = 20.36f;
        long l = 25;
        double d = 99.999945;

        result =((f*b)+(1%c)-(d*5))l;
        //Answer = double
        */


//Question 5:(Advance) Will the following statement give any error in java 
                        int $ =20;

//No the statement wont give any error 

//Named variables are known as indentifiers in programming language
//And Identifiers can start with any 
// alphabet or underscore('_')and dollor($) also

    }
}

