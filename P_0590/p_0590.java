import java.util.List;
import java.util.ArrayList;

public class p_0590 {
    public static void main(String[] args) {
        int[] values = new int[]{1,-1,2,3,4,5,-1,-1,6,7,-1,8,-1,9,10,-1,-1,11,-1,12,-1,13,-1,-1,14};
        Node root = new Node(values[0], new ArrayList<>());
        insertValues(root, values);

        List<Integer> result = postorder(root);
        for(int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " > ");
        }
        System.out.println();
    }

    public static void insertValues(Node root, int[] values) {
        List<Node> nodes = new ArrayList<Node>();
        nodes.add(root);
        for(int i = 2; i < values.length; i++) {
            if(values[i] != -1) {
                Node newNode = new Node(values[i], new ArrayList<>());
                nodes.get(0).children.add(newNode);
                nodes.add(newNode);
            } else {
                nodes.remove(0);
            }
        }
    }

    public static List<Integer> postorder(Node root) {
        if(root == null) { return new ArrayList<Integer>(); }
        return postorder(root, new ArrayList<Integer>());
    }

    public static List<Integer> postorder(Node root, List<Integer> result) {
        if(root.children != null) {
            for(int i = 0; i < root.children.size(); i++) {
                postorder(root.children.get(i), result);
            }
        }
        result.add(root.val);
        return result;
    }
}
