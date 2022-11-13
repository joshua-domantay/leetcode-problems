public class P28_implementStrStr {
    public static void main(String[] args) {
        System.out.println(strStr("Hello Worlld", "ll"));
        System.out.println(strStr("aabbccddaabb", "bb"));
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
