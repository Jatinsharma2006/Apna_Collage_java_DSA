/*                     Constructor :-  

Constructor is special method which is invoked automatically at time of Object Creation

        -->  It has same name as class ar structure.

        -->  Constuctor dont have return type / Not even void.

        -->  Only called once at time  of object Creation

        -->  The memory allocation happens when Constructor is called




If we dont define a constructor in java it is automatically makes it at object creation. 

        Pen p1 = new Pen();

but when constructor is automatically. Created by java it can't do any initialization


Initialization : means passing initial value of attribute in  a Class
*/

//Syntax :-


class ClassName{

        //Constructor
        ClassName(/*Paramter*/)
        {
                //Logic
        }
}


public class F_Constructor_n_Destructor_In_OOPs{
    public static void main(String args[]){

        ClassName objName = new ClassName(/*Paramter*/);
//                               //Passing Paramter in constructor
    
    }       

}  




//Destructors

/*    we dont need to define destructor In Java 
Java has a automatic  destructor  Known as "Garbage collector"

it see if we are wheather using a oby in future or not 
if we are not using it  it removes allocated memory from it 
*/



