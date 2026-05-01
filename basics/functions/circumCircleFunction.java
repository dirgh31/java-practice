
public class circumCircleFunction{
    public static double  calculateCircum(double radius){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public static void main(String[] args) {
        double result = calculateCircum(5);
        System.out.println("Circumference: " + result);
    }
}