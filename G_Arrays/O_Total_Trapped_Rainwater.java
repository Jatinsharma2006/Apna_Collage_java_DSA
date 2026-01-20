//Total Trapped Rainwater (DSA Sheet Q22)

import java.util.*;
public class O_Total_Trapped_Rainwater{


    public static void Total_Trapped_Rainwater_fn (int height[],int width)
    {    
        int n = height.length ;

        int Trapped_Water = 0;
        int MaxWaterlvl = 0;

        int Total_Trapped_Rainwater = 0;

//Left MaxBoundary --- Array Calulation  

        int LeftMax[] = new int [n];

        LeftMax[0] = height[0];

        for(int i=1; i<n; i++)
        {
            LeftMax[i] = Math.max(LeftMax[i-1],height[i]);
        }


//Right MaxBoundary --- Array Calulation  

        int RightMax[] = new int [n];

        RightMax[n-1] = height[n-1];

        for(int i=n-2; i>=1; i--)
        {
            RightMax[i] = Math.max(RightMax[i+1],height[i]);
        }

//Trapped water  ---  
        for(int i=0; i<n; i++)
        {
            MaxWaterlvl = Math.min(RightMax[i],LeftMax[i]);
            Trapped_Water = (MaxWaterlvl - height[i])*width;
            if(Trapped_Water < 0){
                Trapped_Water = 0;
            }                                                                                                                         
            Total_Trapped_Rainwater += Trapped_Water ;
        }
        System.out.println(Total_Trapped_Rainwater); 
    }    
    
    public static void main (String args[])
    {
        int height[] = {4,2,0,6,3,2,5};
        int width = 1;
        Total_Trapped_Rainwater_fn(height,width);
    }
}
