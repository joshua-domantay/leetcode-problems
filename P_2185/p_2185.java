public class p_2185 {
    public static void main(String[] args) {
        System.out.println(prefixCount(new String[]{"pay","attention","practice","attend"}, "at"));
        System.out.println(prefixCount(new String[]{"leetcode","win","loops","success"}, "code"));
    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String word : words) {
            if(word.startsWith(pref)) { count++; }
        }
        return count;
    }
}
