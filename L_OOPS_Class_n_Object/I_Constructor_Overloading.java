//Constructor Overloading

/*we can create multiple constructor can with Same name 
but they all should have diffrent input data type or  no. of parameter 
and thier call also depend on parameter they give or data type  they call*/

class Student{

        String name;
        int roll;

        //Constructors
        Student (){}

        Student (String name)
        {
                this.name = name;
        }

        Student (int  roll)
        {
                this.roll = roll;
        }
}


public class F_Constructor_In_OOPs{
    public static void main(String args[]){

        Student s1 = new Student();
        Student s2 = new Student("shradhe");
        Student s3 = new Student(1234);
        //Student s4 = new Student("Aman",123);
       
    }       
}  





/* In this example we have student class in which we have
3 Constructor 

                Student()

                Student(String name)

                Student(int roll)


In public class main Fn

        Student s1 = new Student();

        Student s2 = new Student("Shardha");
        
        Student s3 = new Student( 123);

        Student s4 = new Student("Aman",165)




Student S1= new Student ("aman", 567); which take 2 parameter 
will give error as  we didnt give it a constructor

If we remove student()  //constructor

Student S1 = new Student(); 

will also give error also as java only make automatic 
constructor only when no other constructor is definned 





