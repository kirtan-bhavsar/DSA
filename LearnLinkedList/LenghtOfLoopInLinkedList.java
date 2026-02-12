package LearnLinkedList;

public class LenghtOfLoopInLinkedList {

    /****************************************************************
     * 
     * Following is the class structure of the Node class:
     * 
     * class Node {
     * public int data;
     * public Node next;
     * 
     * Node()
     * {
     * this.data = 0;
     * this.next = null;
     * }
     * 
     * Node(int data)
     * {
     * this.data = data;
     * this.next = null;
     * }
     * 
     * Node(int data, Node next)
     * {
     * this.data = data;
     * this.next = next;
     * }
     * };
     * 
     *****************************************************************/

    public static int lengthOfLoop(Node head) {

        if (head == null || head.next == null)
            return 0;

        Node slow = head;
        Node fast = head;
        int counter = 0;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                counter = 1;
                slow = slow.next;
                fast = fast.next.next;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next.next;
                    counter += 1;
                }

                return counter;

            }

        }

        return 0;

    }
}
