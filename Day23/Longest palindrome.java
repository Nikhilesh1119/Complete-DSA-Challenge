class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap();
        int ans = 0;
        for(char i : s.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if(map.get(i) == 2) {
                ans += 2;
                map.put(i, 0);  
            } 
        }
        return ans == s.length() ? ans : ans + 1;
    }
}