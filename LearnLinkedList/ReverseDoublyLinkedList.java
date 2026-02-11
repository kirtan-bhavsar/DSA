package LearnLinkedList;

public class ReverseDoublyLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next, ListNode prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

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
