package pratice2.day02;

import java.util.*;

/**
 * 297. 二叉树的序列化与反序列化
 * https://leetcode.cn/problems/serialize-and-deserialize-binary-tree/
 *
 * @author qkh
 */
public class Title297 {


    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }



    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "NULL";
        }
        String str = root.val + "," + serialize(root.left);
        str = str + "," + serialize(root.right);
        return str;

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split = data.split(",");
        return _deserialize(new LinkedList<>(Arrays.asList(split)));
    }

    private TreeNode _deserialize(List<String> dataList) {
        String val = dataList.remove(0);
        if (val.equals("NULL")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = _deserialize(dataList);
        node.right = _deserialize(dataList);
        return node;
    }

}
