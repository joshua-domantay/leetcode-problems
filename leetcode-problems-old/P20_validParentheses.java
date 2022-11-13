import java.util.Stack;

public class P20_validParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("({[[("));
        System.out.println(isValid("(({}))"));
        System.out.println(isValid("[[(}]]"));
        System.out.println(isValid("{{{[]}()}}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    stk.push(s.charAt(i));
                    break;
                default:
                    if(stk.size() <= 0) {
                        return false;
                    }
                    char x = stk.pop();
                    switch(s.charAt(i)) {
                        case ')':
                            if(x != '(') {
                                return false;
                            }
                            break;
                        case '}':
                            if(x != '{') {
                                return false;
                            }
                            break;
                        default:
                            if(x != '[') {
                                return false;
                            }
                            break;
                    }
                    break;
            }
        }
        return (stk.size() == 0);
    }
}
