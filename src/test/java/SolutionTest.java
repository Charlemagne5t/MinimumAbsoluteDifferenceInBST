import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void getMinimumDifferenceTest1() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int output = 1;
        Assert.assertEquals(output, new Solution().getMinimumDifference(root));
    }

}
