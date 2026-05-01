import java.util.*;

public class greaterNumberFunction {
    public static void printgreaterNumber(int a, int b) {
        if(a>b){
            System.out.print(a +  "-a is greater than b!");
        } else {
            System.out.print(b +  "-b is greater than a!");
        }
        return; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of first integer a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of second integer b: ");
        int b = sc.nextInt();

        printgreaterNumber(a, b);
        
    }
}