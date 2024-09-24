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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        boolean res = true;
        ArrayList<Integer> A = new ArrayList<Integer>();
        ListNode curr = head;
        while(curr != null){
            A.add(curr.val);
            curr = curr.next;
        }

        int s = 0;
        int e = A.size()-1;
        while(s<=e){
            if(A.get(s) != A.get(e)){
                res=false;
                break;
            }
            s++;
            e--;
        }

        return res;

    }
}