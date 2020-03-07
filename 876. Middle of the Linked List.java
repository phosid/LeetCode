/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    //uses two pointers, a slow and fast. Slow pointer transverses one node at a time while the fast pointer transverses two nodes
    //when the fast pointer hits a null, return slow which should be the middle of the linked list
    //O(n) time complexity, O(1) space complexity
    
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (slow != null && fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
        
    }
}
