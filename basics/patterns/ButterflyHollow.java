
public class ButterflyHollow{
    public static void main(String[] args) {
        int n = 5;
        
        //uppper half
        for(int i =1; i<=n; i++){
            //left wing
            for(int j=1; j<=i; j++){
                if ( j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            // spaces 
             for ( j = 1; j <= 2 * n - i; j++) {
                    System.out.print(" ");
                }
            // right wing
            for( j = 1; j<=i; j++) {
                if(j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
             System.out.println("");
           } 
        }
        
    }
}