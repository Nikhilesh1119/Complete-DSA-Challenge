/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode s = new ListNode();
        s.next=head;
        ListNode a=s;
        ListNode b=s;
        for(int i=0;i<n;i++)
            {
            b=b.next;
            }
        while (b.next!=null)
            {
            b=b.next;
            a=a.next;
            }
        a.next=a.next.next;
        return s.next;
    }
}