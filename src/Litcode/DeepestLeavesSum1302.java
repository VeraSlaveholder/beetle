package Litcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeepestLeavesSum1302 {
    public int deepestLeavesSum(TreeNode root) {
//        int maxDepthSum=0;
//        int maxDepth=0;
//        int currentDepth=0;
//        Deque<Pair<TreeNode,Integer>> stack=new ArrayDeque<>();
//        stack.push(new Pair(root,0));
//        while (!stack.isEmpty()){
//            Pair<TreeNode,Integer> p=stack.pop();
//            root=p.getKey();
//            currentDepth=p.getValue();
//            if (root.right!=null||root.left!=null){
//                if (root.right!=null){
//                    stack.push(new Pair(root.right,currentDepth++));
//                }else if (root.left!=null){
//                    stack.push(new Pair(root.left,currentDepth++));
//                }
//            }else {
//                if (maxDepth<currentDepth){
//                    maxDepthSum=root.val;
//                    maxDepth=currentDepth;
//                }else if (maxDepth==currentDepth){
//                    maxDepthSum+=root.val;
//                }
//            }
//        }return maxDepthSum;
        return 0;
    }
}
