class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n1=-1,n2=-1,c1=0,c2=0,k=nums.length;
        for(int i=0;i<k;i++)
            {
            if(nums[i]==n1)
            {
             c1++;
            }
            else if(nums[i]==n2)
                {
                c2++;
                }
            else if(c1==0)
                {
                n1=nums[i];
                c1=1;
                }
            else if(c2==0)
                {
                n2=nums[i];
                c2=1;
                }
            else
                {
                c1--;
                c2--;
                }
            }
        List <Integer> ans = new ArrayList<Integer>();
        c1=0;c2=0;
        for(int i=0;i<k;i++)
            {
            if(nums[i]==n1)
                {
                c1++;
                }
            else if(nums[i]==n2)
                {
                c2++;
                }
            }
            if(c1>k/3)
                {
                ans.add(n1);
                }
            if(c2>k/3)
            {
            ans.add(n2);
            }
        return ans;
    }
}