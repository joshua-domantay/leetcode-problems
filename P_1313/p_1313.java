public class p_1313 {
    public static void main(String[] args) {
        printArray(decompressRLElist(new int[]{1,2,3,4}));
        printArray(decompressRLElist(new int[]{1,1,2,3}));
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    public static int[] decompressRLElist(int[] nums) {
        int[] freq = new int[nums.length / 2];
        int[] val = new int[nums.length / 2];
        int resultLength = 0;
        for(int i = 0; i < nums.length; i++) {
            if((i % 2) == 0) {
                freq[i / 2] = nums[i];
                resultLength += nums[i];
            } else {
                val[i / 2] = nums[i];
            }
        }

        int[] result = new int[resultLength];
        int curr = 0, count = 0;
        for(int i = 0; i < result.length; i++) {
            if(freq[curr] == count) {
                curr++;
                count = 0;
            }
            result[i] = val[curr];
            count++;
        }
        return result;
    }
}