
import java.util.Scanner;

public class B_Arithmetic_Unary_Operator{
    /*
    PreIncrement  ++a
    PostIncrement a++

    PreDecrement  --a
    PostDecrement a--
    */
    
    public static void main (String args[])
    {
        int a = 5;
        System.out.println("A value:"+ a);

        //preincerement
        System.out.println("A value at preincerement:"+ (++a));
        System.out.println("A value after preincrement"+ a);

        //postincerement
        System.out.println("A value at postincerement:"+ (a++));
        System.out.println("A value after postincrement"+ a);


        int b = 5;
        System.out.println("A value:"+ b);

        //predecerement
        System.out.println("A value at predecerement:"+ (--b));      //value change
        System.out.println("A value after predecrement"+ b);         //value use

        //postdecerement
        System.out.println("A value at postdecerement:"+ (b--));    //value use
        System.out.println("A value after postdecrement"+ b);       //value change


    
    }
}

/*
int x = 5;
  int y = ++x; // y is 6, x is 6
  int z = x++; // z is 6, x is 7

int x = 5;
  int y = --x; // y is 4, x is 4
  int z = x--; // z is 4, x is 3
  */