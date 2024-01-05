public class p_1287 {
    public static void main(String[] args) {
        System.out.println(findSpecialInteger(new int[]{1,2,2,6,6,6,6,7,10}));
        System.out.println(findSpecialInteger(new int[]{1,1}));
        System.out.println(findSpecialInteger(new int[]{1,1}));
        System.out.println(findSpecialInteger(new int[]{1,1,1,5}));
        System.out.println(findSpecialInteger(new int[]{1,5,5,7}));
    }

    public static int findSpecialInteger(int[] arr) {
        int last = arr[0], count = 0;
        for(int num : arr) {
            if(num != last) {
                last = num;
                count = 0;
            }
            count++;
            if(count > (arr.length / 4)) {
                return num;
            }
        }
        return last;
    }
}