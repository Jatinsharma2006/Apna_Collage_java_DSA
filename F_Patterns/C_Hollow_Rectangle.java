import java.util.Scanner;
public class C_Hollow_Rectangle
{ 
/*EX-1 : Print Pattern -- Hollow Rectangle 

    ***************
    *             *
    *             *
    *             *
    *             *
    *             *
    *             *
    ***************                                      */
//*
        public static void Hollow_Rectangle (int TotalRows , int TotalColumns )
        {

            for(int i=1; i<=TotalRows; i++)
            {
                for(int j=1; j<=TotalColumns; j++)
                {
                    if(i==1||i==TotalRows||j==1||j==TotalColumns){
                         System.out.print("*");
                    }
                    else{
                         System.out.print(" ");
                    }
                }
                System.out.println(); 
            }      
        }

        
        public static void main (String args[])
        {
            Hollow_Rectangle(10,5);
        }   
//*/  

}