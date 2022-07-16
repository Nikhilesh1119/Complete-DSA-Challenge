class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> res = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            res.add(temp.val);
            temp = temp.next;
        }
        int f = 0;
        int b = res.size() - 1;
        while (f< b) {
            if (!res.get(f).equals(res.get(b))) {
                return false;
            }
            f++;
            b--;
        }
        return true;
    }
}