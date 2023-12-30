import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class p_0819 {
    public static void main(String[] args) {
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
        System.out.println(mostCommonWord("a.", new String[]{}));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        List<String> bannedList = Arrays.asList(banned);
        HashMap<String, Integer> paragraphMap = new HashMap<>();
        String result = "";
        int max = -1;
        for(String word : paragraph.toLowerCase().split("[!? ',;.]+")) {
            if(!bannedList.contains(word)) {
                if(paragraphMap.containsKey(word)) {
                    paragraphMap.put(word, paragraphMap.get(word) + 1);
                } else {
                    paragraphMap.put(word, 0);
                }

                if(paragraphMap.get(word) > max) {
                    result = word;
                    max = paragraphMap.get(word);
                }
            }
        }
        return result;
    }
}