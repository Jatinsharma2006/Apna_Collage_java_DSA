/*
                        Inheritance

When "Properties" & "Method" of base class are passed on to a 
derived class  its called Inheritance


for Inheritance we use  : "extends" keyword

Syntax:

        class DerivedClassName extends BaseClassName {}

*/

public class L_Inheritance_In_OOPs{
        public static void main (String args[]){

                fish Shark = new fish();
                Shark.eat();
                Shark.swim();
        }
}

//Base class/Parent class.
class Animal {

        String color;

        void eat (){
                System.out.println("eats");
        }

        void breathes(){
                System.out.println ("breathes");
        }
}
        
         
// Derived Class/Child Class

class fish extends Animal {

        int fins;

        void swim()
        {
                System.out.println("Swims in water");
        }

}










