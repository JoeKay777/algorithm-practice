package pratice2.day02;


import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * 105. 从前序与中序遍历序列构造二叉树
 */
public class Title105 {


    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return builder(preorder, 0, preorder.length, inorderMap, 0);
    }


    private TreeNode builder(int[] preorder, int preStart, int size, Map<Integer, Integer> inorderMap, int inStart) {
        if (size == 0) {
            return null;
        }
        TreeNode treeNode = new TreeNode(preorder[preStart]);
        Integer rootIndex = inorderMap.get(preorder[preStart]);
        int leftSize = rootIndex - inStart;
        treeNode.left = builder(preorder, preStart + 1, leftSize, inorderMap, inStart);
        treeNode.right = builder(preorder, preStart + leftSize + 1, size - leftSize -1, inorderMap, rootIndex + 1);
        return treeNode;
    }


}
