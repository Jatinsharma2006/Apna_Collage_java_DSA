/*Types of Constructors

--->    Non-parameterized

--->    Parameterized

--->    Copy Constructor                          */


/*
Ex:  Non-parameterized
Student()
{
    System.out.println("Constructor");
}
*/

//Ex-1
class Student{

        String name;
        int roll;

        //Constructor
        Student (String name)
        {
                this.name = name;
        }
}



public class G_Types_of_constructor__Non_Pameterized{
    public static void main(String args[]){


        Student s1 = new Student("shradhe");
        System.out.println (s1.name);
        
    }       
}  







