
public class oddNumbersSumFunction{
    public static int  printOdd(int n)  {
        int sumOdd = 0;

        for(int i =1; i<=n; i++){
            if(i % 2 != 0) {
                sumOdd += i;
            }
        }
        return sumOdd;
    }
    public static void main(String[] args) {
        int result = printOdd(10);
        System.out.println("Sum of odd numbers: " + result);
    }
}