package LearnLinkedList;

public class SortOddAndEvenNodes {

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
        public ListNode oddEvenList(ListNode head) {

            if (head == null || head.next == null || head.next.next == null) {
                return head;
            }

            ListNode oddPointer = head;
            ListNode firstEvenPointer = head.next;
            ListNode evenPointer = head.next;
            ListNode temp = head.next.next;
            int counter = 3;

            while (temp != null) {
                if (counter % 2 == 0) {
                    evenPointer.next = temp;
                    evenPointer = temp;
                } else {
                    oddPointer.next = temp;
                    oddPointer = temp;
                }
                temp = temp.next;
                counter += 1;
            }

            oddPointer.next = firstEvenPointer;
            evenPointer.next = null;

            return head;

        }
    }

}
