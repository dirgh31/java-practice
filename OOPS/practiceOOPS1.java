// class Pen {
//     String color;
//     String type; //ballpoint or gell

//     public void write() {
//         System.out.println("writing something");
//     }

//     public void printColor(){
//         System.out.println(this.color); 
//     }
// }



class Student {

    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student student2){
        this.name = student2.name;
        this.age = student2.age;
    }
    Student() {

    }
}

public class practiceOOPS1 {

    public static void main(String args[]) {

        // Pen pen1 = new Pen();
        // pen1.color = "brown";
        // pen1.type = "gel";

        Student student1 = new Student();
        student1.name = "Tony";
        student1.age = 24;

        Student student2 = new Student(student1);
        // student2.name = "Stark";
        // student2.age = 26;

        // student1.name = "Tony";
        // student1.age = 21;
        student2.printInfo();
    }
}