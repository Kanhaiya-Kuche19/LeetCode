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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int carry = 0;
        ListNode head = null;
        ListNode tail = null;
        while(l1 != null || l2 != null){
            sum=carry;
            if(l1 != null){
                sum=sum+l1.val;
                l1=l1.next;
            }
            if(l2 != null){
                sum = sum+l2.val;
                l2=l2.next;
            }
            int d = sum%10;
            ListNode n = new ListNode(d);
            carry = sum/10;
            if(head == null){
                head = n;
                tail = n;

            }else{
                tail.next = n;
                tail=n;
            }
        
        }

        if(carry > 0){
           ListNode n = new ListNode(carry);
            tail.next = n;
        }

        return head;

    }
}