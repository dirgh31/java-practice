import java.util.*;

public class replace{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();

        StringBuilder result = new StringBuilder(original);

        for(int i = 0; i<result.length(); i++) {
            if(result.charAt(i) == 'e'){
            result.setCharAt(i, 'i');
            }
        }
        System.out.println("Result " + result);
    }
}