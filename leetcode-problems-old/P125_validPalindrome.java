public class P125_validPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("race car"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int first = 0, last = s.length() - 1;
        while(first < last) {
            while((first < last) && !Character.isLetterOrDigit(s.charAt(first))) {
                first++;
            }
            while((first < last) && !Character.isLetterOrDigit(s.charAt(last))) {
                last--;
            }
            if(s.charAt(first) != s.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
