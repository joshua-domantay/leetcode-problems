import java.util.List;
import java.util.ArrayList;

public class P118_pascalTriangle {
    public static void main(String[] args) {
        printTriangle(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {       // todo -> Binomial Theorem?
        List<List<Integer>> result = new ArrayList<>();
        if(numRows <= 0) {
            return result;
        }
        int index = 0;
        while(numRows > 0) {
            result.add(new ArrayList<>());
            List<Integer> curr = result.get(index);
            for(int i = 0; i < (index + 1); i++) {
                curr.add(1);
            }
            for(int i = 1; i < curr.size() - 1; i++) {
                curr.set(i, result.get(index - 1).get(i - 1) + result.get(index - 1).get(i));
            }
            numRows--;
            index++;
        }
        return result;
    }

    private static void printTriangle(List<List<Integer>> triangle) {
        for(int i = 0; i < triangle.size(); i++) {
            System.out.print("[ ");
            for(int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println("]");
        }
    }
}
