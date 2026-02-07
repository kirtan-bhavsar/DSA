package LearnLinkedList;

public class DoublyLinkedList {

    DoublyNode head;

    // also insert at Tail
    public void add(int data) {

        if (head == null) {
            head = new DoublyNode();
            head.data = data;
            head.prevNode = null;
            head.nextNode = null;
            return;
        }

        DoublyNode temp = head;

        while (temp.nextNode != null) {
            temp = temp.nextNode;
        }

        DoublyNode newNode = new DoublyNode();
        newNode.data = data;
        newNode.nextNode = null;
        newNode.prevNode = temp;
        temp.nextNode = newNode;
    }

    // insert at head
    public void insertAtHead(int data) {

        if (head == null) {
            head = new DoublyNode();
            head.data = data;
            head.nextNode = null;
            head.prevNode = null;
            return;
        } else {
            DoublyNode newNode = new DoublyNode();
            newNode.data = data;
            newNode.nextNode = head;
            newNode.prevNode = null;
            head.prevNode = newNode;
            head = newNode;
            return;
        }

    }

    // insert at Kth Node(position)
    public void insertAtPosition(int data, int position) {

        if (head == null) {
            if (position > 1)
                return;
            head = new DoublyNode();
            head.data = data;
            head.nextNode = null;
            head.prevNode = null;
            return;
        }

        if (position == 1) {
            DoublyNode newNode = new DoublyNode();
            newNode.data = data;
            newNode.nextNode = head;
            newNode.prevNode = null;
            head.prevNode = newNode;
            head = newNode;
            return;
        }

        DoublyNode temp = head;
        int counter = 1;
        DoublyNode nextTemp;

        while (temp.nextNode != null) {
            nextTemp = temp.nextNode;
            if (counter == position - 1) {
                DoublyNode newNode = new DoublyNode();
                newNode.data = data;
                temp.nextNode = newNode;
                nextTemp.prevNode = newNode;
                newNode.prevNode = temp;
                newNode.nextNode = nextTemp;
                return;
            }
            temp = nextTemp;
            counter += 1;
        }

        if (counter == position - 1) {
            DoublyNode newNode = new DoublyNode();
            newNode.data = data;
            newNode.nextNode = null;
            newNode.prevNode = temp;
            temp.nextNode = newNode;
            return;
        }

    }

    // delete head
    public void deleteHead() {

        if (head == null)
            return;

        if (head.nextNode == null) {
            head = null;
            return;
        }

        head = head.nextNode;
        head.prevNode = null;
        return;

    }

    // delete tail
    public void deleteTail() {

        if (head == null)
            return;

        if (head.nextNode == null) {
            head = null;
            return;
        }

        DoublyNode temp = head;
        DoublyNode prevTemp = null;

        while (temp.nextNode != null) {
            temp = temp.nextNode;
        }

    }

    // Convert array to doubly linkedlist
    public DoublyLinkedList arrayToDoublyLinkedList(int arr[]) {

        DoublyLinkedList dll = new DoublyLinkedList();

        if (arr.length == 0)
            return dll;

        dll.insertAtHead(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            dll.add(arr[i]);
        }

        return dll;

    }

    // To display linkedlist in a visual format
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
