public class p_0744 {
    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'x','x','f','c','y','y'}, 'c'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        char result = '~';
        for(char x : letters) {
            if((x != target) && ((x - target) > 0)) {
                if(x < result) {
                    result = x;
                }
            }
        }
        if(result == '~') {
            return letters[0];
        }
        return result;
    }
}
