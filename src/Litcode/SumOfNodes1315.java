package Litcode;

public class SumOfNodes1315 {
    public int sumEvenGrandparent(TreeNode root) {
        return calculate(root, -101, -101);
    }

    private int calculate(TreeNode currentNode, int parentValue, int grandParentValue) {
        int subResult = 0;

        if (grandParentValue % 2 == 0) {
            subResult += currentNode.val;
        }
        if (currentNode.left != null) {
            subResult += calculate(currentNode.left, currentNode.val, parentValue);
        }
        if (currentNode.right != null) {
            subResult += calculate(currentNode.right, currentNode.val, parentValue);
        }

        return subResult;
    }
}
