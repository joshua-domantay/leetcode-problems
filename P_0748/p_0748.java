import java.util.HashMap;

public class p_0748 {
    public static void main(String[] args) {
        System.out.println(shortestCompletingWord("1s3 PSt", new String[]{"step","steps","stripe","stepple"}));
        System.out.println(shortestCompletingWord("1s3 456", new String[]{"looks","pest","stew","show"}));
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character, Integer> letters = new HashMap<>();
        for(char i : licensePlate.toLowerCase().toCharArray()) {
            if(letters.containsKey(i)) {
                letters.put(i, letters.get(i) + 1);
            } else {
                letters.put(i, 1);
            }
        }

        HashMap<Character, Integer> lettersCopy = new HashMap<>(letters);   // Copy letters
        String result = "";
        int highest = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < words.length; i++) {
            lettersCopy = new HashMap<>(letters);
            count = 0;
            for(char j : words[i].toLowerCase().toCharArray()) {
                if(lettersCopy.containsKey(j)) {
                    if(lettersCopy.get(j) > 0) {
                        lettersCopy.put(j, lettersCopy.get(j) - 1);
                        count++;
                    }
                }
            }
            if(count > highest) {
                result = words[i];
                highest = count;
            } else if(count == highest) {
                if(words[i].length() < result.length()) {
                    result = words[i];
                    highest = count;
                }
            }
        }

        return result;
    }
}