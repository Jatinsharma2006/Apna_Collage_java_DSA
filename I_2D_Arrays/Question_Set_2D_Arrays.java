import java.util.Scanner;
public class  Question_Set_2D_Arrays{


/*Question 1 :  : Print the number of 7’s that are in the 2d array.
Ex :
Input - int array [][] = { {4,7,8},{8,8,7} };
Output - 2
*/
/*
    public static void main (String args [])
    {
        int array [][] = { {4,7,8},{8,8,7} };

        int count = 0;

        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[0].length; j++){

                if (array[i][j] == 7)
                {
                    count++ ;
                }
            }
        }
        System.out.println(count);
    }
*/

/*Question 2 : Print out the sum of the numbers in the second row of the “nums” array.
Example :
Input - int nums [][] = { {1,4,9},{11,4,3},{2,2,3} };
Output - 18
*/
/*
    public static void main (String args [])
    {
        int array [][] = { {1,4,9},{11,4,3},{2,2,3} };

        int i = 1;
        int sum = 0; 

        for(int j = 0; j<array[0].length; j++){
            sum += array[i][j] ;
        }
        System.out.println(sum);
    }
*/

/*Question 3 : Write a program to Find Transpose of a Matrix.
What is Transpose?
Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,

Matrix
a11 a12 a13
a21 a22 a23

Transposed Matrix
a11 a21
a12 a22
a13 a23 
*/

    public static void main (String args [])
    {
        int array [][] = { {1,2,3},{4,5,6} };

        int Transpose [] [] = new int [array[0].length] [array.length];

        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[0].length; j++){

                Transpose [j][i] = array[i][j];
            }
        }
        System.out.println();

        for(int i = 0; i<Transpose.length; i++){
            for(int j = 0; j<Transpose[0].length; j++){

                System.out.print(Transpose[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}