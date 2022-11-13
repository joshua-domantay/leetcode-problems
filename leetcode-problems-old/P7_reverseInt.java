public class P7_reverseInt {
    public static void main(String[] args) {
        System.out.println(-2147483648 + " : " + reverse(-2147483648));
        System.out.println(2147483647 + " : " + reverse(2147483647));
        System.out.println(214 + " : " + reverse(214));
        System.out.println(-415 + " : " + reverse(-415));
        System.out.println(-2147483412 + " : " + reverse(-2147483412));
    }

    public static int reverse(int x) {
        int y = x, res = 0;
        while(y != 0) {
            if((res > (Integer.MAX_VALUE / 10)) || (res < (Integer.MIN_VALUE / 10))) {
                return 0;
            } else if(res == (Integer.MAX_VALUE / 10)) {
                if(y > 7) {
                    return 0;
                }
            } else if(res == (Integer.MIN_VALUE / 10)) {
                if(y < -8) {
                    return 0;
                }
            }
            res = (res * 10) + (y % 10);
            y /= 10;
        }
        return res;
    }
}
