import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class p_0872 {
    public static void main(String[] args) {
        TreeNode test1 = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))), new TreeNode(1, new TreeNode(9), new TreeNode(8)));
        TreeNode test2 = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(7)), new TreeNode(1, new TreeNode(4), new TreeNode(2, new TreeNode(9), new TreeNode(8))));
        System.out.println(leafSimilar(test1, test2));

        test1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        test2 = new TreeNode(1, new TreeNode(3), new TreeNode(2));
        System.out.println(leafSimilar(test1, test2));

        test1 = new TreeNode(1, new TreeNode(2), new TreeNode(200));
        test2 = new TreeNode(1, new TreeNode(2), new TreeNode(200));
        System.out.println(leafSimilar(test1, test2));
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> val1 = new ArrayList<>();
        ArrayList<Integer> val2 = new ArrayList<>();
        inorder(root1, val1);
        inorder(root2, val2);

        if(val1.size() != val2.size()) { return false; }

        for(int i = 0; i < val1.size(); i++) {
            if(!val1.get(i).equals(val2.get(i))) { return false; }
        }

        return true;
    }

    public static void inorder(TreeNode node, ArrayList<Integer> arr) {
        if(node == null) { return; }
        if((node.left == null) && (node.right == null)) {
            arr.add(node.val);
            return;
        }

        inorder(node.left, arr);
        inorder(node.right, arr);
    }

    // public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
    //     Queue<Integer> queue = new LinkedList<>();
    //     inorder(root1, queue, false);
    //     return inorder(root2, queue, true);
    // }

    // public static boolean inorder(TreeNode node, Queue<Integer> queue, boolean compare) {
    //     if(node == null) { return true; }
    //     if(compare && (queue.size() == 0)) { return false; }

    //     if((node.left == null) && (node.right == null)) {
    //         if(compare) {
    //             if(node.val != queue.poll()) { return false; }
    //         } else {
    //             queue.add(node.val);
    //         }
    //         return true;
    //     }

    //     if(!inorder(node.left, queue, compare) || !inorder(node.right, queue, compare)) { return false; }

    //     return true;
    // }
}
