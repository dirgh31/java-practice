package OOPS;
import bank.Account;

class Shape {
    String color;
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{ // example of single-level inheritance
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
class EquilateralTrianlge extends Triangle{ //example of multi-level inheritance
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class Circle extends Shape{ // hierarchial inheritance
    public void are(int r){
        System.out.println((3.14)*r*r);
    }

}

}

public class inheritanceOOPS {
    public static void main(String[] args) {
        // Triangle t1 = new Triangle();
        // t1.color = "red";
        Account account1 = new Account();
        account1.name = "customer1";
        System.out.println(account1.name);
    }
}

        
