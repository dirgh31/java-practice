import java.util.*;

public class practice2DArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows] [cols];

        //input
        //rows
        for(int i = 0; i<rows; i++){
            // columns
            for(int j =0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the value of x for which the element is to be found: ");
        int x = sc.nextInt();

        for(int i =0; i<rows; i++) {
            for(int j =0; j<cols; j++) {
                // compare with x
                if(numbers[i][j] == x){
                    System.out.println("x is found at location (" + i + " , " + j + ")");
                }
            }
        }


    }
}