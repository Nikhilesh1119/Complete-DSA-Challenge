class Solution {
    public int largestAltitude(int[] gain) {
        int a=0,b=0;
        for(int i=0;i<gain.length;i++)
            {
            a+=gain[i];
            if(b<a)
            {
                b=a;
            }
        }
        return b;
    }
}