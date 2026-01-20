//Creating a String
/*
Synatx: 
        String VariableName = "Value";
        String VariableName = new String ("Value");
*/
import java.util.*;
public class A_Strings_Create_Input_Output {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);


//Creating a String
        
        String name;


//Inserting and Outputing        
            
        System.out.print("Enter String : ");
        name = sc.nextLine();
        System.out.println( name ); 
        
        System.out.print("Enter String : ");
        String fullName = sc.nextLine();
        System.out.println( fullName ); 

         
//Length of String

//To know length of String we use .length() fn

        fullName = "Tony Stark";
        System.out.println( fullName.length() ); 

    }
}
