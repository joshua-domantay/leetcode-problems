public class p_0605 {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1,0,0}, 2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; (i < flowerbed.length) && (n > 0); i++) {
            if(flowerbed[i] == 0) {
                if((i - 1) >= 0) {
                    if(flowerbed[i - 1] == 1) {
                        continue;
                    }
                }
                if((i + 1) < flowerbed.length) {
                    if(flowerbed[i + 1] == 1) {
                        continue;
                    }
                }

                flowerbed[i] = 1;
                n--;
            }
        }
        return (n == 0);
    }
}
