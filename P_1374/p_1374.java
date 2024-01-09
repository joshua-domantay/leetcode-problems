public class p_1374 {
    public static void main(String[] args) {
        System.out.println(generateTheString(3));
        System.out.println(generateTheString(6));
    }

    public static String generateTheString(int n) {
        char[] result = new char[n];
        int index = 0;
        if(n % 2 == 0) {
            result[index] = 'b';
            index++;
        }
        while(index < n) {
            result[index] = 'a';
            index++;
        }
        return new String(result);

        // String result = "";
        // int limit = n;
        // if(n % 2 == 0) {
        //     limit--;
        //     result += "b";
        // }
        // for(int i = 0; i < limit; i++) {
        //     result += "a";
        // }
        // return result;
    }
}