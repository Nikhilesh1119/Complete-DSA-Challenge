class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set k = new HashSet<>();
        for(int i :nums)
            {
            if(!k.add(i))
                return true;
            }
        return false;
    }
}