class Solution {
    public int majorityElement(int[] nums) {
        int c=0,k=0;
        for(int i=0;i<nums.length;i++)
            {
            if(c==0)
                {
               k= nums[i];
                }
            if(k==nums[i])
                {
                c++;
                }
            else
                {
                c--;
                }
    }
        return k;
}
    }