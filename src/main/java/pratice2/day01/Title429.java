package pratice2.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.cn/problems/n-ary-tree-level-order-traversal/
 * 429. N 叉树的层序遍历
 * @author Joe
 *
 */
public class Title429 {

	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		_levelOrder(Arrays.asList(root), result);
		return result;
	}

	private void _levelOrder(List<Node> nodes, List<List<Integer>> result) {
		if (nodes.isEmpty()) {
			return;
		}
		List<Integer> vals = new ArrayList<>(nodes.size());
		List<Node> allChildren = new ArrayList<>();
		for (Node node : nodes) {
			vals.add(node.val);
			if (node.children != null) {
				allChildren.addAll(node.children);
			}
		}
		result.add(vals);
		_levelOrder(allChildren, result);
	}

	//Definition for a Node.
	class Node {
		public int val;
		public List<Node> children;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	}
}
