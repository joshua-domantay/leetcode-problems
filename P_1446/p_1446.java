public class p_1446 {
    public static void main(String[] args) {
        System.out.println(maxPower("leetcode"));
        System.out.println(maxPower("abbcccddddeeeeedcba"));
    }

    public static int maxPower(String s) {
        char curr = '-';
        int count = 0, max = -1;
        for(char c : s.toCharArray()) {
            if(c != curr) {
                if(count > max) { max = count; }
                curr = c;
                count = 1;
            } else {
                count++;
            }
        }

        if(count > max) { max = count; }

        return max;
    }
}
