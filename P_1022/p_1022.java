public class p_1022 {
    public static void main(String[] args) {
        TreeNode test = new TreeNode(1, new TreeNode(0, new TreeNode(0), new TreeNode(1)), new TreeNode(1, new TreeNode(0), new TreeNode(1)));
        System.out.println(sumRootToLeaf(test));
        test = new TreeNode(0);
        System.out.println(sumRootToLeaf(test));
        test = new TreeNode(1, new TreeNode(0, null, new TreeNode(1)), new TreeNode(1, new TreeNode(0), new TreeNode(1)));
        System.out.println(sumRootToLeaf(test));
    }

    public static int sumRootToLeaf(TreeNode root) {
        if((root.left == null) && (root.right == null)) {
            return root.val;
        }

        int sum = 0;
        root.val = root.val << 1;
        if(root.left != null) {
            root.left.val = (root.val | root.left.val);
            sum += sumRootToLeaf(root.left);
        }
        if(root.right != null) {
            root.right.val = (root.val | root.right.val);
            sum += sumRootToLeaf(root.right);
        }
        return sum;
    }
}