class Solution {
    public int firstUniqChar(String s) {
        int[] a = new int[26];
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            a[c - 97] += 1;
        }
         for(int i = 0; i < s.length(); i++){
            if(a[s.charAt(i) - 97] == 1){
                return i ;
            }
        }
        return -1;
    }
}