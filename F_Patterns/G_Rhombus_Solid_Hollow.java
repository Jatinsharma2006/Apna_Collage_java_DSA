import java.util.Scanner;
public class G_Rhombus_Solid_Hollow
{ 
/*EX-1 : Print Pattern -- Solid Rhombus   
                        
        XXXXX
       XXXXX 
      XXXXX  
     XXXXX   
    XXXXX                                          */
//*

    public static void Solid_Rhombus_fn (int n)
    {

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("X");
            }
            System.out.println();
        }
        System.out.println(); 
    }



    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n =sc.nextInt();

        Solid_Rhombus_fn (n);

    }   
//*/ 

/*EX-2 : Print Pattern -- Solid Rhombus   
                        
              XXXXXXX
             X     X 
            X     X  
           X     X   
          X     X    
         X     X     
        XXXXXXX                                    */
/*

    public static void Hollow_Rhombus_fn (int n)
    {

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("X");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(); 
    }



    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n =sc.nextInt();

        Hollow_Rhombus_fn (n);

    }   

*/ 
}


