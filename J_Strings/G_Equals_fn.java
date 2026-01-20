//Creating a String
/*
Synatx: 
        String VariableName = "Value";
        String VariableName = new String ("Value");

.equals() fn check if two Strings have same content or not         
*/
import java.util.*;
public class G_Equals_fn {
    public static void main (String args[])
    {

        String Str1 = "Cage hydra";

        String Str2 = "Cage hydra";

        String Str3 = "Cagehydra";
        
        System.out.println( Str1.equals(Str2) );
        System.out.println( Str1.equals(Str3) ); 
        System.out.println( Str2.equals(Str2) ); 
        System.out.println( Str2.equals(Str3) ); 

    }
}
