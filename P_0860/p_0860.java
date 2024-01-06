public class p_0860 {
    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5,5,5,10,20}));
        System.out.println(lemonadeChange(new int[]{5,5,10,10,20}));
        System.out.println(lemonadeChange(new int[]{5,5,5,10,10,20,5}));
        System.out.println(lemonadeChange(new int[]{5,5,5,10,10,20,5,5,5}));
        System.out.println(lemonadeChange(new int[]{5,5,20,5,5,10,5,10,5,20}));
    }

    public static boolean lemonadeChange(int[] bills) {
        int[] change = new int[4];
        for(int bill : bills) {
            change[(bill / 5) - 1]++;
            bill -= 5;
            if(bill > 0) {
                int i = (bill / 5) - 1;
                while((bill > 0) && (i >= 0)) {
                    if(change[i] > 0) {
                        while((bill >= ((i + 1) * 5)) && (change[i] > 0)) {
                            change[i]--;
                            bill -= ((i + 1) * 5);
                        }
                    }
                    i--;
                }
                if(bill > 0) { return false; }
            }
        }
        return true;
    }
}