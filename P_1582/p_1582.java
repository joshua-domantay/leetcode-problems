public class p_1582 {
    public static void main(String[] args) {
        System.out.println(numSpecial(new int[][]{{1,0,0},{0,0,1},{1,0,0}}));
        System.out.println(numSpecial(new int[][]{{1,0,0},{0,1,0},{0,0,1}}));
        System.out.println(numSpecial(new int[][]{{1,0,0},{0,1,0},{0,0,1},{1,0,0}}));
        System.out.println(numSpecial(new int[][]{{1,0,0,1},{0,1,0,0},{0,0,1,0}}));
        System.out.println(numSpecial(new int[][]{{1,0,0,1},{0,1,0,0},{0,0,1,1}}));
    }

    public static int numSpecial(int[][] mat) {
        int lastNonZero;
        boolean hasNonZero;
        for(int i = 0; i < mat.length; i++) {
            lastNonZero = -1;
            hasNonZero = false;
            for(int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] != 0) {
                    if(hasNonZero) {
                        mat[i][lastNonZero] = 2;
                        mat[i][j] = 2;
                    } else {
                        lastNonZero = j;
                        hasNonZero = true;
                    }
                }

                if(i > 0) {
                    mat[i][j] += mat[i - 1][j];
                }
            }
        }

        int sum = 0;
        for(int i = 0; i < mat[0].length; i++) {
            if(mat[mat.length - 1][i] == 1) {
                sum++;
            }
        }

        return sum;
    }
}
