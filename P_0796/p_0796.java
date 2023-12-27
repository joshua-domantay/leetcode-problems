public class p_0796 {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
        System.out.println(rotateString("abcde", "abced"));
    }

    public static boolean rotateString(String s, String goal) {
        for(int i = 0; i < goal.length(); i++) {
            if(s.equals(goal)) {
                return true;
            }
            s = s.substring(1) + s.charAt(0);
        }
        return false;
    }
}
