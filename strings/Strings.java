
public class Strings{
    public static void main(String[] args) {
        //String declaration 
        // String name = "Tony";
        // String fullName = "Tony Stark";
        // String sentence = "My name is Tony Stark";
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is: "+name);

        //concatenation
        // String firstName = "Tony";
        // String lastName = "Stark";
        // String fullName = firstName + " " +lastName;
        // System.out.println(fullName.length());

        // //charAt
        // for(int i =0; i<fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }

        //compare
        // String name1 = "Tony";
        // String name2 = "Tony2";

        // //1 s1 > s2 : +ve value
        // //2 s1 < s2 : -ve value
        // //3 s1 == s2 : 0 
        // if(name1.compareTo(name2) == 0) {
        //     System.out.println("Strings are equal!");
        // } else{
        //     System.out.println("Strings are not equal :( ");
        // }

        // String sentence = "TonyStark";
        // // substring(beg index, end index)
        // String name = sentence.substring(4);
        // System.out.println(name);

        // Strings are Immutable!

        // String str = "123";
        // int number = Integer.parseInt(str);
        // System.out.println(number);

        int number = 123; 
        String str = Integer.toString(number);
        System.out.println(str.length());


    }
}