import java.util.*;

public class cummulativeString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of strings: ");
        int size = sc.nextInt();
        sc.nextLine();

        String[]strArray = new String [size];
        
        StringBuilder sb = new StringBuilder();

        System.out.println("Enter " + size + " strings: ");
        for(int i = 0 ; i<size; i++) {
            strArray[i] = sc.nextLine();
            sb.append(strArray[i]);
        }
        int combinedLength = sb.length();

        System.out.println("\nCombined String: " + sb.toString());
        System.out.println("Cummulative Length: " + combinedLength);

        sc.close();

    }
}

