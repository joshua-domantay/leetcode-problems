public class p_2490 {
    public static void main(String[] args) {
        System.out.println(isCircularSentence("leetcode exercises sound delightful"));
        System.out.println(isCircularSentence("eetcode"));
        System.out.println(isCircularSentence("Leetcode is cool"));
        System.out.println(isCircularSentence("Leetcode eisc cool"));
    }

    public static boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        for(int i = 0; i < words.length; i++) {
            if(words[i].charAt(words[i].length() - 1) != words[(i + 1) % words.length].charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
