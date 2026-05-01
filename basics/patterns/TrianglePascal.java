
public class TrianglePascal{
    public static void main(String[] args) {
        int n = 5;

        // outer loop
        for(int i = 0; i<n ; i++){

            int num = 1;

         // spaces
        for(int j = 0; j<n - i; j++) {
            System.out.print(" ");
            }
        // numbers
        for(int j =0; j<= i; j++){
            System.out.print(num + " ");
            num = num * (i-j)/(j+1);
        }
            System.out.println("");
        }
    }
}