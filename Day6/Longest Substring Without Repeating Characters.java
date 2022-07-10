class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mpp = new HashMap<Character, Integer>();
        int l=0,r=0;
        int n = s.length();
        int ans= 0;
        while(r< n) 
{
                if(mpp.containsKey(s.charAt(r)))
    {
         l= Math.max(mpp.get(s.charAt(r))+1,l);
    }
                mpp.put(s.charAt(r),r);

                ans= Math.max(ans,r-l+1);
                r++;
}
        return ans;
    }
}