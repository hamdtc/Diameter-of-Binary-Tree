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
    
    int ans=0; //it will globlay update
    
    public int diameterOfBinaryTree(TreeNode root) {
        //we have to find the hight of the tree
        diameter(root);
        
        return ans;
    }
    
    public int diameter(TreeNode root){
        
        //suppose there is no element hieht=0
        if (root==null) return 0;
        
        //calculation of right and left and total distance will be l+r
        //hight of the tree will be maximum of l and r 
        int left= diameter(root.left);
        int right= diameter(root.right);
        
            ans=Math.max(left+right,ans);
        
        // return the hieght which is 1+max of left and right
        return 1+Math.max(left,right);
        
    }
}