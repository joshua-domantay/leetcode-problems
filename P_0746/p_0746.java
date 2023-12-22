public class p_0746 {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{10,15,20}));
        System.out.println(minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
        System.out.println(minCostClimbingStairs(new int[]{10,15,1}));
        System.out.println(minCostClimbingStairs(new int[]{10,15}));
        System.out.println(minCostClimbingStairs(new int[]{0,2,2,1}));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int[] total_cost = cost.clone();
        for(int i = 2; i < cost.length; i++) {
            total_cost[i] = Integer.MAX_VALUE;
        }

        for(int i = 0; i < cost.length; i++) {
            if((i + 2) < cost.length) {
                if((total_cost[i] + cost[i + 1]) < total_cost[i + 1]) {
                    total_cost[i + 1] = (total_cost[i] + cost[i + 1]);
                }
                if((total_cost[i] + cost[i + 2]) < total_cost[i + 2]) {
                    total_cost[i + 2] = (total_cost[i] + cost[i + 2]);
                }
            }
        }
        return Integer.min(total_cost[cost.length - 1], total_cost[cost.length - 2]);
    }
}
