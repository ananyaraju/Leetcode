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
class Solution
{
    public ListNode middleNode(ListNode head)
    {
        ListNode i = head;
        ListNode j = head;
        boolean check = false;
        while (i != null)
        {
            if (i.next != null)
                i = i.next.next;
            else
            {
                i = null;
                break;
            }
            j = j.next;
        }
        return j;
    }
}