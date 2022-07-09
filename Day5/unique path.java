class Solution {
    public int uniquePaths(int m, int n) {
        int k=m+n-2;
        int l=n-1;
        long r=1;
        for(int i=1;i<=l;i++)
            {
            r=r*(k-l+i)/i;
            }
        return (int)r;
    }
}