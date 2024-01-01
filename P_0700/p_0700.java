public class p_0700 {
    public static void main(String[] args) {
        TreeNode test = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        TreeNode result = searchBST(test, 2);
        System.out.println((result == null) ? "_" : result.val);
        result = searchBST(test, 5);
        System.out.println((result == null) ? "_" : result.val);
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if((root == null) || (root.val == val)) {
            return root;
        }

        return searchBST(((root.val > val) ? root.left : root.right), val);
    }
}