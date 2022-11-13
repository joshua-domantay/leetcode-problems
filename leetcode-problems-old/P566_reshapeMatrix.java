public class P566_reshapeMatrix {
    public static void main(String[] args) {
        print2D(matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 1));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] reshaped = new int[r][c];
        int x = 0, y = 0;
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                if(x == r) {
                    return mat;
                }
                reshaped[x][y] = mat[i][j];
                y++;
                if(y >= c) {
                    x++;
                    y = 0;
                }
            }
        }
        return ((r == x) && (y == 0)) ? reshaped : mat;
    }

    private static void print2D(int[][] matrix) {
        System.out.print("[ ");
        for(int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("] ");
        }
        System.out.println("]");
    }
}