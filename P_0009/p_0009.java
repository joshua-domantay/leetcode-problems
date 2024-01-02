public class p_0009 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0) { return false; }
        if((x >= 10) && ((x % 10) == 0)) { return false; }

        int xCopy = x, y = 0;
        while(xCopy > 0) {
            y = (y * 10) + (xCopy % 10);
            xCopy /= 10;
        }
        return x == y;
    }
}
