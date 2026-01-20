/*
Static Keyword

Static : Keyword Java is used to Share same variable or method of a given classes

Can be used on --   Properties
                    Functions
                    Block
                    Nested Classes

main ()
{   Block
    { 
        int a = b + c ;
        System.out.println(a);
    }
}


Class A{

        //nested Classes
        Class B{}
        Class C{}
}
*/


class Student{

        String name;
        int roll;

        static String SchoolName;

        void setName(String name)
        {
            this.SchoolName = name;
        }
        
        String getName()
        {
            return this.SchoolName;
        }
}


public class W_Static_Keyword {
    public static void main (String args[]){

        Student S1 = new Student();
        S1.name = "A";
        S1.SchoolName = "JMV";
        System.out.println(S1.name);
        System.out.println(S1.SchoolName);
        
        Student S2= new Student();
        System.out.println(S2.name);
        System.out.println(S2.SchoolName);

        Student S3 = new Student();
        S3.name = "C";
        S3.SchoolName = "RPM";
        System.out.println(S2.name);
        System.out.println(S3.name);
        System.out.println(S2.SchoolName);
        System.out.println(S3.SchoolName);
        
    }

}





/*
EX:
        There is a class Student with 
        2 properties : name and roll no. 
        2 Functions  : marks() & Percenatge


        so if we make obj of Student S1, S2, S3
        
        All of them will have diffrent value for properties & fn
        but they all have one property same for all-->School name

so if we make school name Static we dont have to put
same Value  for in again & again in each object








we have not defined S2 School name normally it should 
give error but in this case it will print JVM
& we have make School name Static

If we add               Student S3 = new Student();
                        S3.SchoolName = "RPM";

& Run Output :--

RPM

RPM

This is because if we made change in SchoolName 
value even after printing It will change all previous value

if it was not static S2.Schoolname will return null 
*/ 




/*
How memory Is allocated in Static

            Heap
                      +---------+
                      |   name  |
                      | roll no.|
                  ----|--- SN   |
                 /    +---------+              
                /                     
               /
              /
+------------+       +----------+
|            |       |   name   |
| SchoolName |       | roll no. |
|            |-------|--- SN    |
+------------+       +----------+
              \
               \      +---------+
                \     |   name  |
                 \    | roll no.|
                  ----|--- SN   |
                      +---------+


When every object get memory allocated needed by them, they will store a reference pointer pointing to another memory address in which School Name is stored 

So that way if we make changes later in SchoolName it will refelect in previous one also

Static help to reduce memory used for define Same varables
*/

