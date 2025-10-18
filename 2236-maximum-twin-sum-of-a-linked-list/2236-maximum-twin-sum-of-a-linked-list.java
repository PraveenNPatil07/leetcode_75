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
    public int pairSum(ListNode head) {
        int res = Integer.MIN_VALUE;
        ListNode f = head, s = head;

        while(f != null && f.next != null){
            f = f.next.next;
            s = s.next;
        }
        ListNode prev = null;
        while (s!=null) {
            ListNode next = s.next;
            s.next = prev;
            prev = s;
            s = next;
        }
        while(prev != null){
            res = Math.max(res, prev.val+head.val);
            head = head.next;
            prev = prev.next;
        }

        return res;
    }
}