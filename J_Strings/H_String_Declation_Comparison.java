//Creating a String
/*
Synatx: 
        String VariableName = "Value";
        String VariableName = new String ("Value");

.equals() fn check if two Strings have same content or not         
*/
import java.util.*;
public class H_String_Declation_Comparison {
    public static void main (String args[])
    {

        String Str1;
        Str1 = "Cage hydra";

        String Str2 = "Cage hydra";

        String Str3 = new String ("Cage hydra");
        
        System.out.println( Str1 == Str2);
        System.out.println( Str1 == Str3);
        System.out.println( Str3 == Str2);

    }
}
