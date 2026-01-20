//Creating a String
/*
Synatx: 
        String VariableName = "Value";
        String VariableName = new String ("Value");

charAt fn Tells character in s String  at a specified Index        
*/
import java.util.*;
public class C_CharAt_fn {
    public static void main (String args[])
    {
        
    
        String fullName = "Cage hydra";

        for(int i=0; i<fullName.length();  i++)
        {
            System.out.println( fullName.charAt( i ) );
        }


    }
}
