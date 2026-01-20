/*
MAke a multiple inheritance in which

 Herbivors      Carnivorse
(Interface)    (Interface)      
     \            /
      \          / 
       \        / 
      Bear (Class)

Ex:

interface Herbivorse {}

Interface Carniverse {}

Class Beer implements  Herbivorse, Carnivorse {} */


interface Carnivorse
{
    void eatsMeat();
}


interface Herbivorse
{
       void eatsPlants(); 
}


class Bear implements Carnivorse,Herbivorse{
    
    public void eatsMeat(){
            System.out.println("eats eatsMeat");
    }

    public void eatsPlants(){
            System.out.println("eats plant ");
    }
}


public class U_Multi_Inheritance_Using_Interfaces{
    public static void main(String args[]){


        Bear B = new Bear ();
        B.eatsPlants();
        B.eatsMeat();


        Herbivorse B1 = new Bear();
        B1.eatsPlants();
        //B1.eatsMeat();         //ERROR
        /*  Reason: Reference type = Herbivorse
                    Herbivorse knows only eatsPlants()
                    eatsMeat() is not visible              */



        Carnivorse B2 = new Bear();
        B2.eatsMeat();
        //B2.eatsPlants();       //ERROR
        /*  Reason: Reference type = Carnivorse
                    It knows only eatsMeat()*/
        

    }
}



/*
Golden rule (very important)

Reference type decides which methods you can call
Object type decides which method runs */

