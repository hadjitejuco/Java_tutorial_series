//demonstrate odd / even numbers using arrays

import java.util.Scanner;
public class Array4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i, n;   //i-loop, n-input a number
        System.out.print("Enter a number: ");
        n = input.nextInt();
        int a[] = new int[n];
        System.out.println("Please enter "+n+" numbers: ");
        //input
        for (i=0; i<a.length;i++){
            a[i] = input.nextInt();
        }
        System.out.println("ODD Numbers: ");
        for (i=0; i<a.length;i++){
            if (a[i]%2==1)
                System.out.println(" "+a[i]);
        }
        System.out.println("EVEN Numbers: ");
        for (i=0; i<a.length;i++){
            if (a[i]%2==0)
                System.out.println(" "+a[i]);
        }
        
    }
}
