/*
Ex:                         Animal [ color,eats(),Breaths() ]
.                              | 
.                              |
.                      ---------------------
.                     /         |           \
.                    /          |            \
.                   /           |             \
.               Fish           Bird            Mammals
.              Swim()          Fly()            Walk()

*/

public class P_Typ_of_Inheritance__Hierarchical_Inheritance {
        public static void main (String args[]){

                Mammals Mammal = new Mammals();
                        Mammal.eat();
                        Mammal.breathes();
                        Mammal.walk();
                      //Mammal.swim()
                      //Mammal.Fly()


                Fish fish = new Fish();
                     fish.eat();
                     fish.breathes();
                     fish.swim();
                   //fish.walk();
                   //fish.Fly();



                Bird birds = new Bird();
                     birds.eat();
                     birds.breathes();
                     birds.Fly();
                   //birds.swim();
                   //birds.walk();

/*"Mammals,Fish,Bird are derived class of Animal class but they 
are not derived class of each other so they all can call fn 
inside Animal class but cannot call fn inside each other" */             
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
        
  
         
// Derived Class 1
class Mammals extends Animal 
{
        void walk()
        {
                System.out.println("Walks");
        }
}

// Derived Class 2
class Fish extends Animal
{
        void swim()
        {
                System.out.println("Swim");
        }
}

// Derived Class 3
class Bird extends Animal
{
        void Fly()
        {
                System.out.println("Fly");
        }
}





