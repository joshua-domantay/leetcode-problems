public class P9_palindromeNum {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1871));
        System.out.println(isPalindrome(2876782));
        System.out.println(isPalindrome(282));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int y = x, res = 0;
        while(y != 0) {
            res = (res * 10) + (y % 10);
            y /= 10;
        }
        return (res == x);
    }
}
