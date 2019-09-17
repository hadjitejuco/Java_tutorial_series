//Input array
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i;
        int a[] = new int[5];
        
        for (i=0; i<a.length;i++){
            System.out.print("Enter value -> ");
            a[i] = input.nextInt();
        }
        System.out.println("\nElements of array ");
        for (i=0; i<a.length;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println();
    }
}
