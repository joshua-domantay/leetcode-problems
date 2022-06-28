import java.util.Set;
import java.util.HashSet;

public class p217 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> nSet = new HashSet<>();
        for(int x : nums) {
            if(nSet.contains(x)) { return true; }
            nSet.add(x);
        }
        return false;
    }
}
