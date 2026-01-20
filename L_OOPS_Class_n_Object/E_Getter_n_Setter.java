/*              Getter & Setters.

--> Get  : To return a value

--> Set  : To modify the value.

--> this : this Keyword is used to refer 
           to current object
*/


class Pen{

        private String Color;

        private int Tip;

        String getColor()
        {
                return this.Color;
        }
        

        int getTip()
        {
                return this.Tip;
        }

       

        void setColor (String newColor)
        {
                this.Color = newColor;
        }

        void setTip (int newTip)
        {
                this.Tip = newTip;
        }

}    


public class E_Getter_n_Setter{
    public static void main(String args[]){


        Pen p1 = new Pen();
        //Creating a Obj ;
                
        
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Yellow");
        System.out.println(p1.getColor());


    }               
}  









































class BankAccount {

        public String username;

        private String password;

        public void setpassword (String pwd){

                password = pwd;
                System.out.println (password);
        
        }

}
