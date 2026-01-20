//Creating an Array
//Synatx: Datatype ArrayName[} = new Datatype [Size];

import java.util.*;
public class C_lenght_of_Array_n_Finding_Percentage{
    public static void main (String args[])
    {
        int Marks[] = new int [100];  
        Marks[0]  = 55;          //Phy
        Marks[1]  = 67;          //Chem
        Marks[2]  = 100;         //Math
        Marks[25] = 77;          //Eng

        
//Finding percentage of marks
        int Percentage= ( Marks[0] + Marks[1] + Marks[2] + Marks[25])/4;
        System.out.println(" Percentage : " + Percentage + "%");
        
    
//To find length of a array we use 
//                                    .length       property
//Syntax: Array.lenght
        System.out.println(" Lenght of Array : " + Marks.length);



    }
}
