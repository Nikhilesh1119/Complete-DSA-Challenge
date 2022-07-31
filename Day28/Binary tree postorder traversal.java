class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        post(ans, root);
        return ans; 
    }
    public static void post(List<Integer>ans,TreeNode root){
    if(root == null){
            return;
    }
        post(ans,root.left);
        post(ans,root.right);
        ans.add(root.val);
    }
}