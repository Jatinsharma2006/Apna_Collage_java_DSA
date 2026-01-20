/*Types of Constructors

--->    Non-parameterized

--->    Parameterized

--->    Copy Constructor                          */


/*

Ex:  Parameterized:

Student (String name)
{
    this.name = name;
}
*/

//Ex--

class Student{

        String name;
        int roll;

        //Constructor
        Student ()
        {
                System.out.println("Constructor is called........");
        }
}




public class H_Types_of_constructor___Pameterized {
    public static void main(String args[]){
        
        Student p1 = new Student();
    }       
}  







