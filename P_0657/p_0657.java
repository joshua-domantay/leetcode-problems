public class p_0657 {
    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
    }

    // User submissions -> Maps for better runtime, moves.toCharArray for memory
    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for(int i = 0; i < moves.length(); i++) {
            switch(moves.charAt(i)) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'R':
                    x++;
                    break;
                default:    // L
                    x--;
            }
        }

        return (x == 0) && (y == 0);
    }
}
