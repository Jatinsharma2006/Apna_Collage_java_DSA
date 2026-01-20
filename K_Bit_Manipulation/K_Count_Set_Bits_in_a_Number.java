//TimeComplexity = O(logn)
import java.util.Scanner;

public class K_Count_Set_Bits_in_a_Number{
    
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int n =sc.nextInt();
         
        int LSB = 0; 
        int Count = 0;
    
        while (n != 0 ){
            
            LSB = n & 1;

            if (LSB == 1)
            {
                Count++;
            }
            
            n = n>>1;
        }
        System.out.print("Number of 1 bit in this number is : " + Count );
    }
}

/*
Count Set bits (1 bits) in a number -- we have to counts all 1 bits in a number in (Binary form)

logic - 3 Steps

1) If we focus on Lsb of n & check its value wheathers its O or 1

2) if LSB ==1 do count++

3) if last Significient bit (LSB) == 0  Skip

4) then do n>>1 & remove last digit & insert O at Start

       



repeat 1 & 2 until number == O



To check LSb. we doing (n $ 1) != 0

Ex      1010     (1). (1010 & 1) != 0 
                
                            1 & 0 = 0 
                            0 & 0 = 0 
                            1 & 0 = 0
                            0 & 1 = 0
0000 = 0 -> Yes 

so LSB = 0 do     (4) n>>1   To remove last digit 
                    
                            1010 >> 1 = 0101




        0101      (1). (0101 & 1) != 0 

                            0 & 0 = 0 
                            1 & 0 = 0 
                            0 & 0 = 0 
                            1 & 1 = 1
                          
0001 = 0 -> No 

so LSB = 1 do   (2) count ++ => count =1  

                (4) n>>1   To remove last digit 
                    
                            0101 >> 1 = 0010




        0010      (1). (0010 & 1) != 0 

                            0 & 0 = 0 
                            0 & 0 = 0 
                            1 & 0 = 0 
                            0 & 1 = 1
0000 = 0 -> Yes 

so LSB = 0 do     (4) n>>1  To remove last digit 
                    
                            0010 >> 1 = 0001





        0001      (1). (0001 & 1) != 0 

                            0 & 0 = 0 
                            0 & 0 = 0 
                            0 & 0 = 0 
                            1 & 1 = 1
                          
0001 = 0 -> No      (2) count ++ => count =2  

                    (4) n>>1   To remove last digit 
                    
                            0001 >> 1 = 0000


number == 0     --> 0000 == 0  
so loop end  print Count = 2









010100101 $1) != 00&00 1&00

0&00

1&11

LSB=1 da count tt & then ds2

0010 0010$101-0 LSB-D do

00010(0001&1) 1-0 LSB=1 count++; Count = 2; do

0000 loop end print Count 2

Time complexity Oclagn).

*/