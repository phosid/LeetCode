/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {


    //one pass solution, keeps track of a previous pointer that starts iterating when it is a distance of n away from each other.
    //thus, when current is at null, the prev point will be at the nth position away from the end because they are seperated by
    //a distance of n.
    //O(n) time complexity, O(1) space complexity


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        ListNode current = head;
        ListNode prev = dummy;
        dummy.next = head;
        while (current != null) {
            if (n <= 0) {
                prev = prev.next;
            }
            current = current.next;
            n--;
        }
        prev.next = prev.next.next;
        return dummy.next;  
    }
}
