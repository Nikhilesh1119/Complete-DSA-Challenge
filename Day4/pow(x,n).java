class Solution {
    public double myPow(double x, int n) {
        double k=1.0;
        long c=n;
        if(c<0)
        {
            c=c*-1;
        }
        while(c>0)
        {
            if(c%2==0)
            {
                x=x*x;
                c/=2;
            }
            else{
                k=k*x;
                c--;
            }
        }
        if(n<0)
        {
            k=(double)(1.0)/(double)(k);
        }
        return k;
    }
}