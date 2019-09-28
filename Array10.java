//trace matrix
/*
In linear algebra, the trace of a square matrix A is defined 
to be the sum of elements on the main diagonal of A.
            https://en.wikipedia.org/wiki/Trace_(linear_algebra)
*/
import java.util.Scanner;
public class Array10 {   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i,j;            //loop variable
        int x,y;            //Order of matrix
        int a[][] = new int [10][10];   //array
        int t=0;            //compute sum
        //prompt -> Input the order of matrix
        System.out.println("\nTrace Matrix Program");
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
        
        if (x==y){
            for (i=1; i<=x;i++)
                    for (j=1; j<=y; j++)
                            if (i==j) //rows and col must be equal
                                    t+=a[i][j];
            System.out.println("\n\nTrace of give matrix is "+t);
        }else{
            System.out.println("\nNot a square matrix");
        }
        
        
    }
}
