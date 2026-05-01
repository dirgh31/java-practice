import java.util.*;

public class averageFunction{
    public static int printAverage(int a, int b, int c) {
     int average = (a + b + c) / 3;
     return average;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int a = sc.nextInt();   
        System.out.print("Enter 2nd integer: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd integer: ");
        int c = sc.nextInt();
        
        int average = printAverage(a, b, c);
        System.out.println("Average: " + average);
        
    }
}