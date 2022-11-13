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

public class P129_sumRootToLeafNum {
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
        System.out.println(sumNumbers(head));
    }

    public static int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }

    public static int sumNumbers(TreeNode root, int val) {
        if(root == null) { return val; }
        int newVal = addNum(val, root.val);
        if(root.left == null) {
            return sumNumbers(root.right, newVal); 
        }
        if(root.right == null) {
            return sumNumbers(root.left, newVal); 
        }
        return sumNumbers(root.left, newVal) + sumNumbers(root.right, newVal); 
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
