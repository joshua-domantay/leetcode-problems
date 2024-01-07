public class p_1137 {
    public static void main(String[] args) {
        System.out.println(tribonacci(4));
        System.out.println(tribonacci(5));
        System.out.println(tribonacci(25));
    }

    public static int tribonacci(int n) {
        if(n < 2) { return n; }

        int a = 0, b = 1, c = 1, temp;
        while(n > 2) {
            temp = c;
            c += a + b;
            a = b;
            b = temp;
            n--;
        }
        return c;
    }
}
