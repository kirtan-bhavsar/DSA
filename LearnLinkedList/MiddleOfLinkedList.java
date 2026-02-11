package LearnLinkedList;

public class MiddleOfLinkedList {

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

    public ListNode middleNode(ListNode head) {

        if (head == null || head.next == null)
            return head;

        double length = 1;

        ListNode temp = head;

        while (temp.next != null) {
            length += 1;
            temp = temp.next;
        }

        System.out.println("length is : " + length);

        temp = head;

        double mid = Math.ceil((length + 1) / 2);
        System.out.println("mid is : " + mid);

        int counter = 1;

        while (temp.next != null) {
            System.out.println("currently the temp is : " + temp.val);
            temp = temp.next;
            System.out.println("after incrementing the temp is : " + temp.val);
            counter += 1;
            if (counter == (int) mid)
                return temp;
        }

        return head;

    }

}
