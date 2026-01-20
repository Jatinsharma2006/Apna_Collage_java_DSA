//Syntax Example: Creating Class:

class Pen{
            
        // properties or attribute
        String color;
        int tip;

        
        
        //fn's

        void set_Color (String newColor)
        {
            color = newColor;
        }


        void set_Tip (int newTip) 
        {
            tip = newTip;
        }

}



//Syntax Example: Creating Objects.

public class B_Creating_Class_n_Objects{

    public static void main(String args[]){

            Pen p1 = new Pen();
            //Creating a pen Obj called p1;

            
            p1.set_Color ("Blue");
            System.out.println (p1.color);

            
            p1.set_Tip(5);
            System.out.println (p1.tip);

            
            p1.color = "Yellow";
            System.out.println(p1.color);
    }
}






/*
Output:

Blue

5

Yellow
*/