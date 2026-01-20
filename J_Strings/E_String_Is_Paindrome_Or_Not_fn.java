//Creating a String
/*
Synatx: 
        String VariableName = "Value";
        String VariableName = new String ("Value");

Palindrome : Are words that when Spelled Backwards/reversed remain Same        
*/
import java.util.*;
public class E_String_Is_Paindrome_Or_Not_fn {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
         
        System.out.println( "Enter a String to check its palindrome or not : ");
        String Str = sc.nextLine();
        int n = Str.length();
        
        for(int i=0; i<n;  i++)
        {
            if( Str.charAt(i) != Str.charAt( n-1-i ))
            {
                System.out.println( "No String is Not Palindrome");
                return;
            }
        }
        System.out.println( "Yes String is Palindrome");
    }
}
