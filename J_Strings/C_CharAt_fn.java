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

        System.out.println( fullName.charAt(1) );
        System.out.println( fullName.charAt(5) ); 
        System.out.println( fullName.charAt(4) ); 
        System.out.println( fullName.charAt(8) ); 

    }
}
