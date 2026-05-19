abstract class Animal{ // like a blueprint
    Animal() {
        System.out.println("You're creating a new Animal");
    }
    abstract  void walk();
    public void eat() {
        System.out.println("Animal eats");
    }
}
class Horse extends Animal {
    Horse(){
        System.out.println("Created a Hose");
    }
    public void walk() {
        System.out.println("Walks on four legs");
    }
}
class Chicken extends Animal{
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class abstractionOOPS {
    public static void main(String[] args) {
        Horse horse = new Horse();
        // horse.walk();
        // horse.eat();
        // Chicken chicken = new Chicken();
        // chicken.walk();
        // horse.eat();
        
    }
}
