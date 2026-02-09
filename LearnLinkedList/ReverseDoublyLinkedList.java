package LearnLinkedList;

public class ReverseDoublyLinkedList {

    class Solution {
        public Node reverse(Node head) {

            if (head.next == null)
                return head;

            Node temp = head;

            while (temp.next != null) {
                Node storeNode = temp.next;
                temp.next = temp.prev;
                temp.prev = storeNode;
                temp = temp.prev;
            }

            Node storeNode = temp.next;
            temp.next = temp.prev;
            temp.prev = storeNode;
            head = temp;
            return head;

        }
    }

}
