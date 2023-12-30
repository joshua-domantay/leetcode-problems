import java.util.HashMap;

public class p_0819 {
    public static void main(String[] args) {
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
        System.out.println(mostCommonWord("a.", new String[]{}));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> paragraphMap = new HashMap<>();
        String result = "";
        int max = -1;
        for(String ban : banned) {
            paragraphMap.put(ban.toLowerCase(), -10000);
        }
        for(String word : paragraph.split("[!? ',;.]+")) {
            if(paragraphMap.containsKey(word.toLowerCase())) {
                paragraphMap.put(word.toLowerCase(), paragraphMap.get(word.toLowerCase()) + 1);
            } else {
                paragraphMap.put(word.toLowerCase(), 0);
            }

            if(paragraphMap.get(word.toLowerCase()) > max) {
                result = word.toLowerCase();
                max = paragraphMap.get(word.toLowerCase());
            }
        }
        return result;
    }
}