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

public class P404_sumLeftLeaves {
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
        System.out.println(sumOfLeftLeaves(head));
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root.left, root) + sumOfLeftLeaves(root.right, root);
    }

    public static int sumOfLeftLeaves(TreeNode node, TreeNode parent) {
        if(node == null) { return 0; }
        if((node.left == null) && (node.right == null)) {
            if(parent.left == node) {
                return node.val;
            }
        }
        return sumOfLeftLeaves(node.left, node) + sumOfLeftLeaves(node.right, node);
    }

    public static int addNum(int a, int b) {
        int c = b, n = 1;
        do {
            c /= 10;
            n *= 10;
        } while(c != 0);
        return (a * n) + b;
    }

    public static void inorder(TreeNode node) {
        if(node != null) {
            inorder(node.left);
            System.out.print(node.val + " ");
            inorder(node.right);
        }
    }
}
