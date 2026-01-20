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
/*
        //Shallow Copy
        Student (Student s1){

                marks = new int[3];
                this.name = s1.name;
                this.roll = s1.roll;
                this.password = s1.password;      
        }
*/

        //Deep Copy
        Student (Student s1){

                marks = new int[3];
                this.name = s1.name;
                this.roll = s1.roll;
                this.password = s1.password;
               
                for(int i = 0; i<3; i++)
                {
                        this.marks[i] = s1.marks[i];
                } 
        }
}




public class K_Shallow_Copy_n_Deep_Copy{
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




















