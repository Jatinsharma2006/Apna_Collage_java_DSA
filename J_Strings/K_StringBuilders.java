/*
String Builders

        Syntax :  StringBuilder VariableName = new StringBuilder("Value");
*/
import java.util.*;
public class K_StringBuilders {

    public static void main (String args[])
    {
        
        StringBuilder Fruit = new StringBuilder ("Mango");

        for(char ch ='a'; ch <= 'z';  ch++)
        {
            Fruit.append(ch);
            System.out.println(Fruit);
        }
        System.out.println(Fruit);
        System.out.println(Fruit.length());

    }
}
