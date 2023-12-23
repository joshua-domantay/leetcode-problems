public class p_0441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(8));
        System.out.println(arrangeCoins(10));
        System.out.println(arrangeCoins(2147483647)); 
    }

    public static int arrangeCoins(int n) {
        for(int i = 1; true; i++) {
            n -= i;
            if(n == 0) { return i; }
            if(n < 0) { return (i - 1); }
        }
    }
}
