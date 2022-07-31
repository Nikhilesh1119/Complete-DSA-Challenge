class Solution {
    public int search(int[] nums, int target) {
        int l=0,h=nums.length-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return -1;
    }
}