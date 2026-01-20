//Creating a String
/*
Synatx: 
        String VariableName = "Value";
        String VariableName = new String ("Value");

Concatenate means adding 1 String in another        
*/
import java.util.*;
public class B_Strings_Concatenate {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        String firstname = "Cage";
        String lastname = "hydra";
        String fullName = firstname + "  " + lastname;
        System.out.println( fullName  + "is this" ); 

    }
}
