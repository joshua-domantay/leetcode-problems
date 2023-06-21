public class p_2090 {
    public static void main(String[] args) {
        int[] nums = getAverages(new int[]{7,4,3,9,1,8,5,2,6}, 3);
        System.out.print("[");
        for(int i = 0; i < (nums.length - 1); i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println(nums[nums.length - 1] + "]");
    }

    public static int[] getAverages(int[] nums, int k) {
        int[] result = new int[nums.length];
        for(int i = 0; i < result.length; i++) { result[i] = -1; }
        int last_index = 0;
        int next_index = k+k+1;
        if(nums.length < next_index) { return result; }

        long curr_sum = 0;
        for(int i = 0; i < next_index; i++) {
            curr_sum += nums[i];
        }
        result[k] = (int) (curr_sum / ((2 * k) + 1));

        for(int i = (k + 1); i < (nums.length - k); i++) {
            curr_sum += (-nums[last_index]) + nums[next_index];
            last_index++;
            next_index++;
            result[i] = (int) (curr_sum / ((2 * k) + 1));
        }
        return result;
    }
}