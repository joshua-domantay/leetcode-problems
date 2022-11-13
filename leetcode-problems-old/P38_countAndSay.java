public class P38_countAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(5));
    }

    public static String countAndSay(int n) {
        return countAndSay(n - 1, "1");
    }

    public static String countAndSay(int n, String s) {
        if(n == 0) {
            return s;
        }
        int count = 0;
        char last = 'a';
        String result = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != last) {
                if(count != 0) {
                    result += count + "" + last;
                }
                count = 1;
                last = s.charAt(i);
            } else {
                count++;
            }
        }
        result += count + "" + s.charAt(s.length() - 1);
        return countAndSay(n - 1, result);
    }
}
