class Student{
    String name;
    static String school;

    public static void changeSchool() {
        school = "newschool";
    }
    }
public class statickeyword {
    public static void main(String args[]){
        Student.school = "JMV";
        Student student1 = new Student();
        student1.name = "Tony";
        System.out.println(student1.school);

        
    }
    
}
