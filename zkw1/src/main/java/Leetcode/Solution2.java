package Leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution2 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode pre = new ListNode();
            ListNode head = new ListNode();
            head = pre;

            int t = 0;
            while (l1 != null || l2 != null || t != 0) {
                if (l1 != null) {
                    t += l1.val;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    t += l2.val;
                    l2 = l2.next;
                }
                pre.next = new ListNode(t % 10);
                pre = pre.next;
                t /= 10;

            }
            return head.next;


        }
    }
}