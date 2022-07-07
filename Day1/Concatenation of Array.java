class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[]=new int [2*nums.length];
        int k=0;
        for(int i=0;i<2*nums.length;i++)
            {
            k=i%nums.length;
            ans[i]=nums[k];

        }
        return ans;
    }
}