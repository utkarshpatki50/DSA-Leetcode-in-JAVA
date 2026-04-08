/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();

        que.offer(root);
        while (!que.isEmpty()) {
            double sum = 0;
            int size = que.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = que.poll();
                sum += node.val;

                if (node.left != null) que.offer(node.left);

                if (node.right != null) que.offer(node.right);
            }
            ans.add(sum / size);
        }
        return ans;
    }
}
