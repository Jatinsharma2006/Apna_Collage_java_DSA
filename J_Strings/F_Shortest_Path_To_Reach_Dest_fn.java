//Creating a String
/*
Synatx: 
        String VariableName = "Value";
        String VariableName = new String ("Value");

Given a route containing 4 direction (E,W,N,S)  moving 1,1 unit in each direction
Find the shortest Path to reach destination 

:                     "W N E E N E S E N N N"       
*/
import java.util.*;
public class F_Shortest_Path_To_Reach_Dest_fn {
    
    public static float getShortestPath (String Path)
    {
        int x = 0 ;
        int y = 0 ;

         for(int i=0; i<Path.length();  i++)
        {
            char Ch = Path.charAt( i );

            if( Ch == 'N')
            {
                y++;
            }

            if( Ch == 'S')
            {
                y--;
            }

            if( Ch == 'E')
            {
                x++;
            }

            if( Ch == 'W')
            {
                x--;
            }
        }
        System.out.println( "( " + x + " , " + y + " )");

        int x2 = x*x;
        int y2 = y*y;

        float Shortest_Path = (float) Math.sqrt( x2 + y2 );

    return Shortest_Path;
    }
    
    
    public static void main (String args[])
    {
        String Str = "WNEENESENNN";

        System.out.print(getShortestPath(Str));
    }
}
