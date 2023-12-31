import java.util.ArrayList;

public class p_0884 {
    public static void main(String[] args) {
        printArray(uncommonFromSentences("this apple is sweet", "this apple is sour"));
        printArray(uncommonFromSentences("apple apple", "banana"));
    }

    public static void printArray(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Use HashSet according to better solutions
    public static String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> resultAL = new ArrayList<>();
        for(String a : (s1 + " " + s2).toLowerCase().split(" ")) {
            if(words.contains(a)) {
                resultAL.remove(a);
            } else {
                words.add(a);
                resultAL.add(a);
            }
        }
        
        String[] result = new String[resultAL.size()];
        for(int i = 0; i < resultAL.size(); i++) {
            result[i] = resultAL.get(i);
        }

        return result;
    }
}