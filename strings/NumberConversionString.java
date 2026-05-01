import java.util.*;

public class NumberConversion{
    public static String decimalToBinary(int n) {
        if(n == 0) return "0";

        StringBuilder binary = new StringBuilder();

        while(n > 0) {
            binary.append(n % 2); // remainder (0 or 1)
            n = n/2;

        }
        return binary.reverse().toString(); // reverse to get the correct order
    }
    // Function to convert Binary to Decimal 
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for(int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - 0;
            decimal += bit * Math.pow(2, power);
            power++;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Decimal to Binary
        System.out.print("Enter a decimal number: ");
        String binary = sc.next();
        System.out.println("Decimal: " + binaryToDecimal(binary));
        sc.close();
    }
    
}