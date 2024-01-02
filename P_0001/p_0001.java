import java.util.HashMap;

public class p_0001 {
    public static void main(String[] args) {
        printArr(twoSum(new int[]{2,7,11,15}, 9));
        printArr(twoSum(new int[]{3,2,4}, 6));
        printArr(twoSum(new int[]{3,3}, 6));
        printArr(twoSum(new int[]{-3,4,3,90}, 0));
    }

    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int partner = target - nums[i];
            if(map.containsKey(partner)) {
                return new int[]{map.get(partner), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}