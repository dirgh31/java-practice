import java.util.*;

public class functionEvenNumber{
    public static boolean isEven(int a){
        return a % 2 == 0;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(isEven(a)){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
    }
    
        }
    }
