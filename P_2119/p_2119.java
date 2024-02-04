public class p_2119 {
    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(526));
        System.out.println(isSameAfterReversals(1800));
        System.out.println(isSameAfterReversals(0));
    }

    public static boolean isSameAfterReversals(int num) {
        if((num > 0) && ((num % 10) == 0)) { return false; }
        return true;
    }
}