import java.util.*;

public class countBinary{
    public static int countOnes(int n) {
        int count = 0;
        while(n > 0) {
            n = n & (n-1); // remove lowest set bit
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = countOnes(num);

        System.out.println("Number of 1's: " + result);
        sc.close();
        
    }
}