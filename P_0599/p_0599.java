import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class p_0599 {
    public static void main(String[] args) {
        printArray(findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"}, new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"}));
        printArray(findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"}, new String[]{"KFC","Shogun","Burger King"}));
        printArray(findRestaurant(new String[]{"happy","sad","good"}, new String[]{"sad","happy","good"}));
        printArray(findRestaurant(new String[]{"happy","sad","good"}, new String[]{"Sad","happy","good"}));
    }

    public static void printArray(String[] arr) {
        for(String i : arr) {
            System.out.print(i + " - ");
        }
        System.out.println();
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> list1Set = new HashMap<>();
        for(int i = 0; i < list1.length; i++) {
            list1Set.put(list1[i], i);
        }

        int leastSum = Integer.MAX_VALUE;
        HashMap<String, Integer> list2Set = new HashMap<>();
        for(int i = 0; i < list2.length; i++) {
            if(list1Set.containsKey(list2[i])) {
                int sum = (list1Set.get(list2[i]) + i);
                list2Set.put(list2[i], sum);
                if(leastSum > sum) {
                    leastSum = sum;
                }
            }
        }

        ArrayList<String> result = new ArrayList<>();
        for(Map.Entry<String, Integer> set : list2Set.entrySet()) {
            if(set.getValue() == leastSum) {
                result.add(set.getKey());
            }
        }

        return result.toArray(new String[]{});
    }
}
