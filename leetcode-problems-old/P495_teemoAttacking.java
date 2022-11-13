public class P495_teemoAttacking {
    public static void main(String[] args) {
        System.out.println(findPoisonedDuration(new int[]{1, 4}, 2));
        System.out.println(findPoisonedDuration(new int[]{1, 2}, 2));
        System.out.println(findPoisonedDuration(new int[]{1, 2, 3, 4, 5}, 2));
        System.out.println(findPoisonedDuration(new int[]{1, 2, 4}, 2));
        System.out.println(findPoisonedDuration(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 1));
        System.out.println(findPoisonedDuration(new int[]{1, 2, 4, 9}, 3));
        System.out.println(findPoisonedDuration(new int[]{1, 2, 4, 5, 9}, 3));
        System.out.println(findPoisonedDuration(new int[]{1,2,6,7,8,9,15}, 4));
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0, toAdd = 0;
        for(int i = 0; i < timeSeries.length; i++) {
            total += toAdd;
            if(timeSeries[i] <= toAdd) {
                toAdd = timeSeries[i] + duration - toAdd;
            } else {
                toAdd = duration;
            }
        }
        return total + toAdd;
    }
}
