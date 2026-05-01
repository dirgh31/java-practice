import java.util.*;

public class typeofNumbersFunction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zeros = 0;

        int choice;

        do { 
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if(num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zeros++;
            }
            System.out.print("Do you want to continue? (1 for yes / 0 for no): ");
            choice = sc.nextInt();
            
        } while (choice == 1);

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zeros);
    }
}