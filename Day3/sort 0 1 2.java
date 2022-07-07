class Solution {
    public void sortColors(int[] nums) {
        int l=0,m=0,h=nums.length-1,t;
        while(m<=h)
        {
            switch(nums[m])
            {
                case 0:{
                    t=nums[l];
                    nums[l]=nums[m];
                    nums[m]=t;
                    l++;m++;
                    break;
                }
                case 1:{
                m++;
                    break;
                }
                case 2:{
                    t=nums[m];
                    nums[m]=nums[h];
                    nums[h]=t;
                    h--;
                    break;
                }
            }
        }
    }
}