public class p_0680 {
    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));
        System.out.println(validPalindrome("abca"));
        System.out.println(validPalindrome("abc"));
        System.out.println(validPalindrome("ab"));
        System.out.println(validPalindrome("bb"));
        System.out.println(validPalindrome("a"));
        System.out.println(validPalindrome("aabcacba"));
        System.out.println(validPalindrome("eeccccbebaeeabebccceea"));
        System.out.println(validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }

    public static boolean validPalindrome(String s) {
        return validPalindromeH(s, 0, (s.length() - 1), (s.length() / 2), false);
    }

    public static boolean validPalindromeH(String s, int start, int end, int limit, boolean remove) {
        if((start > limit) || (start >= s.length()) || (end < 0)) {
            return true;
        }

        if(s.charAt(start) == s.charAt(end)) {
            return validPalindromeH(s, (start + 1), (end - 1), limit, remove);
        }

        if(!remove) {
            boolean first = validPalindromeH(s, (start + 1), end, limit, true);
            boolean second = validPalindromeH(s, start, (end - 1), limit, true);
            return (first || second);
        }

        return false;
    }
}
