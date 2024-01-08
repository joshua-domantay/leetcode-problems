public class p_1051 {
    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));
        System.out.println(heightChecker(new int[]{5,1,2,3,4}));
        System.out.println(heightChecker(new int[]{1,2,3,4,5}));
        System.out.println(heightChecker(new int[]{1}));
        System.out.println(heightChecker(new int[]{2,1}));
}

    public static int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        mergeSort(expected, 0, expected.length);

        int mismatch = 0;
        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != expected[i]) {
                mismatch++;
            }
        }

        return mismatch;
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