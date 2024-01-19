public class p_0865 {
    private static TreeNode subtree;
    private static int deepest = -1;

    public static void main(String[] args) {
        TreeNode test = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))), new TreeNode(1, new TreeNode(0), new TreeNode(8)));
        printTreeNode(subtreeWithAllDeepest(test));
        test = new TreeNode(1);
        printTreeNode(subtreeWithAllDeepest(test));
        test = new TreeNode(0, new TreeNode(1, null, new TreeNode(2)), new TreeNode(3));
        printTreeNode(subtreeWithAllDeepest(test));
        test = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), null)), new TreeNode(1, new TreeNode(0), new TreeNode(8)));
        printTreeNode(subtreeWithAllDeepest(test));
        test = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), null)), new TreeNode(1, new TreeNode(0), new TreeNode(8, new TreeNode(10), new TreeNode(12))));
        printTreeNode(subtreeWithAllDeepest(test));
        test = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(2)), new TreeNode(1, new TreeNode(0, new TreeNode(9), null), new TreeNode(8, new TreeNode(10), new TreeNode(12))));
        printTreeNode(subtreeWithAllDeepest(test));
    }

    public static void printTreeNode(TreeNode n) {
        System.out.print(n.val);
        if(n.left != null) {
            System.out.print(", " + n.left.val + ", " + n.right.val);
        }
        System.out.println();
    }

    public static TreeNode subtreeWithAllDeepest(TreeNode root) {
        // Comment out next 2 lines for leetcode
        subtree = null;
        deepest = -1;

        getSubtree(root, 0);
        return subtree;
    }

    public static int getSubtree(TreeNode root, int depth) {
        if(root == null) { return (depth - 1); }
        if((root.left == null) && (root.right == null)) {
            if(depth > deepest) {
                subtree = root;
                deepest = depth;
            }
            return depth;
        }

        depth++;
        int left = getSubtree(root.left, depth);
        int right = getSubtree(root.right, depth);

        if((left == right) && (left == deepest)) {
            subtree = root;
        }

        return Math.max(left, right);
    }
}