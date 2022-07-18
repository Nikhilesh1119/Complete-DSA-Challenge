class Solution {
    public Node copyRandomList(Node head) {
       Node i = head; 
          Node f = head;
          while (i != null) {
            f = i.next;
            Node c = new Node(i.val);
            i.next = c;
            c.next = f;
            i = f;
          }
          i = head;
          while (i != null) {
            if (i.random != null) {
              i.next.random = i.random.next;
            }
            i = i.next.next;
          }
          i = head;
          Node ans = new Node(0);
          Node c = ans;
          while (i != null) {
            f = i.next.next;
            c.next = i.next;
            c = c.next;
            i.next = f;

            i = f;
          }

          return ans.next;
    }
}