package pratice2.day01;


import java.util.*;

public class Title589_2 {

	// 非递归解法
	public List<Integer> preorder(Node root) {
		List<Integer> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		Deque<Node> stack = new ArrayDeque<>();
		stack.add(root);
		while (!stack.isEmpty()) {
			Node cur = stack.pollLast();
			result.add(cur.val);
			if (cur.children != null) {
				for (int i = cur.children.size() -1; i >= 0 ; i--) {
					stack.add(cur.children.get(i));
				}
			}
		}
		return result;
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
