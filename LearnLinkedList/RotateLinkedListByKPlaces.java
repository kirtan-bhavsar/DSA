package LearnLinkedList;

public class RotateLinkedListByKPlaces {

    // * Definition for singly-linked list.
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
        public ListNode rotateRight(ListNode head, int k) {

            if (head == null || head.next == null) {
                return head;
            }

            ListNode temp = head;

            int length = 1;

            while (temp.next != null) {
                length += 1;
                temp = temp.next;
            }

            ListNode lastNode = temp;

            int finalShift = k % length;

            if (finalShift == 0)
                return head;

            int counter = 1;

            temp = head;

            while (counter != length) {
                if (counter == finalShift) {
                    temp = head;
                    counter += 1;
                    continue;
                }
                counter += 1;
                temp = temp.next;
            }

            lastNode.next = head;
            head = temp.next;
            temp.next = null;

            return head;

        }
    }

}
