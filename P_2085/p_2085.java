import java.util.HashMap;
import java.util.Map;

public class p_2085 {
    public static void main(String[] args) {
        System.out.println(countWords(new String[]{"leetcode","is","amazing","as","is"}, new String[]{"amazing","leetcode","is"}));
        System.out.println(countWords(new String[]{"b","bb","bbb"}, new String[]{"a","aa","aaa"}));
        System.out.println(countWords(new String[]{"a","ab"}, new String[]{"a","a","a","ab"}));
    }

    public static int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String x : words1) {
            if(map.containsKey(x)) {
                map.put(x, (map.get(x) + 1));
            } else {
                map.put(x, 1);
            }
        }

        for(String y : words2) {
            if(map.containsKey(y)) {
                if(map.get(y) > 1) {
                    map.remove(y);      // Remove to reduce loop iterations for counting
                } else {
                    map.put(y, (map.get(y) - 1));
                }
            }
        }

        int count = 0;
        for(Map.Entry<String, Integer> m : map.entrySet()) {
            if(m.getValue() == 0) {
                count++;
            }
        }
        
        return count;
    }
}