public class p_0303 {
    public static void main(String[] args) {
        NumArray test = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(test.sumRange(0, 2));
        System.out.println(test.sumRange(2, 5));
        System.out.println(test.sumRange(0, 5));
    }
}
