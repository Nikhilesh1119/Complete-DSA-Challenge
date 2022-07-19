class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0,h=nums.length-2;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==nums[mid^1])
                l=mid+1;
            else
                h=mid-1;
        }
        return nums[l];
    }
}