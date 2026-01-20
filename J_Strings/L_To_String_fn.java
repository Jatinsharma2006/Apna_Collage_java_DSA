/*
.toString() fn can convert anything to String 
but it should have a object datatype
Ex:
        cant convert --- int ,float ,char

        can convert  --- Integer,Float,StringBuilder,Character
*/
import java.util.*;
public class L_toString_fn {
    public static void main (String args[])
    {

        Integer a = 10;
        a.toString();
        System.out.println( a );

        Float b = 10f;
        b.toString();
        System.out.println( b );

        Character ch = 'a';
        ch.toString();
        System.out.println( ch );

        StringBuilder Fruit = new StringBuilder ("Mango");
        Fruit.toString();
        System.out.println( Fruit );

    }
}
