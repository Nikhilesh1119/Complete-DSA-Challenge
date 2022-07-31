class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>ans = new ArrayList<>();
        in(ans, root);
        return ans;   
    }
    public static void in(List<Integer>ans,TreeNode root){
    if(root == null){
            return;
    }
        in(ans,root.left);
        ans.add(root.val);
        in(ans,root.right);
    }
}