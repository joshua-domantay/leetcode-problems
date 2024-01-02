import java.util.ArrayList;

public class p_0617 {
    public static void main(String[] args) {
        TreeNode test1 = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        TreeNode test2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)));
        breadthFirst(mergeTrees(test1, test2));

        test1 = new TreeNode(1);
        test2 = new TreeNode(1, new TreeNode(2), null);
        breadthFirst(mergeTrees(test1, test2));
    }

    public static void breadthFirst(TreeNode tree) {
        ArrayList<TreeNode> arr = new ArrayList<>();
        arr.add(tree);
        TreeNode curr;
        while(arr.size() > 0) {
            curr = arr.get(0);
            if(curr != null) {
                System.out.print(curr.val + " - ");
                arr.add(curr.left);
                arr.add(curr.right);
            } else {
                System.out.print("null - ");
            }
            arr.remove(0);
        }
        System.out.println();
    }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if((root1 == null) && (root2 == null)) {
            return null;
        } else if(root1 == null) {
            return root2;
        } else if(root2 == null) {
            return root1;
        }

        TreeNode merge = new TreeNode(root1.val + root2.val);
        merge.left = mergeTrees(root1.left, root2.left);
        merge.right = mergeTrees(root1.right, root2.right);

        return merge;
    }
}