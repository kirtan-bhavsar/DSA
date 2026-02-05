package LearnLinkedList;

public class DoublyLinkedList {

    DoublyNode head;

    public void add(int data) {

        System.out.println("add called for data : " + data);

        if (head == null) {
            head = new DoublyNode();
            head.data = data;
            head.prevNode = null;
            head.nextNode = null;
            System.out.println("add ended when inserting the head");
            return;
        }

        DoublyNode temp = head;
        System.out.println("currently the temp is " + temp.data);

        while (temp.nextNode != null) {
            temp = temp.nextNode;
        }

        DoublyNode newNode = new DoublyNode();
        newNode.data = data;
        newNode.nextNode = null;
        newNode.prevNode = temp;
        temp.nextNode = newNode;
        System.out.println("add ended for data : " + data);
    }

    public void show() {

        if (head == null) {
            System.out.println("The doubly list is empty");
            return;
        }

        if (head.nextNode == null) {
            System.out.println(head.data);
            return;
        }

        DoublyNode temp = head;

        while (temp.nextNode != null) {
            System.out.print(temp.data + " -> <- ");
            temp = temp.nextNode;
        }

        System.out.println(temp.data);

    }

}
