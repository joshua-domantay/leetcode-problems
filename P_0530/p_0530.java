import java.util.ArrayList;

public class p_0530 {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode p = new TreeNode(4, a, new TreeNode(6));
        System.out.println(getMinimumDifference(p));

        a = new TreeNode(48, new TreeNode(12), new TreeNode(49));
        p = new TreeNode(1, new TreeNode(0), a);
        System.out.println(getMinimumDifference(p));

        a = new TreeNode(48, new TreeNode(16), new TreeNode(69));
        p = new TreeNode(10, new TreeNode(2), a);
        System.out.println(getMinimumDifference(p));
    }

    public static int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> inorderVal = new ArrayList<>();
        inorder(root, inorderVal);

        int result = Integer.MAX_VALUE;
        for(int i = 1; i < inorderVal.size(); i++) {
            result = Math.min(result, (inorderVal.get(i) - inorderVal.get(i - 1)));
            if(result == 1) { break; }
        }
        return result;
    }

    public static void inorder(TreeNode root, ArrayList<Integer> values) {
        if(root == null) { return; }

        inorder(root.left, values);
        values.add(root.val);
        inorder(root.right, values);
    }
}
