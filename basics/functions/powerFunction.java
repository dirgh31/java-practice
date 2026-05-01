import java.util.*;

public class powerFunction{
    public static int calucaltepower(int x, int n){
        int power = 1;
        for(int i = 1; i<=n; i++) {
            power = power * x;

        }

        return power;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int result = calucaltepower(x, n);
        System.out.println("Power is: " + result);
        
    }
}