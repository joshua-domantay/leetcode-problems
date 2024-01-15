import java.util.HashSet;

public class p_1876 {
    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("xyzzaz"));
        System.out.println(countGoodSubstrings("aababcabc"));
    }

    public static int countGoodSubstrings(String s) {
        int result = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < (s.length() - 2); i++) {
            for(int j = 0; j < 3; j++) {
                char x = s.charAt(i + j);
                if(set.contains(x)) {
                    break;
                }
                set.add(x);
            }
            if(set.size() == 3) { result++; }
            set.clear();
        }
        return result;
    }
}
