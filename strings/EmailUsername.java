import java.util.*;

public class EmailUsername{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();

        StringBuilder username = new StringBuilder();
        for(int i = 0; i<email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            }
            username.append(email.charAt(i));
        }
        System.out.println("Username: " + username);    
    }
}