class Solution {
    public List<Integer> ans= new ArrayList<Integer>();
     public List<Integer> preorder(Node root) {
         if(root==null){
             return ans;
         }
         ans.add(root.val);
         for(Node i:root.children){
             preorder(i);
         }
         return ans;
     }
 }