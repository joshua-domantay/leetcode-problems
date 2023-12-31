import java.util.ArrayList;
import java.util.HashMap;

public class p_0884 {
    public static void main(String[] args) {
        printArray(uncommonFromSentences("this apple is sweet", "this apple is sour"));
        printArray(uncommonFromSentences("apple apple", "banana"));
    }

    public static void printArray(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> resultAL = new ArrayList<>();
        for(String a : s1.toLowerCase().split(" ")) {
            if(map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
                resultAL.remove(a);
            } else {
                map.put(a, 1);
                resultAL.add(a);
            }
        }

        for(String b : s2.toLowerCase().split(" ")) {
            if(map.containsKey(b)) {
                map.put(b, map.get(b) + 1);
                resultAL.remove(b);
            } else {
                map.put(b, 1);
                resultAL.add(b);
            }
        }
        
        String[] result = new String[resultAL.size()];
        for(int i = 0; i < resultAL.size(); i++) {
            result[i] = resultAL.get(i);
        }

        return result;
    }
}