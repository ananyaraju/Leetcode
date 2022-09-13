/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution
{
    public ListNode detectCycle(ListNode head)
    {
        if (head == null || head.next == null)
            return null;
        ListNode i = head;
        ListNode j = head;
        while (i != null && i.next != null)
        {
            j = j.next;
            i = i.next.next;
            if (j == i)
            {
                j = head;
                while (j != i)
                {
                    i = i.next;
                    j = j.next;
                }
                return i;
            }
        }
        return null;
    }
}