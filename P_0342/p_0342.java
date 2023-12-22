public class p_0342 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(5));
        System.out.println(isPowerOfFour(1));
    }

    public static boolean isPowerOfFour(int n) {
        // Log(x) / Log(4) = Log_4(x)
        return (((Math.log((double) n) / Math.log(4.0)) % 1) == 0);
    }
}
