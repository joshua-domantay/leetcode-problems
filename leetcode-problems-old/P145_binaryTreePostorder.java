import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class P145_binaryTreePostorder {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(2, null, new TreeNode(1));
        TreeNode right = new TreeNode(4);
        left = new TreeNode(7, left, right);
        right = new TreeNode(12, new TreeNode(5), new TreeNode(6));
        TreeNode head = new TreeNode(10, left, right);
        /*
         *         10
         *       /    \
         *      7      12
         *     / \    /  \
         *    2   4  5    6
         *     \
         *      1
         * 
         *  1 2 4 7 5 6 12 10
         */

        List<Integer> result = postorderTraversal(head);
        for(int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
        System.out.println();
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderTraversal(root, result);
        return result;
    }

    public static void postorderTraversal(TreeNode root, List<Integer> ls) {
        if(root != null) {
            postorderTraversal(root.left, ls);
            postorderTraversal(root.right, ls);
            ls.add(root.val);
        }
    }
}
