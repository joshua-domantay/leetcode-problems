public class p_1025 {
    public static void main(String[] args) {
        System.out.println(divisorGame(2));
        System.out.println(divisorGame(3));
        System.out.println(divisorGame(657));
        System.out.println(divisorGame(658));
    }

    public static boolean divisorGame(int n) {
        return (n % 2) == 0;
        // int x, turn = 0;
        // while(n > 1) {
        //     if(n % 2 == 0) {    // even
                
        //     } else {    // odd
        //         n -= 1;
        //     }
        //     turn++;
        // }
    }
}
