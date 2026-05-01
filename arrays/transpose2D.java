import java.util.*;

public class transpose2D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int matrix[][] = new int[m][n];

        // original matrix
        //rows
        for(int i = 0; i<m; i++) {
            // columns
            for(int j = 0; j<n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The transpose is: ");
        // To print transpose
        for(int j = 0; j<n; j++) {
            for(int i = 0; i<m; i++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println("");
        }
    }
}