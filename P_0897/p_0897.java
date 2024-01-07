import java.util.ArrayList;

public class p_0897 {
    public static void main(String[] args) {
        TreeNode test = new TreeNode(5, new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4)), new TreeNode(6, null, new TreeNode(8, new TreeNode(7), new TreeNode(9))));
        printResult(increasingBST(test));
        test = new TreeNode(5, new TreeNode(1), new TreeNode(7));
        printResult(increasingBST(test));
    }

    public static void printResult(TreeNode n) {
        while(n != null) {
            System.out.print(n.val);
            System.out.print((n.right == null) ? "" : ", ");
            n = n.right;
        }
        System.out.println();
    }

    public static void inorder(TreeNode n, ArrayList<TreeNode> values) {
        if(n == null) { return; }

        inorder(n.left, values);
        values.add(n);
        inorder(n.right, values);

        n.left = null;
        n.right = null;
    }

    public static TreeNode increasingBST(TreeNode root) {
        ArrayList<TreeNode> values = new ArrayList<>();
        inorder(root, values);

        TreeNode result = values.remove(0);
        TreeNode temp = result;
        while(values.size() > 0) {
            temp.right = values.remove(0);
            temp = temp.right;
        }

        return result;
    }
}
