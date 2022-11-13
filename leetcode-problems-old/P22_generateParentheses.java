import java.util.List;
import java.util.ArrayList;

public class P22_generateParentheses {
    public static void main(String[] args) {
        List<String> x = generateParenthesis(2);
        for(String y : x) {
            System.out.print(y + "  ");
        }
        System.out.println();

        x = generateParenthesis(3);
        for(String y : x) {
            System.out.print(y + "  ");
        }
        System.out.println();
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesis(n, 0, "", result);
        return result;
    }

    public static void generateParenthesis(int n, int open, String s, List<String> ls) {
        if(n == 0) {
            while(open != 0) {
                s += ")";
                open--;
            }
            ls.add(s);
        } else {
            generateParenthesis(n - 1, (open + 1), (s + "("), ls);
            if(open > 0) {
                generateParenthesis(n, (open - 1), (s + ")"), ls);
            }
        }
    }
}
