package Litcode;

public class ConvertSortedArrayToBinarySearchTree108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode rootNode = buildSubBST(nums, 0, nums.length - 1);
        return rootNode;
    }

    private TreeNode buildSubBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode midNode = new TreeNode(nums[mid]);
        midNode.left = buildSubBST(nums, start, mid - 1);
        midNode.right = buildSubBST(nums, mid + 1, end);
        return midNode;
    }
}
