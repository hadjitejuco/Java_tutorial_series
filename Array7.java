
//input two dim array
import java.util.Scanner;

public class Array7 {   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i,j;            //loop variable
        int x,y;            //Order of matrix
        int a[][] = new int [10][10];   //array
        
        //prompt -> Input the order of matrix
        System.out.println("\nEnter order of matrix ");
        x = input.nextInt();
        y = input.nextInt();
        
        System.out.println("\nEnter "+x+" X "+y+ " matrix \n");
        
        //input 
        
        for (i=1; i<=x; i++) 
            for (j=1; j<=y; j++)
                a[i][j] = input.nextInt();
        
        //display the matrix
        System.out.println("\nGiven matrix is \n");
        for (i=1; i<=x; i++){
            for (j=1; j<=y; j++)
                 System.out.print("   "+a[i][j]);
            System.out.println("\n");
        
        }
    }
}
