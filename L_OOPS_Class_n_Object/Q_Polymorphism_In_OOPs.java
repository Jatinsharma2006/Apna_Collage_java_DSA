/*
                         Polymorphism

                    Poly     morph    ism
                   (many)    (form)


Compile Time Polymorphism...(Static)
                -->    Method Overloading

Run Time polymorphism...(Dynamic)
                -->     Method Overriding



*/


//Method Overloading (Complie Time)

/*multiple fn in a class with same name but diffrent parameters
diffrent parameter --> either Datatype or Count(No. of Parameters)


Ex 
class Calculator{

            Sum_fn (int a ,int b)

            Sum_fn (float a, float b)

            Sum_fn (int a, int b, int c)
}
*/

/*
public class P_Polymorphism_In_OOPs{
        public static void main(String args[]){
                
                Calculater cal = new Calculater();
                System.out.println(cal.Sum(1,4));
                System.out.println(cal.Sum((float)1.5,(float)2.5));
                System.out.println(cal.Sum (1,2,3));
        }
}



class Calculater {

        int Sum ( int a, int b) {
            return a + b;
        }

        float Sum ( float a, float b) {
            return (a + b);
        }

        int Sum ( int a, int b, int c) {
            return a + b + c;
        }
}
*/


/*
Method Overriding (Run time).

Parent & Child classes both contain same functions with a different defination

Class A   -->    Animal   void eat(x)  " eat anything",
   |
   V
Class B   -->    Deer     void eat(x)  " eat grass"


*/
public class Q_Polymorphism_In_OOPs{
        public static void main(String args[]){

                Deer d = new Deer ();
                d.eat();
        }
}

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}


class Deer extends Animal{
        void eat(){
        System.out.println ("eat grass");
        }
}
