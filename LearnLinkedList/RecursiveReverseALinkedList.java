package LearnLinkedList;

public class RecursiveReverseALinkedList {

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

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        // Iterative approach

        // Stack<Integer> stack = new Stack<>();

        // ListNode temp = head;

        // while(temp.next != null){
        // stack.push(temp.val);
        // temp = temp.next;
        // }

        // head = temp;

        // while(!stack.isEmpty()){
        // temp.next = new ListNode(stack.pop());
        // temp = temp.next;
        // }

        // temp.next = null;
        // return head;

        // recursive approach

        return reverseGivenList(head, head.next);

    }

    public ListNode reverseGivenList(ListNode head, ListNode temp) {

        ListNode newHead = null;

        if (temp == null) {
            newHead = head;
            return newHead;
        }
        newHead = reverseGivenList(temp, temp.next);
        head.next = temp.next;
        temp.next = head;
        temp = head;

        return newHead;
    }
}
