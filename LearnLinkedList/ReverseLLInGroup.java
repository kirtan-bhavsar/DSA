package LearnLinkedList;

public class ReverseLLInGroup {

    public static void main(String args[]) {

        LinkedList list = new LinkedList();

        int arr[] = { 5, 8, 7, 9, 6, 3, 2, 4, 1 };

        list = list.arrayToLinkedlist(arr);

        int k = 10;

        if (list.head.next == null || k == 1) {
            list.show();
            return;
        }

        list.head = reverseLinkedListInGroup(list.head, k);

        list.show();
    }

    public static Node reverseLinkedListInGroup(Node head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        // comment this

        // in this first we will initiate a temp, traverse it till the counter reached
        // k,
        // when reached we will call the function again with temp.next
        // when to return : if temp is null or temp.next == null then return head
        // in the loop : if temp.next reached null but counter didn't reach k, then also
        // return the head
        // connect temp.next with the updated head;

        Node temp = head;
        int counter = 1;

        while (temp != null) {
            if (temp != null)
                System.out.println("temp before next is :" + temp.data);
            temp = temp.next;
            if (temp == null)
                System.out.println("temp is null after performing next");
            counter += 1;
            System.out.println("counter is " + counter);

            if (temp != null)
                System.out.println("temp after next is :" + temp.data);

            if (temp == null && counter <= k) {
                System.out.println("here temp is null and counter is less than k");
                return head;
            }
            if (counter == k) {
                if (temp != null)
                    System.out.println("while loop broken when temp is : " + temp.data);
                break;
            }
        }

        temp.next = reverseLinkedListInGroup(temp.next, k);
        head = reverseSingleGroup(head, head.next, 1, k);

        // return head;
        return head;

    }

    public static Node reverseSingleGroup(Node head, Node temp, int counter, int k) {

        if (counter == k) {
            return head;
        }

        Node newHead = reverseSingleGroup(temp, temp.next, ++counter, k);

        head.next = temp.next;
        temp.next = head;
        temp = head;

        return newHead;

    }

}
