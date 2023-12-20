import java.util.HashMap;

public class p_0349 {
    public static void main(String[] args) {
        int[] result = intersection(new int[]{4,9,5,8}, new int[]{9,4,9,8,4});
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    // Use HashSet. Better way to code solution
    public static int[] intersection(int[] nums1, int[] nums2) { 
        int[] result;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums1.length; i++) {
            if(!map.containsKey(nums1[i])) {
                map.put(nums1[i], 1);
            }
        }
        for(int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i])) {
                if(map.get(nums2[i]) == 1) {
                    map.replace(nums2[i], 2);
                    count++;
                }
            }
        }
        result = new int[count];
        count = 0;
        for(HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                result[count] = entry.getKey();
                count++;
            }
        }
        return result;
    }
}
