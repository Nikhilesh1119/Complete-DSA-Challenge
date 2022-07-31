class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>ans = new ArrayList<>();
        pre(ans, root);
        return ans;
        
        
    }
    public static void pre(List<Integer>ans,TreeNode root){
    if(root == null){
            return;
    }
        ans.add(root.val);
        pre(ans,root.left);
        pre(ans,root.right);
    }
}