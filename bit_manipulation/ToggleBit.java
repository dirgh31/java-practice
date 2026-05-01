import java.util.*;

public class ToggleBit{
    public static int toggleBit(int n, int pos) {
        return n ^ (1<<pos);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter a postiton to toggle (0-based): ");
        int pos = sc.nextInt();

        int result = toggleBit(n, pos);

        System.out.println("Result after toggling: " + result);
        sc.close();
    }
}