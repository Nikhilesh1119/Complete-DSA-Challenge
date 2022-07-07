class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> a= new ArrayList<Boolean>();
        int k=0;
        for(int i=0;i<candies.length;i++)
        {
            if(k<candies[i])
            {
                k=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=k)
            {
                a.add(true);
            }
            else
            {
                a.add(false);
            }
        }
        return a;
    }
}