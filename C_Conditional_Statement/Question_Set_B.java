import java.util.Scanner;

public class Question_Set_B{
    
    public static void main (String args[])
    {

//Question 1: Write a java program to get a number from user 
// and print wheather its a positive or negetive number
        
/*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("Your number is  Positive");
        }

        else if(num==0){
            System.out.println("Your number is  zero");
        }
        
        else{
            System.out.println("Your number is Negetive");
        }
*/
 


//Question 2: Write a code that prints 
//"You have fever" if your temperature is above 100 
//otherwise print "You dont have fever"

/*        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Temperture");
        int temp = sc.nextInt();

        if(temp>100){
            System.out.println("You have Fever ");
        }

        else{
            System.out.println("You dont have Fever");
        }
*/


/*Question 3: Write a java program to input Week number(1-7)
and print day of week name using switch case : */
/*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a week number between 1-7 :");
        int week =sc.nextInt();

        switch(week) {  
                    
            case 1: System.out.println("Monday ");
                                break;

            case 2: System.out.println("Tuseday");
                                break;

            case 3: System.out.println("Wednesday ");
                                break;

            case 4: System.out.println("Thrusday");
                                break;

            case 5: System.out.println("Friday");
                                break;

            case 6: System.out.println("Saturday");
                                break;

            case 7: System.out.println("Sunday");
                                break;

            default: System.out.println("Invalid Input"); 

        };
*/        

//Question 4: What will be value of X and Y in the following program
/*        
        int a = 10000 ,b=10;
        
        boolean x=(a<b)?true:false;
        int y=(a>b)?a:b;

        System.out.println( x );
        System.out.println( y );

        //Answer = x = false , y = 1000
*/        


//Question 5:Write a java Program that takes 
//Year as input from user and Print wheather 
// the Year is leap year or not 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year");
        int Year = sc.nextInt();

        boolean x = (year%4) == 0;
        boolean x = (year%100) != 0;
        boolean x = (year%4 == 0)&&(year%400 == 0);


        if((X && Y) || Z){
            System.out.println(Year + " is a Leap Year");
        }
        
        else{
            System.out.println(Year + " is Not a Leap Year");
        }
/*
        Year -- If divisible by 4  ---->  Not a Leap year
                        |           No
                    Yes |
                        v
                If divisible by 100 ---> Is a leap year
                                     No
        
             
             
        Year -- If divisible by 100
                        | Yes
                        |
                        v            No
                If divisible by 400 --->  Not a Leap year  
                        | Yes
                        |
                        v
                    Leap Year
*/
    }
}

