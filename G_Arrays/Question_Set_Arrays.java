import java.util.Scanner;
public class  Question_Set_Functions{


/*Question 1 : Given an integer array int nums[], 
        return true  : if any value appears at least twice in the array,
        return false : if every element is distinct.

Input: int nums[] = [1, 2, 3, 1]
Output: true   

Input: int nums[] = [1, 2, 3, 4]
Output: false

Input: int nums[] = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
Output: true                                                         */
/*
        public static boolean Distinct_Array_Or_Not_fn (int arr[])
        {
            for (int i = 0; i<arr.length; i++)
            {
                for (int j = i+1; j<arr.length; j++)
                {
                    if(arr[i] == arr [j])
                    {
                        return true;
                    }
                }
            }
            return false;    
        }

        public static void main (String args[])
        {
           
            int nums[] = {1, 2, 3, 1};
            int nums1[] = {1, 2, 3, 4};
            int nums2[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

            System.out.println(Distinct_Array_Or_Not_fn(nums));
            System.out.println(Distinct_Array_Or_Not_fn(nums1));
            System.out.println(Distinct_Array_Or_Not_fn(nums2));
        }
*/


/*Question 2 : There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown
pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k],
nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 

For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and
become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, 
return the index of target if it is in nums,
or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.

Ex 1:
    Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 0
    Output: 4
Ex 2:
    Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 3
    Output: -1
Ex 3:
    Input: nums = [1], target = 0
    Output: -1   
*/

/*
//binary search to find target in left to right boundary
public static int search(int[] nums,int left,int right,int target){
        
        // System.out.println(left+" "+right);
        while(left <= right){
                int mid = left + (right - left)/2;
                if(nums[mid] == target)
                {
                    return mid;
                }
                else if(nums[mid] > target)
                {
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
        }
        return -1;
}

//smallest element index
public static int minSearch(int[] nums)
{
        int left = 0;
        int right = nums.length-1;
        while(left < right){
                int mid = left + (right - left)/2;
                if(mid > 0 && nums[mid-1] > nums[mid])
                {
                    return mid;
                }
                else if(nums[left] <= nums[mid] && nums[mid] > nums[right])
                {
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
        }
        return left;
}

public static  int search(int[] nums, int target) {

        //min will have index of minimum element of nums
        int min = minSearch(nums);

        //find in sorted left
        if(nums[min] <= target && target <= nums[nums.length-1])
        {
            return search(nums,min,nums.length-1,target);
        }
        //find in sorted right
        else{
            return search(nums,0,min,target);
        }
}
public static void main (String args[])
{

    int nums[] = {4,5,6,7,0,1,2};

    int key = 6;

    System.out.println(search(nums,key));
}




*/


/*Question 3 : You are given an array prices where prices[i] is the price of a given stock on
the ith day.
Return the maximum profit you can achieve from this transaction. If you cannot
achieve any profit, return 0.

Ex 1:   Input: prices = [7, 1, 5, 3, 6, 4]
        Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because
you must buy before you sell.

Ex 2:   Input: Prices = [7, 6, 4, 3, 1]
        Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.*/

/*       
    public static int Maxprofit(int Prices[]) 
    {   
        int profit = 0;

        int BuyPrice = Prices[0];

        for( int i=0; i<Prices.length; i++){

            if(BuyPrice < Prices[i]){
                profit = Math.max(Prices[i] - BuyPrice, profit);
            }
            else {
                BuyPrice = Prices[i];
            }
        }
           
    return profit;   
    }

    public static void main(String args[]) {

        int nums[] = {4,5,6,7,0,1,2};

        System.out.println( Maxprofit(nums));   
    }
*/

/*Question 4 : Given n non-negative integers representing an elevation map where the width of
each bar is 1, compute how much water it can trap after raining.
Ex 1:   Input: height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
        Output: 6
        Explanation: The above elevation map (black section) is represented by array
        [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section)
        are being trapped.

Ex 2:   Input: height = [4, 2, 0, 3, 2, 5]
        Output: 9*/
/*
    public static int Trapped_water_fn(int number[],int width) {
        int n = number.length;
        int MaxLeftBound [] = new int [n];
        int MaxRightBound [] = new int [n];
        int TotalTrapped_Water = 0;

       
            //MaxLeft Boundary 
            MaxLeftBound [0] = number[0];
            for(int j = 1; j<n; j++){
                int leftboundry = number[j];
                MaxLeftBound[j] = Math.max(leftboundry,MaxLeftBound[j-1]);
            }
            PrintArrayfn(MaxLeftBound);
       
            //MaxRight Boundary
            MaxRightBound [n-1] = number[n-1];
            for(int j = n-2; j>=0; j--){ 
                int Rightboundry = number[j];
                MaxRightBound[j] = Math.max(Rightboundry,MaxRightBound[j+1]);
            }
            PrintArrayfn(MaxRightBound);
            
            

        for(int i = 0; i<n; i++){

            int WaterLvL = Math.min(MaxLeftBound[i],MaxRightBound[i]);
            System.out.println( "Waterlvl + " + WaterLvL);

            int Trapped_water = (WaterLvL - number[i]) * width ;
            if(Trapped_water<0){
                Trapped_water = 0;
            }
            System.out.println( "Trappedwater = " + Trapped_water);

            TotalTrapped_Water = TotalTrapped_Water + Trapped_water ;
        }
        return TotalTrapped_Water;
        }

        public static void main(String args[]) {

            int heights[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
            int width = 1;

            System.out.println( Trapped_water_fn(heights,width));

           

            int heights2[] =  {4, 2, 0, 3, 2, 5};
            System.out.println( Trapped_water_fn(heights2,width));
            
        }

        public static void PrintArrayfn(int arr[])
        {
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i] + "  ");
            }
            System.out.println();
        }
*/

}