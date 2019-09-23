// Sample of two dim array

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            float [][] buyerItemPrice = new float [5][4];   //array
            float totalItemPrice = 0;
            float sum = 0 ;
            int x,y;                                        //loop
            
            System.out.print("Enter four item price for each buyer\n");
            //input
            for(x=0;x<5;x++){
                System.out.print("Buyer #"+(x+1)+" \n");
               for(y=0;y<4;y++){
                   buyerItemPrice[x][y] = input.nextFloat();                           
               }                 
            }
            
            System.out.print("Buyer\t\t\t\tItem Price\t\t\t\t\t\tTotal Price\n");

            for(x=0;x<5;x++){
                System.out.print("Buyer #"+(x+1));
               for(y=0;y<4;y++){
                   System.out.print("\t\t"+buyerItemPrice[x][y]);
                   totalItemPrice+=buyerItemPrice[x][y];                           
               }    
                System.out.print("\t\t"+totalItemPrice+"\n");               
          sum+=totalItemPrice;
          totalItemPrice=0;      
        }
        System.out.println("Sum is "+sum);
    }
}