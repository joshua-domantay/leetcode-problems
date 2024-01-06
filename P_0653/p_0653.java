import java.util.ArrayList;

public class p_0653 {
    public static void main(String[] args) {
        TreeNode test = new TreeNode(5, new TreeNode(3, new TreeNode(2), new TreeNode(4)), new TreeNode(6, null, new TreeNode(7)));
        System.out.println(findTarget(test, 9));
        System.out.println(findTarget(test, 28));
    }

    public static boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> values = new ArrayList<>();
        ArrayList<TreeNode> breadth = new ArrayList<>();
        breadth.add(root);
        TreeNode curr;
        do {
            curr = breadth.remove(0);   // pop
            if(curr != null) {
                if(values.contains(k - curr.val)) {
                    return true;
                }
                values.add(curr.val);
                breadth.add(curr.left);
                breadth.add(curr.right);
            }
        } while(breadth.size() > 0);
        return false;
    }
}