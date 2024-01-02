import java.util.HashSet;

public class p_1935 {
    public static void main(String[] args) {
        System.out.println(canBeTypedWords("hello world", "ad"));
        System.out.println(canBeTypedWords("leet code", "lt"));
        System.out.println(canBeTypedWords("leet code", "e"));
    }

    public static int canBeTypedWords(String text, String brokenLetters) {
        int words = 0;
        HashSet<Character> brokenSet = new HashSet<>();
        
        for(char c : brokenLetters.toCharArray()) {
            brokenSet.add(c);
        }

        boolean clear;
        for(String word : text.split(" ")) {
            clear = true;
            for(char c : word.toCharArray()) {
                if(brokenSet.contains(c)) {
                    clear = false;
                    break;
                }
            }
            if(clear) {
                words++;
            }
        }

        return words;
    }
}