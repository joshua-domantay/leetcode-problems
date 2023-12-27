public class p_0796 {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
        System.out.println(rotateString("abcde", "abced"));
    }

    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        s += s;
        return s.contains(goal);
    }
}
