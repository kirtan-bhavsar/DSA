package LearnLinkedList;

public class RemoveDuplicatesFromSortedDoublyLinkedList {

    class Node {
        int data;
        Node next, prev;

        Node(int x) {
            this.data = x;
            this.next = null;
            this.prev = null;
        }
    }

    class Solution {
        Node removeDuplicates(Node head) {

            if (head.next == null)
                return head;

            Node temp = head;

            while (temp.next != null) {

                temp = temp.next;

                if (temp.data == temp.prev.data) {
                    temp.prev.next = temp.next;
                    if (temp.next != null) {
                        temp.next.prev = temp.prev;
                    }
                }

            }

            return head;

        }
    }

}
