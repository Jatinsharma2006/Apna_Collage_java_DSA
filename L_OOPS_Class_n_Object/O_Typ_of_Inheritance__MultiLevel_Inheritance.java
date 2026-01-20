/*
        Multi Level inheritance    

        Animal (color , eats() , Breaths()  )
          |  
          V
        Mammals ( legs ) 
          |  
          V
         Dog ( Breed )    
           

*/

public class O_Typ_of_Inheritance__MultiLevel_Inheritance {
        public static void main (String args[]){

                Dog dog = new Dog();
                dog.eat();
                dog.breathes();

                //dog.Legs = 4;
                dog.breed = "Lebra";
                System.out.println (dog.Legs);
                System.out.println (dog.breed);
        }
}
/*Dog class is Derived class of Mammals class and 
Mammals class is Derived class of Animal class  
so dog class can call all fn inside Mammals and Animal
and Mammels class can call fn inside Animal class only*/


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
        
         
// Derived Class 1

class Mammals extends Animal 
{
        int Legs = 6;
}


// Derived Class 2
class Dog extends Mammals
{
        String breed;
}







