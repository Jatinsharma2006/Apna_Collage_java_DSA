import java.util.Scanner;
public class  Question_Set_Functions{


//Question 1 : Write a Java method to compute the average of three numbers..
/*
        public static double average_fn (double a,double b,double c){
            return (a + b + c) / 3;
        }

        public static void main (String args[]){
            Scanner sc=new Scanner(System.in);
        
            System.out.print("Enter First number : ");
            double a =sc.nextDouble();
            System.out.print("Enter Second number : ");
            double b =sc.nextDouble();
            System.out.print("Enter Third number : ");
            double c =sc.nextDouble();
            
            System.out.println("Average is " + average_fn(a,b,c));
        }
*/


/*Question 2 : Write a method named isEven that accepts and int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method.*/
/*
        public static boolean isEven (int num){
            if(num % 2 == 0){
                return true;
            }
            return false;
        }

        public static void main (String args[]){
            Scanner sc=new Scanner(System.in);
        
            System.out.print("Enter a number : ");
            int num =sc.nextInt();
            
            if(isEven(num)) {
                System.out.println("Number is even");
            } 
            else {
            System.out.println("Number is odd");
            }
        }
*/


/*Question 3 : Write a Java program to check if a number is a palindrome in Java? 
(121 is a palindrome, 321 is not)
A number is called a palindrome if the number is equal to the reverse of a number
e.g., 121 is a palindrome because the reverse of 121 is 121 itself. 
On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.*/

/*       
        public static boolean isPalindrome(int number) {
            int palindrome = number; 
            int reverse = 0;
            while (palindrome !=  0) {
                int remainder = palindrome % 10;
                reverse = reverse * 10 + remainder;
                palindrome = palindrome / 10;
            }
            if (number == reverse) {
                    return true;
            }
        return false;
        }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Please Enter a number : ");
            int palindrome = sc.nextInt();

            if(isPalindrome(palindrome)) {
                System.out.println("Number : " + palindrome + " is a palindrome");
            } 
            else {
                System.out.println("Number : " + palindrome + " is not a palindrome");
            }
        }
*/

/*Question 5 : Write a Java method to compute sum of digits in an integer.
(Hint : Approach this question in the following way :
a. Take a variable sum = 0
b. Find the last digit of the number
c. Add it to the sum
d. Repeat a & b until the number becomes 0 )*/
//*
        public static int Sum_of_Digit(int number) {

            int sum = 0;
            while (number !=  0) {
                int Lastdigt = number % 10;
                sum = sum  + Lastdigt;
                number = number / 10;
            }
        return sum;
        }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Please Enter a number : ");
            int num = sc.nextInt();

            System.out.println("Sum of digits of : " + num  + " is " + Sum_of_Digit(num) );
        }
//*/

/*Question 4 : READ & CODE EXERCISE
Search about(Google) & use the following methods of the Math class in Java:
a. Math.min( )
b. Math.max( )
c. Math.sqrt( )
d. Math.pow( )
e. Math.avg( )
f. Math.abs( )

Free reading resource (https://www.javatpoint.com/java-math)
Please feel free to look for more resources/websites on your own.*/











}