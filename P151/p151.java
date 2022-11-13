public class p151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
        String[] words = s.strip().split(" ");
        StringBuilder str = new StringBuilder();
        for(int i = (words.length - 1); i >= 0; i--) {
            if(words[i].length() > 0) {
                str.append(words[i]);
                if(i != 0) { str.append(" "); }
            }
        }
        return str.toString();
    }
}
