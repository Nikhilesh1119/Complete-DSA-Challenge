class Solution
{
    public int reversePairs(int[] nums)
    {
        return ms(nums,0,nums.length-1);
    }

    private int ms(int[] a, int s, int e)
    {
        if(s>=e)
        {
            return 0;
        }
        int m = s + (e-s)/2;
        int c= ms(a,s,m) + ms(a,m+1,e);
        c+= merge(a,s,m,e);
        return c;
    }
    private int merge(int[] a, int s, int m, int e)
    {
        int c= 0;
        int j = m+1;
        List<Integer> res = new ArrayList<>();
        for(int i = s; i<=m; i++)
        {
            while(j <= e && a[i] > (2*(long)a[j]))
            {
                j++;
            }
            c+= (j-(m+1));
        }
        int l= s;
        int r= m+1;
        while(l<=m && r<=e)
        {
            if(a[l]<=a[r])
            {
                res.add(a[l++]);
            } else {
                res.add(a[r++]);
            }
        }
        while(l<=m)
        {
            res.add(a[l++]);
        }
        while(r<=e)
        {
            res.add(a[r++]);
        }
        for(int i = s; i<=e; i++)
        {
            a[i] = res.get(i-s);
        }
        return c;
    }
}