import java.util.Scanner;

public class Primenumberchecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        sc.close();

        if(isPrime(number)) {
            System.out.println(number + "is a prime number.");
        } else {
            System.out.println(number + "is not a prime number.");
        }

    }

      public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++)
         if (n % i == 0) {
            return false;
           }
           return true;
    
       }
          

   }

