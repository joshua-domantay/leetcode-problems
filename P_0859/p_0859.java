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
            int first = -1;
            int second = -1;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != goal.charAt(i)) {
                    if(first == -1) {
                        first = i;
                    } else if(second == -1) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }

            if((first == -1) || (second == -1)) {
                return false;
            }

            if((s.charAt(first) == goal.charAt(second)) && (s.charAt(second) == goal.charAt(first))) {
                return true;
            }
        }

        return false;
    }
}