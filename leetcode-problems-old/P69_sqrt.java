public class P69_sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(5));
        System.out.println(mySqrt(82));
        System.out.println(mySqrt(79));
        System.out.println(mySqrt(169));
        System.out.println(mySqrt(168));
        System.out.println(mySqrt(2147395600));
    }

    public static int mySqrt(int x) {
        int r = 0, lastSqrt = 0;
        for(int i = 0; i <= ((x / 2) + 1); i++) {
            if((i * i) <= x) {
                if(lastSqrt > (i * i)) {
                    break;
                }
                r = i;
            } else {
                break;
            }
        }
        return r;
    }
}
