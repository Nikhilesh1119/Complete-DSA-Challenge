class Solution {
    public int maximumWealth(int[][] accounts) {
        int a=0;
        for(int i=0;i<accounts.length;i++)
        {
            int b=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                b+=accounts[i][j];
            }
            if(a<b)
            {
                a=b;
            }
        }
        return a;
    }
}