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

public class P104_maxDepthOfBinTree {
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
         *  2 1 7 4 10 5 12 6
         */

        inorder(head);
        System.out.println();
        System.out.println(maxDepth(head));
    }

    public static int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void inorder(TreeNode node) {
        if(node != null) {
            inorder(node.left);
            System.out.print(node.val + " ");
            inorder(node.right);
        }
    }
}
