interface Animal {
    int eyes = 2;
     void walk();
     // it cannot have non-abstract function also no implementation of function
}
interface Herbivore {

}
class Horse implements Animal,Herbivore { // multiple inheritance
    public void walk() {
        System.out.println("Walks on 4 legs");

    }
}

public class interfaces {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
    
}
