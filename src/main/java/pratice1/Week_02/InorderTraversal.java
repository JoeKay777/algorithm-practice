package pratice1.Week_02;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/binary-tree-inorder-traversal/
 * 94. 二叉树的中序遍历
 * @author Joe
 *
 */
public class InorderTraversal {

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		sort(result, root);
		return result;
	}

	private void sort(List<Integer> result , TreeNode  node) {
		if (node == null) {
			return;
		}
		sort(result, node.left);
		result.add(node.val);
		sort(result, node.right);
	}




}

// Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
