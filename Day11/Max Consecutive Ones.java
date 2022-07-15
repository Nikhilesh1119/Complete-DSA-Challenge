class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==0)
            return 0;
            int ans=0;
            int temp=0;
            for(int i=0;i<nums.length;i++)
            {
              if(nums[i]==1) {
                temp++;
                if(temp>=ans)
                 ans=temp;  
                 }                      
             else              
            temp=0;            
            }
            return ans;
    }
}