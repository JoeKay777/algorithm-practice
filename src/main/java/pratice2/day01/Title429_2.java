package pratice2.day01;

import java.util.*;

/**
 * https://leetcode.cn/problems/n-ary-tree-level-order-traversal/
 * 429. N 叉树的层序遍历
 *
 * @author Joe
 */
public class Title429_2 {

    // 非递归解法
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int num = queue.size();
            List<Integer> vals = new ArrayList<>(num);
            while (num-- > 0) {
                Node node = queue.poll();
                vals.add(node.val);
                if (node.children != null) {
                    queue.addAll(node.children);
                }
            }
            result.add(vals);
        }
        return result;

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
