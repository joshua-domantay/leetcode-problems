public class p_1935 {
    public static void main(String[] args) {
        System.out.println(canBeTypedWords("hello world", "ad"));
        System.out.println(canBeTypedWords("leet code", "lt"));
        System.out.println(canBeTypedWords("leet code", "e"));
    }

    public static int canBeTypedWords(String text, String brokenLetters) {
        char[] broken = new char[26];
        for(char c : brokenLetters.toCharArray()) {
            broken[c - 97]++;   // a = 97
        }

        int words = 0;
        boolean clear;
        for(String word : text.split(" ")) {
            clear = true;
            for(char c : word.toCharArray()) {
                if(broken[c - 97] != 0) {
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