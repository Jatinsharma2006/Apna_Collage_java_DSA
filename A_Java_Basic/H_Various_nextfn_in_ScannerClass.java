//Various input fn in java are 

/*
next()
nextLine()
nextInt()
nextFloat()
nextBoolean()
nextLong()
nextDouble()
nextByte()
nextShort()
*/

import java.util.Scanner;

public class H_Various_nextfn_in_ScannerClass{
    
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your name");
        String input=sc.next();
        System.out.println(input);
 
/*
Input: Tony             
Output:Tony

Input: Tony Stark            
Output:Tony 

This is because next() fn only take input until space( )
To take input fully we use nextLine() fn
next() & nextLine() fn  only take string as input
*/
        System.out.print("Enter your name")
        String input=sc.nextLine();
        System.out.println(input);
/*
Input: Tony Stark            
Output:Tony Stark

Input: This is cagehydra learning java            
Output:This is cagehydra learning java
*/

//To take other DateTypes as input we use other next fn  
        System.out.print("Enter a number")
        String input=sc.nextInt();
        System.out.println(input);
//Input:25
//Output:25
   }
}
