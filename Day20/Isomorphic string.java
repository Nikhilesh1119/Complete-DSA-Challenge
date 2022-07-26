class Solution {
    public boolean isIsomorphic(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        
        if(l1!=l2) return false;
        
        HashMap<Character,Character> map=new HashMap<>();

           for(int i = 0; i<l1; i++){
           char c1 = s.charAt(i);
           char c2 = t.charAt(i);
           if(!map.containsKey(c1) && !map.containsValue(c2)){
               map.put(c1, c2);
           }
          }
       String ans = "";
       for(int i = 0; i<l1; i++){
           char c1 = s.charAt(i);
           if(!map.containsKey(c1)){
               return false;
           }
           ans = ans + map.get(c1);           
       }       
       return ans.equals(t);
   }
 }