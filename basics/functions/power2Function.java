import java.util.*;

public class power2{
    public static boolean isPower0fTwo(int n) {
        return n > 0 && (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(isPower0fTwo(num)) {
            System.out.println(num + " is a power of 2. ");
        } else {
            System.out.println(num + " is NOT a power of 2. ");
        }
        sc.close();
    }
}