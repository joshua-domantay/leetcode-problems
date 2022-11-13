public class P27_removeElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{4, 3, 2, 3, 1}, 3));
        System.out.println(removeElement(new int[]{4, 3, 3, 3, 1}, 3));
        System.out.println(removeElement(new int[]{2, 2, 2, 3, 2}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int curr = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[curr] = nums[i];
                curr++;
            }
        }
        return curr;
    }
}
