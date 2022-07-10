class Solution {
    
    public String intToRoman(int num) {
        
        String roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};       
        int a[] =  {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String ans="";
        int i=0;
        while(num>0 && i<a.length) {
            if(num>=a[i]) {
                int n= num/a[i];
                num= num%a[i];
                while(n-->0) 
                ans+=roman[i];
            }
            i++;
        }
        
        return ans;
    }
}