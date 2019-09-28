//identify the largest and smallest value and show its position (row and column)
import java.util.Scanner;
public class Array12 {   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i,j;            //loop variable
        int n,m;            //Order of matrix
        int a[][] = new int [10][10];   //array
        int small, lar, rs, cs, rl, cl;
        //prompt -> Input the order of matrix
        System.out.println("\nEnter order of matrix ");
        n = input.nextInt();
        m = input.nextInt();
     
        System.out.println("\nEnter "+n+" X "+m+ " matrix \n");
        
        //input 
        for (i=1; i<=n; i++) 
            for (j=1; j<=m; j++)
                a[i][j] = input.nextInt();
        
        //first element is assumed to be the smallest and largest value
        small=a[1][1];
        lar = a[1][1];
        rs=1;
        cs=1;
        rl=1;
        cl=1;

        //display the matrix
        System.out.println("\nGiven matrix is \n");
        for (i=1; i<=n; i++)
        {
            for (j=1; j<=m; j++)
            {
                System.out.print("   "+a[i][j]);
                //check small elements
                if (small>a[i][j])
                {
                    //take it as small when found and changing row and column values
                    small=a[i][j];
                    rs=i;
                    cs=j;
                }
                //check large elements
                else if (lar<a[i][j])
                {
                    lar=a[i][j];
                    rl=i;
                    cl=j;
                }
            }
            System.out.print("\n");
                 
        }
        System.out.println("\nSmallest Element "+small);
        System.out.println("\nPresent at position -> row "+rs+ " and column -> "+cs);
        
        System.out.println("\nLargest Element "+lar);
        System.out.println("\nPresent at position -> row "+rl+ " and column -> "+cl);
        
       
    }
}
