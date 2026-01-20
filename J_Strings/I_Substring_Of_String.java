//Creating a String
/*
Synatx: 
        String VariableName = "Value";
        String VariableName = new String ("Value");

2 ways 

1. creating a custom fn 
2. Using In-built fn  Syntax :  StringName.substring(si,ei)
*/
import java.util.*;
public class I_Substring_Of_String {


    public static String Substring_fn (String Str, int si,int ei)
    {
        String Substr = " ";

        for(int i=si; i<ei;  i++)
        {
            Substr +=  Str.charAt( i );
        }
        return Substr;
    }



    public static void main (String args[])
    {
        
        String fullName = "Cagehydra";
        System.out.println( Substring_fn(fullName,2,5) );

        //Inbuilt fn Substring
        String Str = "Hello  World";
        System.out.println( Str.substring(2,10) );

    }
}
