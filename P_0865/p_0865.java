import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class p_0865 {
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
        HashMap<Integer, ArrayList<TreeNode>> depthToValue = new HashMap<>();
        HashMap<Integer, TreeNode> valueParent = new HashMap<>();
        depthToValue.put(0, new ArrayList<>());
        Queue<TreeNode> stack = new LinkedList<>();
        stack.add(root);
        stack.add(null);

        TreeNode curr;
        int depth = 0;
        do {
            curr = stack.poll();

            if(curr == null) {
                if(stack.size() != 0) {
                    stack.add(null);
                    depth++;

                    depthToValue.put(depth, new ArrayList<>());
                }

                continue;
            }

            if(curr.left != null) {
                valueParent.put(curr.left.val, curr);
                stack.add(curr.left);
            }
            if(curr.right != null) {
                valueParent.put(curr.right.val, curr);
                stack.add(curr.right);
            }

            depthToValue.get(depth).add(curr);
        } while(stack.size() > 0);

        if(depthToValue.get(depth).size() > 1) {
            for(TreeNode i : depthToValue.get(depth)) {
                stack.add(i);
            }

            while(stack.size() > 1) {
                curr = stack.poll();
                if(!stack.contains(valueParent.get(curr.val))) {
                    stack.add(valueParent.get(curr.val));
                }
            }

            return stack.poll();
        }    

        return depthToValue.get(depth).get(0);
    }
}