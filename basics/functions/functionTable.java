import java.util.*;

public class functionTable{
    public static void printTable(int a){
        for(int i = 1; i<=10; i++){
            System.out.println(a + " x " + i + " = " + (a*i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        printTable(a);
        
    }
}