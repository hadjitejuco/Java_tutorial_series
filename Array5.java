//Linear search is used to search a key element from multiple elements.

import java.util.Scanner;
public class Array5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i, n, x, flag=0;   //i-loop, n-input a number
        System.out.print("Enter a number: ");
        n = input.nextInt();
        int a[] = new int[n];
        System.out.println("Please enter "+n+" numbers: ");
        //input
        for (i=0; i<a.length;i++){
            a[i] = input.nextInt();
        }
        System.out.println("Enter number to search: ");
        x = input.nextInt();
        for (i=0; i<a.length;i++){
            if (a[i]==x){
                System.out.println("\nNumber "+x+" is present at position "+(i+1));
                flag = 1;
            }
        }
        if (flag==0){
            System.out.println("\nNumber not found...");
        }
        
    }
}
