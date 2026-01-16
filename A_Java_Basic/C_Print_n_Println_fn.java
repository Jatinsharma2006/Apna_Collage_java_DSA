//Print and Printfn and \n in Java 

public class C_Print_n_Println_fn{
    
    public static void main (String args[])
    {
      //Print_fn--Print in same line 
        System.out.print("Hello World!");
        System.out.print("Hello World!");
        System.out.print("Hello World!");
        System.out.print("Hello World!");
    //Output: Hello World!Hello World!Hello World!Hello World!
 
 
System.out.println();


      //Println_fn--Print in next line 
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    /*Output: 
        Hello World!
        Hello World!
        Hello World!
        Hello World!
    */

System.out.println();

      //we can also use \n to break line just like in python
        System.out.print("Hello World!\nHello World!");
        System.out.print("Hello World!\n");
        System.out.print("Hello World!\n");
        System.out.print("Hello World!\nHello\nWorld!");
    /*Output: 
        Hello World!
        Hello World!Hello World!
        Hello World!
        Hello World!
        Hello World!
        Hello 
        World!
    */
    }
}



