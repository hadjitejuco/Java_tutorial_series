//identity matrix
/*
In linear algebra, the identity matrix, or a unit matrix,where we have square matrix 
with value of ones on the main diagonal and zeros elsewhere.
                                    https://en.wikipedia.org/wiki/Identity_matrix
*/
import java.util.Scanner;
public class Array11 {   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i,j;            //loop variable
        int n,m;            //Order of matrix
        int a[][] = new int [10][10];   //array
        int t=0;            //use a indicator or flag
        //prompt -> Input the order of matrix
        System.out.println("\nIdentity Matrix Program");
        System.out.println("\nEnter order of matrix ");
        n = input.nextInt();
        m = input.nextInt();
     
        System.out.println("\nEnter "+n+" X "+m+ " matrix \n");
        
        //input 
        for (i=1; i<=n; i++) 
            for (j=1; j<=m; j++)
                a[i][j] = input.nextInt();
        
        //display the matrix
        System.out.println("\nGiven matrix is \n");
        for (i=1; i<=n; i++){
            for (j=1; j<=m; j++)
                 System.out.print("   "+a[i][j]);
            System.out.println("\n");
        
        }
        
        if (n==m)   // check for square matrix
        {
            for (i=1; i<=n;i++)
                    for (j=1; j<=m; j++)
                    {
                        //check for identiy for main diagonal
                        if (i==j && a[i][j]!= 1)
                            t=1;        //not identity matrix
                        //checking for identiy for all other elements
                        if (i!=j && a[i][j]!= 0)
                            t=1;
                    }
                if(t==0)
                    System.out.println("\nMatrix is an identiy matrix");
                else
                    System.out.println("\nMatrix is not an identiy matrix");
        }else{
            System.out.println("\nNot a square matrix");
        }
        
    }
}
