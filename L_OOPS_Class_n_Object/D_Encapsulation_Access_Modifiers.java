/*
Encapsulation:-

Encapsulation is defined as wrapping up data & methods under a Single unit.
Ex-Class & Object

Also implements data hiding using : "Access Modifiers"
Useless/Sensitive --->  private/default/protected
*/


/*
Access Modifier

Define access of an albject

Types:

.          public
.
.          Default
.
.          Private
.
.          Proctected




Access Modifiers | Within Class | Within Package | Outside package     | Outside package
.                                                 (using subclass only)

Private                    Y            N                    N                 N 

Default                    Y            Y                    N                 N 

Protected                  Y            Y                    Y                 N 

Public                     Y            Y                    Y                 Y 

*/


class BankAccount {

        public String username;

        private String password;

        public void setpassword (String pwd){

                password = pwd;
                System.out.println (password);
        
        }

}


public class D_Encapsulation_Access_Modifiers{
    public static void main(String args[]){

            BankAccount myAcc = new BankAccount();
            //Creating a Obj ;
                



                myAcc.username = "Cagehydra";
                System.out.println (myAcc.username);

//Output : Cagehydra will be set in User Name




                //myAcc.password = "7018SHA";
//Error         //System.out.println (myAcc.password);

/*It will give error Coudnt find password variable in 
Bank Account class as it is under private Accesses Modifier*/




                myAcc.setpassword("abcdefg");
//Error         //System.out.println (myAcc.password);
         
/*   Will set password variable value but only 
can be used inside set Passward fn     */


    }               
}  