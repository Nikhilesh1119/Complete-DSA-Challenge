class Solution {
    public boolean isPalindrome(int x) {
        int a=x,l,s=0;
        while(a>0)
        {
            l=a%10;
            s=s*10+l;
            a/=10;
        }
        if(s==x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}