import java.util.Stack;

public class p_0682 {
    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5","2","C","D","+"}));
        System.out.println(calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
        System.out.println(calPoints(new String[]{"1","C"}));
    }

    public static int calPoints(String[] operations) {
        int sum = 0;
        Stack<Integer> record = new Stack<>();
        for(int i = 0; i < operations.length; i++) {
            try {
                record.push(Integer.parseInt(operations[i]));
            } catch(Exception e) {
                switch(operations[i]) {
                    case "+":
                        record.push(record.peek() + record.get(record.size() - 2));
                        break;
                    case "D":
                        record.push(record.peek() * 2);
                        break;
                    default:    // "C"
                        record.pop();
                        break;
                }
            }
        }

        while(record.size() > 0) {
            sum += record.pop();
        }

        return sum;
    }
}