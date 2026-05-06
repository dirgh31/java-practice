
import java.util.ArrayList;

public class Recursion3Subsets{

    public static void printSubset(ArrayList<Integer> subset) {

        for(int i = 0; i<subset.size(); i++){
            System.out.println(subset.get(i) + "");
        }
    }
    public static void findSubsets(int n, ArrayList<Integer> subset) {

        // base-case,
        if(n == 0) {
            printSubset(subset);
            return;
        }

        //add
        subset.add(n);
        findSubsets(n-1, subset);

        // cannot be added 
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);

        
    }
}