class Solution {
    public int findMiddleIndex(int[] nums) {
        int t=0,l=0;
        for(int i:nums)
        {
            t+=i;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i>0) l+=nums[i-1];
            if(t-l-nums[i]==l) return i;
        }
        return -1;
    }
}