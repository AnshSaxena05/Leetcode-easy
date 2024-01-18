import java.util.LinkedList;

public class LeetCode_104 {
    public class TreeNode
    {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
    }
    public int maxDepth(TreeNode root) {
        if(root ==null)
         return 0;
        var queue =new LinkedList<TreeNode>();
        queue.add(root);
        int length=0;
        while(!queue.isEmpty())
        {
            length++;
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=queue.poll();
                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null)
                    queue.add(curr.right);
            }
        }
        return length;
    }
    public static void main(String[] args) {
        LeetCode_104 solution = new LeetCode_104();

        // Create a sample binary tree
        LeetCode_104.TreeNode root = solution.new TreeNode(3);
        root.left = solution.new TreeNode(9);
        root.right = solution.new TreeNode(20);
        root.right.left = solution.new TreeNode(15);
        root.right.right = solution.new TreeNode(7);

        int depth = solution.maxDepth(root);

        System.out.println("Maximum Depth of the Binary Tree: " + depth);
    }
}
