public class p_0509 {
    public static void main(String[] args) {
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
    }

    public static int fib(int n) {
        return fib(n, 0, 1);
    }

    public static int fib(int n, int a, int b) {
        if(n == 0) {
            return a;
        }

        b += a;
        a = b - a;
        
        return fib(--n, a, b);
    }
}
