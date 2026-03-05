package LearnLinkedList;

public class SortLinkedList {

    public static void main(String args[]) {

        LinkedList list = new LinkedList();

        // int arr[] = { 7, 5, 1, 6, 3, 8, 4 };
        int arr[] = { 1, 3, 6, 2, 4, 8 };

        list = list.arrayToLinkedlist(arr);

        list.show();

        list.head = sortLinkedList(list.head);

        System.out.println("----the final sorted linked list----");
        list.show();
    }

    public static Node sortLinkedList(Node head) {

        System.out.println("original linkedlist received by sort function");
        printListBasedOnHead(head);

        if (head == null || head.next == null) {
            System.out.println("sort returned");
            return head;
        }

        Node mid = findMid(head);

        Node leftHead = head;
        Node rightHead = mid.next;
        mid.next = null;

        System.out.println("two divided linked list");
        printListBasedOnHead(leftHead);
        printListBasedOnHead(rightHead);

        leftHead = sortLinkedList(leftHead);
        System.out.println("linked list based on sorted leftHead");
        printListBasedOnHead(leftHead);
        rightHead = sortLinkedList(rightHead);
        System.out.println("linked list based on sorted rightHead");
        printListBasedOnHead(rightHead);

        head = mergeLinkedList(leftHead, rightHead);

        System.out.println("the merged linked list with single head i.e the lefthead");
        printListBasedOnHead(head);

        // comment the below line of code
        return head;

    }

    public static Node mergeLinkedList(Node leftHead, Node rightHead) {

        Node temp1 = leftHead;
        Node temp2 = rightHead;
        Node prevTemp1 = null;
        Node prevTemp2 = null;

        while (temp1 != null && temp2 != null) {

            if (temp2.data < temp1.data) {
                prevTemp2 = temp2;
                temp2 = temp2.next;
                prevTemp2.next = temp1;
                if (temp1 == leftHead) {
                    leftHead = prevTemp2;
                    prevTemp1 = leftHead;
                }
                if (prevTemp1 != null && prevTemp1 != prevTemp2) {
                    prevTemp1.next = prevTemp2;
                    prevTemp1 = prevTemp2;
                }
            } else {
                prevTemp1 = temp1;
                temp1 = temp1.next;
            }

        }

        if (temp1 == null) {
            prevTemp1.next = temp2;
        }
        if (temp2 == null) {
            return leftHead;
        }

        return leftHead;

    }

    public static Node findMid(Node head) {

        Node slow = head;
        Node fast = head;
        Node prevSlow = null;

        while (fast != null && fast.next != null) {

            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;

        }

        return prevSlow;

    }

    public static void printListBasedOnHead(Node head) {

        Node temp = head;

        while (temp.next != null) {
            System.out.print(" " + temp.data + " -> ");
            temp = temp.next;
        }

        System.out.print(temp.data);
        System.out.println();

    }
}
