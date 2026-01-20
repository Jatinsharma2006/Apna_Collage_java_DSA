/*
.                        Abstraction.

Hiding all unnecessary details & showing only important parts to users
.                       /               \
.                      /                 \
.                     /                   \
.               Abstract Classes        Interfaces



.                    ABSTRACT CLASSES
Syntax
        abstract class A {    

            abstract returntype  Function_Name() {    }

        }


Abstract Classes Rules

-->     Cannot create an instance/object of abstract classes    //Rule 1

-->     If a class contains an abstract method, the class itself must be abstract.


-->     if class inherits abstract Class  and abstract  class have a fn with abstract type in it 
        all the derived class must create same fn inside them  with same return type  and  Parameters the fn take  

-->     Can have abstract /non-abstract method

-->     Can have Constructors

*/


public class Abstraction_Using_Abstract_Classes{
    public static void main (String args[]){


        Horse h = new Horse();
              h.eat();
              h.walk();

        Chicken C = new Chicken();
                C.walk();
        
        Chicken C2 = new Chicken();
                C2.eat();
    }
}







abstract class Animal {

        void eat(){
            System.out.println("animal eats ");
        }

        abstract void walk();
}




class Horse extends Animal{

    void walk(){
            System.out.println(" Walk on 4 legs ");
    }
}


class Chicken extends Animal{

    void walk(){
            System.out.println(" Walk on 2 legs ");
    }
}


/*
Explaining  
abstract void walk() inside abstract Class animal is doing

We are telling all class that every Derived class which inherits 
Animal(Base class) - must have a fn walk() in them and 
it should have return type - void & take No parameter in every class
*/




//Some example to understand  Rules


//1)
    //Animal a = new Animal(); 

//-->Error -- we cannot Create obj of abstract classes rule 1



//2)
      /*public class Animal {
        ^^^^^^
            void eat(){    System.out.println("animal eats ");  }

        ---> abstract void walk();
        }
Error
Rule : if a class contains an abstract method, the class itself must be abstract.
*/


//3)
        //class Whale extends Animal{}

/*Error the class is derived class class of Abstract class Animal 
  so it must have  walk() fn inside it as its a Abstract type fn */


//3)
/*      class Whale extends Animal{
                String walk(){
                ^^^^
                    return " Walk on 2 legs "
                }
        }

/*Error  walk() fn inside it must have same return type 
as Abstract class Animal ---> Abstract walk() fn  */


//3)
/*      class Whale extends Animal{
                void walk (int a){
                            ^^^^
                     System.out.println(a + " Hello "); 
                }
        }
/*Error  walk() fn inside it must take same number of Parameter 
as Abstract class Animal ---> Abstract walk() fn  */
