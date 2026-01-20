
/*
When we inherits classes & call a class constructor it will also call 
all the constructor of its Base class

It doesnt matter is class is abstract or not

Ex

(Animal)  -->  Constructor of animal is call
   |
   V
(Horse)   -->  Constructor of Horse is call
   |
   V
(Mustang) -->  Constructor of Mustang is call



we call,     
            Mustang myhorse = new Mustang();

output
        Constructor of animal is call

        Construtor of Horse is call

        Constructor of Mustang is call

*/

public class M_Inheritance_n_Constructor{
    public static void main (String args[]){

        Mustang myhorse = new Mustang();
    }
}


public class Animal {

        String color;

        Animal(){
            System.out.println("Animal Constructor is called ");
        }

        void eat(){
            System.out.println("animal eats ");
        }
}




class Horse extends Animal
{
    Horse()
    {
        System.out.println("Horse construtor is called");
    }
    
    void Change_color(){
        color = "dark brown";
    }
}



class Mustang extends Horse {
       
    Mustang()
    {
        System.out.println("Mustang Construtor is, called ");
    }

}
