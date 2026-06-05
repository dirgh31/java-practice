import java.util.*;

public class arrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
       // int[] marks = new int[3];
       //    int marks[] = new int[3];
        int[] numbers = new int[size];
        
        // input
        for(int i = 0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        // output
        for(int i = 0; i<numbers.length; i++) {
            if(numbers[i] == x) {
                System.out.println("x found at index : " + i);
            }
        }
        
        // marks[0]= 98; // phy
        // marks[1]= 97; // chem 
        // marks[2] = 96; // math
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
    }
}