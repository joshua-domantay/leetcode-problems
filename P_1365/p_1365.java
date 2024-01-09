import java.util.ArrayList;
import java.util.PriorityQueue;

public class p_1365 {
    public static void main(String[] args) {
        int[] test = smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
        printArr(test);
        test = smallerNumbersThanCurrent(new int[]{6,5,4,8});
        printArr(test);
        test = smallerNumbersThanCurrent(new int[]{7,7,7,7});
        printArr(test);
    }

    public static void printArr(int[] test) {
        for(int i = 0; i < (test.length - 1); i++) {
            System.out.print(test[i] + ", ");
        }
        System.out.println(test[test.length - 1]);
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = nums.clone();
        mergeSort(count, 0, count.length);
        ArrayList<Integer> countAL = new ArrayList<>();
        for(int i : count) {
            countAL.add(i);
        }
        for(int i = 0; i < nums.length; i++) {
            count[i] = countAL.indexOf((Integer) nums[i]);
        }
        return count;
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if((end - start) <= 1) { return; }

        int mid = (end + start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        int[] sort = new int[end - start];
        int a = start, b = mid;
        for(int i = 0; i < sort.length; i++) {
            if((a != mid) && (b != end)) {
                if(arr[a] < arr[b]) {
                    sort[i] = arr[a];
                    a++;
                } else {
                    sort[i] = arr[b];
                    b++;
                }
            } else if(a != mid) {
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
