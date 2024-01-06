import java.util.ArrayList;

public class p_0997 {
    public static void main(String[] args) {
        System.out.println(findJudge(2, new int[][]{{1,2}}));
        System.out.println(findJudge(3, new int[][]{{1,3}, {2,3}}));
        System.out.println(findJudge(3, new int[][]{{1,3}, {2,3}, {3,1}}));
        System.out.println(findJudge(3, new int[][]{{1,3}, {1,2}, {2,3}}));
    }

    public static int findJudge(int n, int[][] trust) {
        int[] numTrusts = new int[n];
        ArrayList<Integer> noTrust = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            noTrust.add(i);
        }

        for(int[] pair : trust) {
            numTrusts[pair[1] - 1]++;
            noTrust.remove((Integer) (pair[0] - 1));
            if(noTrust.size() <= 0) {
                return -1;
            }
        }

        if(noTrust.size() > 1) {
            return -1;
        }

        return (numTrusts[noTrust.get(0)] == (n - 1)) ? (noTrust.get(0) + 1) : -1;
    }
}