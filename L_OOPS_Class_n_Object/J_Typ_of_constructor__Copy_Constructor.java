/*
Copy Constructor

In C++ we  have by default copy constructor but
in java we have to create it ourself

Copy constructor is a fn to copy all the properties 
of obj1 to obj2 

                Obj2= Copy of Obj1
*/


public class J_Typ_of_constructor__Copy_Constructor{
    public static void main(String args[]){

        Student s1 = new Student();
                s1.name = "Cagehydra";
                s1.roll = 420;
                s1.password = "abcd";

                s1.marks[0] = 100;
                s1.marks[1] = 90;
                s1.marks[2] = 80;

                System.out.println(s1.password);
                for(int i = 0; i<3; i++)
                {
                        System.out.println(s1.marks[i]);
                }



        Student s2 = new Student(s1);       //copying 
                s2.password = "xyz";
                s2.marks[2] = 100;     //making changes in s2
                s1.marks[0] = 55;     //making changes in s1
                
                System.out.println(s2.password);
                for(int i = 0; i<3; i++)
                {
                        System.out.println(s2.marks[i]);
                }
                
                System.out.println(s1.password);
                for(int i = 0; i<3; i++)
                {
                        System.out.println(s1.marks[i]);
                }
                
     }
}


class Student{

        String name;
        int roll;
        String password;
        int marks[];

        Student (){
                marks = new int[3];
                System.out.println("constructor is called.......");
        }
        //Copy constructor
        Student (Student s1){

                marks = new int[3];
                this.name = s1.name;
                this.roll = s1.roll;
                this.password = s1.password;
                this.marks = s1.marks;
        }
}




/*we have program here

        Student s1 = new Student();
                s1.name = "Cagehydra";
                s1.roll = 420;
                s1.password = "abcd";

                s1.marks[0] = 100;
                s1.marks[1] = 90;
                s1.marks[2] = 80;
its first initializing value for obj s1



                System.out.println(s1.password);
                for(int i = 0; i<3; i++){
                        System.out.println(s1.marks[i]);
                }
Output: abcd
        100
        90
        80



        Student s2 = new Student(s1);       //copying 

then copying obj s1 value to obj s2                
The s2 obj currently initialize with value of s1 object             
                
                
              
                s2.password = "xyz";
                s2.marks[2] = 100;     //making changes in s2
                


                s1.marks[0] = 55;     //making changes in s1
                


                System.out.println(s2.password);
                for(int i = 0; i<3; i++)
                {
                        System.out.println(s2.marks[i]);
                }

Chainging s2 values it should have looked liked
                                s2.password =   xyz
                                s2.marks[i] =   100
                                                90
                                                100
Due to s2.password = "xyz";    s2.marks[2] = 100;
but for loop printing s2.marks [i] will printt

Output: 50
        90
        100



                System.out.println(s1.password);
                for(int i = 0; i<3; i++)
                {
                        System.out.println(s1.marks[i]);
                }
so sl.marks should have looked like 
                s1.marks[i]  =  50
                                90
                                80
Due to s1.marks[0] = 50;
but s1. marks [1] loop will resut
Output: 50
        90
        100

instead of 50,90,80




The reason is 
when s2 is copyied from s1 the string & other datatype are copyied by call by valve 
so if any changes made to them later will not result in changes in s1 



But data-structure like Array are copyied in java by "Call by reference";
means s1 & s2 both are referencing to same Array in memory


So any changes made during s2 object or any change made in s1 objedt will be resulting in changes in both

To avoid it we need to learn Shallow copy & Deep copy

























When copying from s1 to s2, we are copying the array reference, not the actual array values.

This happens because arrays are reference types in Java.

As a result, if any change is made in the array of s1 after copying, the same change will be reflected in s2.

To avoid this problem, we need to understand the concept of Shallow Copy and Deep Copy.
*/