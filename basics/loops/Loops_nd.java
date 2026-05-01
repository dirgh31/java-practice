import java.util.*;

public class Loops_nd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menuChoice;

        do { 
            System.out.println("--Menu Choice--");
            System.out.println("Enter 1 to enter student's marks.");
            System.out.println("Enter 0 to exit the program.");
            menuChoice = sc.nextInt();

            if (menuChoice == 1) {
                int marks;

                while (true){
                    System.out.println("Enter student's marks or -1 to return to the menu.");
                    marks = sc.nextInt();

            if (marks == -1) {
                break;
                } else if (marks < 0 || marks >100) {
                    System.out.println("Invalid marks entered. Please enter a value between 0 and 100, or -1 to exit to the main menu.");
                    continue;
                }
                if (marks > 90){
                    System.out.println("This is Good!");
                } else if (marks >= 60) {
                    System.out.println("This is also Good!");
                } else {
                    System.out.println("This is good as well!");
                }
                }
            } else if (menuChoice == 0) {
                System.out.println("Stopping the program. Goodbye!");
            } else {
                System.out.println("Invalid choice. Please enter 1 or 0");
            }
        } while (menuChoice != 0);
        sc.close();
    }
}