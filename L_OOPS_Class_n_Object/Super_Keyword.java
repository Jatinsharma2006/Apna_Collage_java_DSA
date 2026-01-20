/*


Super Keyword

Super keyword is used to refer immediate parent class object

-- access to parents properties

-- to access Parent's Function

-- to access parent's constructor


EX 

output:
 animal construtor is called 
 horse  construtor is called 
 animal construtor is called
 brown
*/

public class Super_Keyword {
public static void main(String args []){

        Horse h = new Horse();
        System.out.println(h.color); 

}
}


class Animal{

    String color ;

    Animal(){
        System.out.println("animal Constructar is called ");
    }
}

class Horse extends Animal {

    Horse(){
        System.out.println("horse Constructor is called ");
        super();
        super.color = "brown";
    }

}
