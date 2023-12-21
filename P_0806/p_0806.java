public class p_0806 {
    public static void main(String[] args) {
        int[] result = numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "bbbcccdddaaa");
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] numberOfLines(int[] widths, String s) {
        int[] result = new int[]{1, 0};
        for(char c : s.toCharArray()) {
            if((result[1] + widths[c - 'a']) > 100) {
                result[0]++;
                result[1] = 0;
            }
            result[1] += widths[c - 'a'];
        }
        return result;
    }
}
