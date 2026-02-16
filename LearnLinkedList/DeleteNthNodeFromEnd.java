package LearnLinkedList;

public class DeleteNthNodeFromEnd {

    // Definition for singly-linked list.
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
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {

            if (head.next == null) {
                if (n == 1)
                    return null;
                return head;
            }

            ListNode newHead = reverseLinkedList(head, head.next);

            newHead = deleteNode(newHead, n);

            newHead = reverseLinkedList(newHead, newHead.next);

            return newHead;

        }

        public ListNode reverseLinkedList(ListNode head, ListNode temp) {

            ListNode newHead = null;

            if (temp == null) {
                newHead = head;
                return newHead;
            }

            newHead = reverseLinkedList(temp, temp.next);
            head.next = temp.next;
            temp.next = head;
            temp = head;
            return newHead;

        }

        public ListNode deleteNode(ListNode head, int n) {

            if (n == 1) {
                head = head.next;
                return head;
            }

            ListNode temp = head;
            int counter = 1;

            while (temp.next != null) {
                if (counter == n - 1) {
                    temp.next = temp.next.next;
                    break;
                }
                counter += 1;
                temp = temp.next;
            }

            return head;

        }

    }

}
