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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
    ListNode temp=head;
    ListNode prev=null;
    while(temp!=null){
        if(temp.val==val){
            if(prev==null){
                temp=temp.next;
                head=temp;
            }
            else{
                prev.next=temp.next;
                temp.next=null;
                temp=prev.next;
            }
        }
        else{
            prev=temp;
            temp=temp.next;
        }
    }
    return head;
    }
}