//Making Custom Functions
/*
But when we use other return type like Int ,String we have 
to write same datatype value in front of return

                return value(with same dataype as Return datatype of fn)
 */



public class C_Custom_function_Structure{

        public static int PrintHelloWorld()
        {
                System.out.println("Hello World");
                System.out.println("Hello World");
                System.out.println("Hello World");
                System.out.println("Hello World");

                return 3;
        }

        public static String PrintHelloWorld2()
        {
                System.out.println("Hello World");
                System.out.println("Hello World");
                System.out.println("Hello World");
                System.out.println("Hello World");

                return "hello";
        }

        public static void main (String args[])
        {
                PrintHelloWorld();
                PrintHelloWorld2();
        }
    
}