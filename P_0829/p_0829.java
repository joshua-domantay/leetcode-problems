public class p_0829 {
    public static void main(String[] args) {
        System.out.println(consecutiveNumbersSum(1));
        System.out.println(consecutiveNumbersSum(2));
        System.out.println(consecutiveNumbersSum(3));
        System.out.println(consecutiveNumbersSum(4));
        System.out.println(consecutiveNumbersSum(5));
        System.out.println(consecutiveNumbersSum(9));
        System.out.println(consecutiveNumbersSum(15));
        System.out.println(consecutiveNumbersSum(93003));
        System.out.println(consecutiveNumbersSum(643267314));
    }

    public static int consecutiveNumbersSum(int n) {
        // Time Limit Exceeded
        // int start = 1, end = 2, sum = 3, count = 1, target = ((n / 2) + 1);
        // while(end <= target) {
        //     if(start == end) {
        //         end++;
        //         continue;
        //     }

        //     if(sum < n) {
        //         end++;
        //         sum += end;
        //     } else if(sum > n) {
        //         sum -= start;
        //         start++;
        //     } else {
        //         end++;
        //         sum += end;
        //         count++;
        //     }
        // }
        // return count;

        // Memory Limit Exceeded
        // int[] nums = new int[(n / 2) + 2];
        // int count = 1;
        // if(nums.length < 3) { return count; }

        // int sum = 0;
        // for(int i = 0; i < nums.length; i++) {
        //     sum += i;
        //     nums[i] = sum;
        // }

        // int start = 1, end = 2;
        // while((start < end) && (end < nums.length)) {
        //     sum = nums[end] - nums[start - 1];
        //     if(sum < n) {
        //         end++;
        //     } else if(sum > n) {
        //         start++;
        //     } else {
        //         end++;
        //         count++;
        //     }
        // }
        // return count;

        return 0;
    }
}