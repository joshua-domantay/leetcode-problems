import java.util.ArrayList;

public class p_2784 {
    public static void main(String[] args) {
        System.out.println(isGood(new int[]{2, 1, 4, 4, 3}));
        System.out.println(isGood(new int[]{2, 1, 5, 4, 3}));
    }

    public static boolean isGood(int[] nums) {
        mergeSort(nums, 0, nums.length);
        for(int i = 0; i < (nums.length - 1); i++) {
            if(nums[i] != (i + 1)) {
                return false;
            }
        }
        return (nums[nums.length - 1] == (nums.length - 1));
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if((end - start) <= 1) { return; }

        int mid = (end + start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        int a = start, b = mid;
        int[] sort = new int[end - start];
        for(int i = 0; i < sort.length; i++) {
            if((a != mid) && (b != end)) {
                if(arr[a] < arr[b]) {
                    sort[i] = arr[a];
                    a++;
                } else {
                    sort[i] = arr[b];
                    b++;
                }
            } else if(a < mid) {
                sort[i] = arr[a];
                a++;
            } else {
                sort[i] = arr[b];
                b++;
            }
        }

        for(int i = 0; i < sort.length; i++) {
            arr[start + i] = sort[i];
        }
    }
}