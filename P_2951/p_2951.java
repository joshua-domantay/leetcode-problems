import java.util.ArrayList;
import java.util.List;

public class p_2951 {
    public static void main(String[] args) {
        List<Integer> test = findPeaks(new int[]{2,4,4});
        printList(test);
        test = findPeaks(new int[]{1,4,3,8,5});
        printList(test);
    }

    public static void printList(List<Integer> arr) {
        System.out.print("[");
        if(arr.size() <= 0) {
            System.out.println("]");
        } else {
            for(int i = 0; i < (arr.size() - 1); i++) {
                System.out.print(arr.get(i) + ", ");
            }
            System.out.println(arr.get(arr.size() - 1) + "]");
        }
    }

    public static List<Integer> findPeaks(int[] mountain) {
        List<Integer> al = new ArrayList<>();
        for(int i = 1; i < (mountain.length - 1); i++) {
            if((mountain[i] > mountain[i - 1]) && (mountain[i] > mountain[i + 1])) {
                al.add(i);
            }
        }
        return al;
    }
}