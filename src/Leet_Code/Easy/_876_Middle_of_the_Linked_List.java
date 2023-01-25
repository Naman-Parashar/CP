package Leet_Code.Easy;

   class ListNode {
      int val;
      ListNode next;
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class _876_Middle_of_the_Linked_List {
    public ListNode middleNode(ListNode head) {
        ListNode curr = head, n =head;
        while (n != null && n.next != null){
            curr = curr.next;
            n = n.next.next;
        }
        return curr;
    }
}
