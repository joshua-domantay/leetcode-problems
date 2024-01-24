public class p_1351 {
    public static void main(String[] args) {
        System.out.println(countNegatives(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
        System.out.println(countNegatives(new int[][]{{3,2},{1,0}}));
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        boolean hasNegative;
        for(int i = grid.length - 1; i >= 0; i--) {
            hasNegative = false;
            for(int j = grid[i].length - 1; j >= 0; j--) {
                if(grid[i][j] < 0) {
                    count++;
                    hasNegative = true;
                } else {
                    break;
                }
            }
            if(!hasNegative) { break; }
        }
        return count;



        /* 1ms for row wise */
        // int count = 0, j;
        // for(int i = 0; i < grid.length; i++) {
        //     j = grid[i].length - 1;
        //     while((j >= 0) && (grid[i][j] < 0)) {
        //         count++;
        //         j--;
        //     }
        // }
        // return count;
    }
}
