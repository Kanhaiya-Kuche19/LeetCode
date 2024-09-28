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
    public ListNode middleNode(ListNode head) {
        int cnt = 0;
        ListNode curr = null;
        if(head != null){
            curr = head;;
        }
        while(curr != null){
            cnt++;
            curr = curr.next;
        }

        int k = cnt/2;
        ListNode res = head;
        int c = 1;
        while(c<=k){
            res = res.next;
            c++;
        }

        return res;
        
    }
}