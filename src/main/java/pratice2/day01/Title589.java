package pratice2.day01;


import java.util.ArrayList;
import java.util.List;

;

public class Title589 {

	public List<Integer> preorder(Node root) {
		List<Integer> result = new ArrayList<>();
		_preorder(result, root);
		return result;
	}

	private void _preorder(List<Integer> result , Node node) {
		if (node == null) {
			return;
		}
		result.add(node.val);
		if (node.children != null) {
			for (Node child : node.children) {
				_preorder(result, child);
			}
		}
	}

	// Definition for a Node.
	class Node {
		public int val;
		public List<Node> children;

		public Node() {}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	};
}
