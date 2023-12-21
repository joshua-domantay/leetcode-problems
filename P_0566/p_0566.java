public class p_0566 {
    public static void main(String[] args) {
        int[][] result = matrixReshape(new int[][]{{1,2},{3,4}}, 2, 4);
        System.out.print("[");
        for(int i = 0; i < result.length; i++) {
            System.out.print("[");
            for(int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
                if((j + 1) < result[i].length) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            if((i + 1) < result.length) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        // Check if possible and legal
        int size_old = mat.length * mat[0].length;
        int size_new = r * c;
        if(size_old != size_new) {
            return mat;
        }

        int[][] reshape = new int[r][c];
        int curr_r = 0;
        int curr_c = 0;
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                reshape[curr_r][curr_c] = mat[i][j];
                curr_c++;
                if(curr_c >= c) {
                    curr_r++;
                    curr_c = 0;
                }
            }
        }
        return reshape;
    }
}