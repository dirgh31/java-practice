import java.util.*;

public class votingFunctions{

    public static void votingcriteria(int a){
        if(a >= 18){
            System.out.print(a+ " Congrats, you're eligible to vote!");
        } else {
            System.out.print(a + " Sorry, you're under-age! You must be atleast 18.");
        }
        return;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a = sc.nextInt();
        
        votingcriteria(a);

        
    }

}