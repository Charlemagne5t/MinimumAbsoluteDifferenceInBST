import com.sun.source.tree.Tree;

import java.util.Stack;

public class Solution {
    public int getMinimumDifference(TreeNode root) {
        if (root == null) return 0;
        int minDiff = Integer.MAX_VALUE;
        boolean flagFirst = true;
        int temp = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            if (flagFirst) {
                temp = current.val;
                flagFirst = false;
            } else {
                minDiff = Math.min(minDiff, current.val - temp);
                temp = current.val;
            }
            current = current.right;
        }
        return minDiff;
    }
}
