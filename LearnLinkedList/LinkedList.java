package LearnLinkedList;

import List.sortingCustomClass;

public class LinkedList {

    Node head;
    Node tail;

    public void add(int data) {

        Node node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
            head.next = null;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        node.next = null;

    }

    public void show() {

        if (head == null) {
            System.out.println("The linkedlist is empty");
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println(temp.data);

    }

    public int lengthOfList() {

        Node temp = head;
        int counter = 1;

        if (head == null)
            return 0;
        if (head.next == null)
            return 1;

        while (temp.next != null) {
            counter += 1;
            temp = temp.next;
        }

        return counter;
    }

    public void insertAtHead(int data) {

        if (head == null) {
            head.data = data;
            head.next = null;
        }

        Node temp = new Node();

        temp.data = data;
        temp.next = head;
        head = temp;

    }

    public int checkIfPresent(int data) {

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

    public void deleteHead() {

        if (head == null) {
            System.out.println("Linkedlist is empty");
            return;
        }
        ;
        if (head.next == null) {
            System.out.println("Linkedlist has only one element");
            head = null;
            return;
        }

        head = head.next;

        return;

    }

    public void deleteTail() {

        if (head == null)
            return;
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        Node prevTemp = null;

        while (temp.next != null) {
            prevTemp = temp;
            temp = temp.next;
        }

        prevTemp.next = null;

        return;

    }

    public void insertAtTail(int data) {

        if (head == null)
            return;

        Node temp = head;
        Node newNode = new Node();

        newNode.data = data;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = null;

    }

    public void insertAtPosition(int data, int position) {

        Node temp = head;
        int counter = 1;
        Node newNode = new Node();

        if (head == null) {
            if (position > 1) {
                return;
            } else {
                head = new Node();
                head.data = data;
                head.next = null;
                return;
            }
        }

        if (head.next == null) {
            if (position >= 3)
                return;
            else {
                if (position == 1) {
                    newNode.data = data;
                    newNode.next = temp;
                    head = newNode;
                    return;
                }
                if (position == 2) {
                    newNode.data = data;
                    newNode.next = null;
                    head.next = newNode;
                    return;
                }
            }
        }

        if (position == 1) {
            newNode.data = data;
            newNode.next = head;
            head = newNode;
            return;
        } else {
            Node prevTemp = head;
            while (prevTemp.next != null) {
                prevTemp = temp;
                temp = temp.next;
                counter += 1;
                if (position == counter) {
                    newNode.data = data;
                    prevTemp.next = newNode;
                    newNode.next = temp;
                    return;
                }
            }
        }

    }

}
