import java.util.HashMap;
import java.util.PriorityQueue;

public class p_1122 {
    public static void main(String[] args) {
        printArray(relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6}));
        printArray(relativeSortArray(new int[]{26,21,11,20,50,34,1,18}, new int[]{21,11,26,20}));
        printArray(relativeSortArray(new int[]{2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31}, new int[]{2,42,38,0,43,21}));
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] nums = new int[1001];
        for(int i : arr1) {
            nums[i]++;
        }
        int arr1Index = 0, arr2Index = 0;
        while(arr2Index < arr2.length) {
            if(nums[arr2[arr2Index]] > 0) {
                arr1[arr1Index] = arr2[arr2Index];
                nums[arr2[arr2Index]]--;
                arr1Index++;
            } else {
                arr2Index++;
            }
        }

        for(int i = 0; ((i < nums.length) && (arr1Index < arr1.length)); i++) {
            while((nums[i] > 0) && (arr1Index < arr1.length)) {
                nums[i]--;
                arr1[arr1Index] = i;
                arr1Index++;
            }
        }

        return arr1;

        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for(int i : arr1) {
        //     pq.add(i);
        // }
        
        // int arr1Index = 0, arr2Index = 0;
        // while(arr2Index < arr2.length) {
        //     if(pq.contains((Integer) arr2[arr2Index])) {
        //         arr1[arr1Index] = arr2[arr2Index];
        //         pq.remove((Integer) arr2[arr2Index]);
        //         arr1Index++;
        //     } else {
        //         arr2Index++;
        //     }
        // }
        
        // while(pq.size() > 0) {
        //     arr1[arr1Index] = pq.poll();
        //     arr1Index++;
        // }

        // return arr1;
    }

    // public static int[] relativeSortArray(int[] arr1, int[] arr2) {
    //     HashMap<Integer, Integer> order = new HashMap<>();
    //     for(int i = 0; i < arr1.length; i++) {
    //         order.put(arr1[i], (arr2.length + arr1[i]));
    //     }
    //     for(int i = 0; i < arr2.length; i++) {
    //         order.put(arr2[i], i);
    //     }
    //     mergeSortModified(arr1, 0, arr1.length, order);
    //     return arr1;
    // }

    // public static void mergeSortModified(int[] arr, int start, int end, HashMap<Integer, Integer> order) {
    //     if((start + 1) == end) { return; }

    //     int mid = (end + start) / 2;
    //     mergeSortModified(arr, start, mid, order);
    //     mergeSortModified(arr, mid, end, order);

    //     int a = start, b = mid;
    //     int[] sort = new int[end - start];
    //     for(int i = 0; i < sort.length; i++) {
    //         if((a != mid) && (b != end)) {
    //             if(order.get((Integer) arr[a]) < order.get((Integer) arr[b])) {
    //                 sort[i] = arr[a];
    //                 a++;
    //             } else {
    //                 sort[i] = arr[b];
    //                 b++;
    //             }
    //         } else if(a != mid) {
    //             sort[i] = arr[a];
    //             a++;
    //         } else {
    //             sort[i] = arr[b];
    //             b++;
    //         }
    //     }

    //     for(int i = 0; i < sort.length; i++) {
    //         arr[start + i] = sort[i];
    //     }
    // }
}
