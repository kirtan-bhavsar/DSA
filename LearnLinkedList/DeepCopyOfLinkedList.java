package LearnLinkedList;

public class DeepCopyOfLinkedList {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    class Solution {
        public Node copyRandomList(Node head) {

            if (head == null)
                return head;

            Node temp = head;

            while (temp != null) {
                Node newNode = new Node(temp.val);
                newNode.next = temp.next;
                temp.next = newNode;
                temp = temp.next.next;
            }

            Node temp1 = head;
            Node temp2 = temp1.next;
            Node newHead = temp2;

            while (temp1 != null) {
                if (temp1.random == null) {
                    temp2.random = null;
                } else {
                    temp2.random = temp1.random.next;
                }

                temp1 = temp1.next.next;
                if (temp1 != null)
                    temp2 = temp2.next.next;
            }

            temp1 = head;
            temp2 = temp1.next;

            while (temp1 != null) {

                temp1.next = temp1.next.next;
                temp1 = temp1.next;
                if (temp1 != null) {
                    temp2.next = temp2.next.next;
                    temp2 = temp2.next;
                } else {
                    temp2.next = null;
                }

            }

            return newHead;

        }
    }

}
