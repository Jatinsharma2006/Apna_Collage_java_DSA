/*

1. creating a custom fn 
2. Using In-built fn  Syntax :  StringName.substring(si,ei)
*/
import java.util.*;
public class J_Largest_String_Using_Compare_To_fn {

    public static void main (String args[])
    {
        
        String Fruits[] = { "Apple","Mango","Banana"};
        
        String Largest  = Fruits[0];

        for(int i=1; i<Fruits.length;  i++)
        {
            if(Largest.compareTo(Fruits[i]) < 0)
            {
                Largest = Fruits[i];
            }
        }
        System.out.println(Largest);

    }
}
