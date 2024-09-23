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
import java.util.Map;
import java.util.TreeMap;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        ListNode curr = head;
        while (curr != null) {
            treeMap.put(curr.val, treeMap.getOrDefault(curr.val, 0) + 1);
            curr = curr.next;
        }
        ListNode res = null;
        ListNode temp = null;
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            int k = entry.getKey();
            int u = entry.getValue();
            if (u == 1) {
                if (res == null) {
                    res = new ListNode(k);
                    temp = res;
                } else {
                    temp.next = new ListNode(k);
                    temp = temp.next;
                }
            }
        }

        return res;
    }
}
