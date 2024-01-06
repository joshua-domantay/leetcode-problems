import java.util.ArrayList;

public class p_0905 {
    public static void main(String[] args) {
        printArray(sortArrayByParity(new int[]{3,1,2,4}));
    }

    public static void printArray(int[] arr) {
        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void mergeSortParity(int[] arr, int start, int end) {
        if((end - start) <= 1) {
            return;
        }

        int mid = (end + start) / 2;
        mergeSortParity(arr, start, mid);
        mergeSortParity(arr, mid, end);

        int[] sort = new int[end - start];
        int index = 0, a = start, b = mid;

        // Even
        while((a < mid) && ((arr[a] % 2) == 0)) {
            sort[index] = arr[a];
            a++;
            index++;
        }
        while((b < end) && ((arr[b] % 2) == 0)) {
            sort[index] = arr[b];
            b++;
            index++;
        }

        // Odd
        while(a < mid) {
            sort[index] = arr[a];
            a++;
            index++;
        }
        while(b < end) {
            sort[index] = arr[b];
            b++;
            index++;
        }

        for(int i = 0; i < sort.length; i++) {
            arr[start + i] = sort[i];
        }
    }

    public static int[] sortArrayByParity(int[] nums) {
        int lastEven = 0, temp;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                temp = nums[i];
                nums[i] = nums[lastEven];
                nums[lastEven] = temp;
                lastEven++;
            }
        }
        return nums;

        /* 3ms */
        // ArrayList<Integer> evens = new ArrayList<>();
        // ArrayList<Integer> odds = new ArrayList<>();
        // for(int x : nums) {
        //     if(x % 2 == 0) {
        //         evens.add(x);
        //     } else {
        //         odds.add(x);
        //     }
        // }

        // for(int i = 0; i < nums.length; i++) {
        //     if(evens.size() > 0) {
        //         nums[i] = evens.remove(0);
        //     } else {
        //         nums[i] = odds.remove(0);
        //     }
        // }

        // return nums;


        /* 2ms */
        // if(nums.length > 1) {
        //     mergeSortParity(nums, 0, nums.length);
        // }

        // return nums;

        /* 2ms */
        // ArrayList<Integer> odds = new ArrayList<>();
        // int temp;
        // for(int i = 0; i < nums.length; i++) {
        //     if(nums[i] % 2 == 0) {
        //         if(odds.size() > 0) {
        //             temp = nums[odds.get(0)];
        //             nums[odds.get(0)] = nums[i];
        //             nums[i] = temp;
        //             odds.remove(0);
        //             odds.add(i);
        //         }
        //     } else {
        //         odds.add(i);
        //     }
        // }
        // return nums;
    }
}
