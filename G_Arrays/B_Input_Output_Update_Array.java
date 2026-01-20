//Creating an Array
//Synatx: Datatype ArrayName[} = new Datatype [Size];

import java.util.*;
public class B_Input_Output_Update_Array{
    public static void main (String args[])
    {


//Inserting items        
        Scanner sc=new Scanner(System.in);

        int Marks[] = new int [100];

        System.out.println("Enter Marks Phy,Chem,Math,Eng : ");
            
        Marks[0] = sc.nextInt();          //Phy
        Marks[1] = sc.nextInt();          //Chem
        Marks[2] = sc.nextInt();          //Math
        Marks[25] =sc.nextInt();         //Eng

        System.out.println(" Phy : " + Marks[0]);
        System.out.println(" Chem : "+ Marks[1]);
        System.out.println(" Math : "+ Marks[2]);
        System.out.println(" English : "+ Marks[25]);
    
/*    
    Input:
            55
            66
            88 
            77                                                        
    OutPut:
            Phy : 55
            Chem : 66
            Math : 88
            English : 77                                                      */



//Updating items
    Marks[2] =100;         
    System.out.println("Math : " + Marks[2]);
  /*
    Input: 100
    OutPut: Math : 100  
or 
we can also do                                        */
    Marks[1] = Marks[1] + 1 ;         
    System.out.println("Chem : " + Marks[1]);
    //OutPut: Chem : 67 

    }
}
