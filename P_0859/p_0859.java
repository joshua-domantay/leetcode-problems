public class p_0859 {
    public static void main(String[] args) {
        System.out.println(buddyStrings("ab", "ba"));
        System.out.println(buddyStrings("ab", "ab"));
        System.out.println(buddyStrings("aa", "aa"));
        System.out.println(buddyStrings("abcdefg", "bacdefg"));
        System.out.println(buddyStrings("abcadefga", "abcadefga"));
        System.out.println(buddyStrings("abcadefgfaf", "afcadefgfab"));
        System.out.println(buddyStrings("abcaa", "abcbb"));
    }

    public static boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }

        boolean swap = false;
        if(s.equals(goal)) {
            for(int i = 0; i < s.length(); i++) {
                if(i != s.lastIndexOf(s.charAt(i))) {   // Swap with same letter
                    return true;
                }
            }
        } else {
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != goal.charAt(i)) {
                    int index = s.lastIndexOf(goal.charAt(i));
                    while(index > i) {
                        String t = s.substring(0, i) + s.charAt(index) + s.substring(i + 1, index) + s.charAt(i) + s.substring(index + 1, s.length());
                        if(t.equals(goal)) {
                            return true;
                        }
                        index = s.substring(0, index).lastIndexOf(goal.charAt(i));
                    }
                }
            }
        }

        return false;
    }
}