public class p_2643 {
    public static void main(String[] args) {
        printArray(rowAndMaximumOnes(new int[][]{{0,1},{1,0}}));
        printArray(rowAndMaximumOnes(new int[][]{{0,0,0},{0,1,1}}));
        printArray(rowAndMaximumOnes(new int[][]{{0,0},{1,1},{0,0}}));
    }

    public static void printArray(int[] arr) {
        System.out.println("[" + arr[0] + ", " + arr[1] + "]");
    }

    public static int[] rowAndMaximumOnes(int[][] mat) {
        int[] result = new int[2];
        for(int i = 0; i < mat.length; i++) {
            for(int j = 1; j < mat[i].length; j++) {
                mat[i][0] += mat[i][j];
            }

            if(mat[i][0] > result[1]) {
                result[0] = i;
                result[1] = mat[i][0];
            }

            if(mat[i][0] == mat[i].length) { return result; }
        }
        return result;
    }
}