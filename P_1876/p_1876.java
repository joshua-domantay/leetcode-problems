public class p_1876 {
    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("xyzzaz"));
        System.out.println(countGoodSubstrings("aababcabc"));
    }

    public static int countGoodSubstrings(String s) {
        int result = 0;
        char[] record = new char[3];
        for(int i = 0; i < (s.length() - 2); i++) {
            record[0] = s.charAt(i);
            record[1] = s.charAt(i + 1);
            if(record[0] == record[1]) { continue; }
            record[2] = s.charAt(i + 2);
            if((record[2] == record[0]) || (record[2] == record[1])) { continue; }
            
            result++;
        }
        return result;
    }
}
