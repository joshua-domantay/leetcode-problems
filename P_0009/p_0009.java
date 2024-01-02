public class p_0009 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0) { return false; }

        String xString = x + "";
        for(int i = 0; i < xString.length(); i++) {
            if((xString.charAt(i) - 48) != (x % 10)) {
                return false;
            }
            x /= 10;
        }
        return true;
    }
}
