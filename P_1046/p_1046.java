import java.util.HashSet;
import java.util.LinkedList;

public class p_1046 {
    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1}));
        System.out.println(lastStoneWeight(new int[]{1}));
        System.out.println(lastStoneWeight(new int[]{2,7,5}));
        System.out.println(lastStoneWeight(new int[]{2,7,6}));
    }

    public static int lastStoneWeight(int[] stones) {
        mergeSort(stones, 0, stones.length);
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < stones.length; i++) {
            list.add(stones[i]);
        }

        int a, b, diff;
        boolean clear;
        while(list.size() > 1) {
            a = list.pop();
            b = list.pop();
            if(a != b) {
                diff = a - b;
                clear = false;
                for(int i = 0; i < list.size(); i++) {
                    if(diff > list.get(i)) {
                        list.add(i, diff);
                        clear = true;
                        break;
                    }
                }
                if(!clear) {
                    list.add(diff);
                }
            }
        }

        return (list.size() > 0) ? list.get(0) : 0;
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if((start + 1) == end) { return; }

        int mid = (end + start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        int a = start, b = mid;
        int[] sort = new int[end - start];
        for(int i = 0; i < sort.length; i++) {
            if((a != mid) && (b != end)) {
                if(arr[a] > arr[b]) {
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
