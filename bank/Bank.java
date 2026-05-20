package bank;

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Tony Stark";
        account1.email = "tonystark@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}