package LearnLinkedList;

public class AddTwoNumber {

    public static void main(String args[]) {

        int arr1[] = { 4, 4, 4, 4 };
        int arr2[] = { 5, 5, 5, 6 };

        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1 = list1.arrayToLinkedlist(arr1);
        list2 = list2.arrayToLinkedlist(arr2);
        // list1.show();
        // list2.show();

        Node temp1 = list1.head;
        Node temp2 = list2.head;
        int list1Counter = 0;
        int list2Counter = 0;

        while (temp1.next != null || temp2.next != null) {

            if (temp2.next == null && temp1.next != null) {
                list1Counter += 1;
            }
            if (temp1.next == null && temp2.next != null) {
                list2Counter += 1;
            }

            if (temp1.next != null)
                temp1 = temp1.next;
            if (temp2.next != null)
                temp2 = temp2.next;

        }

        LinkedList list3 = new LinkedList();

        // System.out.println("list1Counter = " + list1Counter);
        // System.out.println("list2Counter = " + list2Counter);

        list3.head = addTwoNumbers(list1.head, list2.head, list1Counter, list2Counter);
        list3.show();
    }

    public static Node addTwoNumbers(Node head1, Node head2, int list1Counter, int list2Counter) {

        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;
        Node temp1 = null;
        System.out.println("temp1" + temp1);
        Node temp2 = null;
        System.out.println("temp2" + temp2);

        if (head1.next == null && head2.next == null) {
            Node temp = new Node();
            temp.data = head1.data + head2.data;
            return temp;
        }

        if (list2Counter == 0 && head1.next != null) {
            temp1 = head1;
            head1 = head1.next;
        }
        // System.out.println(temp1 == null ? "temp1 is null for this iteration"
        // : "temp1 is not null it's value is : " + temp1.data);
        ;
        if (list1Counter == 0 && head2.next != null) {
            temp2 = head2;
            head2 = head2.next;
        }
        // System.out.println(temp2 == null ? "temp2 is null for this iteration"
        // : "temp2 is not null it's value is : " + temp2.data);

        // System.out.println("before calling function another time");
        // System.out.println("Head 1 is : " + head1.data);
        // System.out.println("Head 2 is : " + head2.data);
        Node temp = addTwoNumbers(head1, head2, temp2 == null ? --list1Counter : 0, temp1 == null ? --list2Counter : 0);
        int temp1Data = temp1 != null ? temp1.data : 0;
        int temp2Data = temp2 != null ? temp2.data : 0;
        Node current = new Node();
        current.data = temp1Data + temp2Data + (temp.data / 10);
        // System.out.println("sum is : " + current.data);
        current.next = temp;
        temp.data = temp.data % 10;
        System.out.println("list1Counter is : " + list1Counter);
        System.out.println("list2Counter is : " + list2Counter);
        if ((list1Counter != 0 && temp1 == head1) || (list2Counter != 0 && temp2 == head2)) {
            System.out.println("new head will be created");
            if (current.data > 9) {
                Node newHead = new Node();
                newHead.data = 1;
                newHead.next = current;
                current.data = current.data % 10;
                return newHead;
            }
        }
        return current;

    }

}

// /*
// class Node {
// int data;
// Node next;

// Node(int d) {
// data = d;
// next = null;
// }
// }
// */

// class Solution {
// public Node addTwoLists(Node head1, Node head2) {

// if(head1 == null) return head2;
// if(head2 == null) return head1;
// Node temp1;
// Node temp2;

// if(head1.next == null && head2.next == null){
// Node temp = new Node(head1.data + head2.data);
// return temp;
// }

// if(head1.next != null){
// temp1 = head1
// head1 = head1.next
// };
// if(head2.next != null){
// temp2 = head2;
// head2 = head2.next
// };
// Note temp = addTwoLists(head1,head2);
// int temp1Data = temp1 != null ? temp1.data : 0;
// int temp2Data = temp2 != null ? temp2.data : 0;
// Node current = temp1Data + temp2Data + (temp.data/10);
// current.next = temp;
// temp.data = temp.data % 10;
// return current;
// }
// }