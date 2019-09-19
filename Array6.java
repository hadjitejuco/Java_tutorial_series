
//two dim array
public class Array6 {
    public static void main(String[] args) {
        int i,j;        // loops
        int a[][] = {{1,2},{3,4}};
        System.out.println("a[0][0] -> "+a[0][0]);
        System.out.println("a[0][1] -> "+a[0][1]);
        System.out.println("a[1][0] -> "+a[1][0]);
        System.out.println("a[1][1] -> "+a[1][1]);
        
        System.out.println();
        
        for (i=0; i<a.length;i++){
            for (j=0; j<a.length;j++){
                System.out.print("Element at a["+i+"]["+j+"] -->");
                System.out.println(" "+a[i][j]);  //0  0 -> 1
            }
        }
    }   
}
