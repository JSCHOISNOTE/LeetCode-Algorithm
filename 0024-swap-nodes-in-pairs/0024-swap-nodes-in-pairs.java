public class Solution {

  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode result = new ListNode(0);
    result.next = head;
    ListNode current = result;
    ListNode slow;
    ListNode fast;
    while (current.next != null && current.next.next != null) {
      slow = current;
      current = current.next;
      slow.next = current.next;
      fast = current.next.next;
      current.next.next = current;
      current.next = fast;
    }
    return result.next;
  }
}