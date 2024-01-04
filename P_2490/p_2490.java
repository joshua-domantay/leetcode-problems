public class p_2490 {
    public static void main(String[] args) {
        System.out.println(isCircularSentence("leetcode exercises sound delightful"));
        System.out.println(isCircularSentence("eetcode"));
        System.out.println(isCircularSentence("Leetcode is cool"));
        System.out.println(isCircularSentence("Leetcode eisc cool"));
    }

    public static boolean isCircularSentence(String sentence) {
        char last = sentence.charAt(sentence.length() - 1);
        String[] words = sentence.split(" ");
        for(String x : words) {
            if(x.charAt(0) != last) {
                return false;
            }
            last = x.charAt(x.length() - 1);
        }
        return true;
    }
}
