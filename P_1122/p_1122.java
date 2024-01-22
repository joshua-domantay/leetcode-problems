import java.util.HashMap;

public class p_1122 {
    public static void main(String[] args) {
        printArray(relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6}));
        printArray(relativeSortArray(new int[]{26,21,11,20,50,34,1,18}, new int[]{21,11,26,20}));
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> order = new HashMap<>();
        for(int i = 0; i < arr1.length; i++) {
            order.put(arr1[i], (arr2.length + arr1[i]));
        }
        for(int i = 0; i < arr2.length; i++) {
            order.put(arr2[i], i);
        }
        mergeSortModified(arr1, 0, arr1.length, order);
        return arr1;
    }

    public static void mergeSortModified(int[] arr, int start, int end, HashMap<Integer, Integer> order) {
        if((start + 1) == end) { return; }

        int mid = (end + start) / 2;
        mergeSortModified(arr, start, mid, order);
        mergeSortModified(arr, mid, end, order);

        int a = start, b = mid;
        int[] sort = new int[end - start];
        for(int i = 0; i < sort.length; i++) {
            if((a != mid) && (b != end)) {
                if(order.get((Integer) arr[a]) < order.get((Integer) arr[b])) {
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
