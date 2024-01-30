public class p_1869 {
    public static void main(String[] args) {
        System.out.println(checkZeroOnes("1101"));
        System.out.println(checkZeroOnes("111000"));
        System.out.println(checkZeroOnes("110100010"));
    }

    public static boolean checkZeroOnes(String s) {
        char last = s.charAt(0);
        int count = 0;
        int[] segments = new int[2];
        for(char c : s.toCharArray()) {
            if(c == last) {
                count++;
            } else {
                segments[last - '0'] = Math.max(segments[last - '0'], count);

                last = c;
                count = 1;
            }
        }
        segments[last - '0'] = Math.max(segments[last - '0'], count);

        return segments[1] > segments[0];
    }
}