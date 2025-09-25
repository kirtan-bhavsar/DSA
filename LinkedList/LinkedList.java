package LinkedList;

public class LinkedList {

    Node head;
    Node tail;

    public void deletePosition(int length, int position) {

        if (position > length)
            return;
        if (position == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        int currentPosition = 1;
        Node prevTemp = null;

        while (currentPosition != position) {

            currentPosition += 1;
            prevTemp = temp;
            temp = temp.next;

        }

        prevTemp.next = temp.next;
        temp.next = null;

    }

    public void deleteAllOccurances(int data) {

        Node temp = head;
        Node prevTemp = null;

        while (temp.next != null) {

            if (temp.data == data) {
                if (prevTemp == null) {
                    head = temp.next;
                    temp.next = null;
                    temp = head;
                    continue;
                }
                temp = temp.next;
                prevTemp.next = temp;
                continue;
            }

            prevTemp = temp;
            temp = temp.next;

        }

        if (temp.data == data) {
            if (prevTemp == null) {
                temp = null;
                head = null;
                return;
            }
            prevTemp.next = null;
        }

        return;

    }

    public void deleteSingleOccurance(int data) {

        Node temp = head;
        Node prevTemp = null;

        while (temp.next != null) {

            if (temp.data == data) {
                if (prevTemp == null) {
                    head = temp.next;
                    temp.next = null;
                    temp = head;
                    return;
                }
                temp = temp.next;
                prevTemp.next = temp;
                return;
            }

            prevTemp = temp;
            temp = temp.next;

        }

        if (temp.data == data) {
            if (prevTemp == null) {
                temp = null;
                head = null;
                return;
            }
            prevTemp.next = null;
        }

        return;

    }

    public int lengthOfLinkedList() {

        Node temp = head;
        int counter = 1;

        while (temp.next != null) {
            temp = temp.next;
            counter += 1;
        }

        return counter;

    }

    public void add(int data) {

        Node node = new Node();

        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }

    }

    public void show() {

        Node current = head;
        if (current == null) {
            System.out.println("There are no elements in linkedlist to show");
            return;
        }

        while (current.next != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println(current.data + " ");

    }

    public int searchData(int data) {

        Node temp = head;

        while (temp.next != null) {
            if (temp.data == data)
                return 1;
            temp = temp.next;
        }

        if (temp.data == data)
            return 1;

        return 0;
    }

    public void insertAtHead(int data) {

        Node newNode = new Node();

        newNode.data = data;

        newNode.next = head;

        head = newNode;

    }

    public void insertAtTail(int data) {

        Node newNode = new Node();

        newNode.data = data;

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

    }

    public void insertAtPosition(int data, int position, int length) {

        if (position < 1 || position > length + 1) {
            return;
        }

        if (position == 1) {
            insertAtHead(data);
            return;
        }

        if (position == length + 1) {
            insertAtTail(data);
            return;
        }

        Node newNode = new Node();

        newNode.data = data;

        Node prevTemp = head;
        Node temp = head.next;

        int counter = 2;

        while (counter <= position) {

            if (counter == position) {
                prevTemp.next = newNode;
                newNode.next = temp;
            }

            counter += 1;
            prevTemp = temp;
            temp = temp.next;

        }

    }

}
