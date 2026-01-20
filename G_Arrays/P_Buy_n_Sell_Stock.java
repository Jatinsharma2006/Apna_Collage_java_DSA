import java.util.*;
public class P_Buy_n_Sell_Stock{


    public static void Buy_n_Sell_Stock_fn (int Prices[])
    {    
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for(int i=1; i<Prices.length ; i++)
        {
            if(BuyPrice > Prices[i])
            {
                BuyPrice = Prices[i];
            }
            else
            {
                int TodaysProfit = Prices[i] - BuyPrice;
                MaxProfit = Math.max(MaxProfit,TodaysProfit);
            }
        }
        System.out.println(MaxProfit); 
    }    
    
    public static void main (String args[])
    {
        int Prices[] = {7,1,5,3,6,4};
       
        Buy_n_Sell_Stock_fn(Prices);
    }
}
