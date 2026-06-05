import java.util.*;

public class spiralOrder2DArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int matrix[][] = new int[m][n];

        //input
        //rows
        for(int i = 0; i<m; i++){
            // cols
            for(int j =0; j<n; j++) {
                matrix [m][n] = sc.nextInt();
            }
        }
        System.out.println("The Spiral Order Matrix is: ");

        int rowStart = 0;
        int rowEnd = m - 1;
        int colStart = 0;
        int colEnd = n - 1;

        // To print spiral order matrix
        while(rowStart <= rowEnd && colStart <= colEnd) {
            // 1
            for(int col = colStart; col<=colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            // 2
            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(matrix[row][colEnd] +" ");
            }
            colEnd--;

            // 3
            for(int col=colEnd; col>=colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;

            //4
            for(int row=rowEnd; row>=rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;
            System.out.println("");

        }


    }
}