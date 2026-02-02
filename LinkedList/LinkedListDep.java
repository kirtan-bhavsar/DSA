package LinkedList;

public class LinkedListDep {

    NodeDep head;
    NodeDep tail;

    public void deletePosition(int length, int position) {

        if (position > length)
            return;
        if (position == 1) {
            head = head.next;
            return;
        }
        NodeDep temp = head;
        int currentPosition = 1;
        NodeDep prevTemp = null;

        while (currentPosition != position) {

            currentPosition += 1;
            prevTemp = temp;
            temp = temp.next;

        }

        prevTemp.next = temp.next;
        temp.next = null;

    }

    public void deleteAllOccurances(int data) {

        NodeDep temp = head;
        NodeDep prevTemp = null;

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

        NodeDep temp = head;
        NodeDep prevTemp = null;

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

        NodeDep temp = head;
        int counter = 1;

        while (temp.next != null) {
            temp = temp.next;
            counter += 1;
        }

        return counter;

    }

    public void add(int data) {

        NodeDep node = new NodeDep();

        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            NodeDep current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }

    }

    public void show() {

        NodeDep current = head;
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

        NodeDep temp = head;

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

        NodeDep newNode = new NodeDep();

        newNode.data = data;

        newNode.next = head;

        head = newNode;

    }

    public void insertAtTail(int data) {

        NodeDep newNode = new NodeDep();

        newNode.data = data;

        NodeDep temp = head;

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

        NodeDep newNode = new NodeDep();

        newNode.data = data;

        NodeDep prevTemp = head;
        NodeDep temp = head.next;

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

    public void insertBeforeValue(int data, int value, int length) {

        NodeDep temp = head;
        NodeDep prevTemp = null;
        int counter = 1;

        NodeDep newNode = new NodeDep();
        newNode.data = data;

        while (counter <= length) {
            if (temp.data == value) {
                if (prevTemp == null) {
                    newNode.next = head;
                    head = newNode;
                    return;
                }
                prevTemp.next = newNode;
                newNode.next = temp;
                return;
            }
            counter += 1;
            prevTemp = temp;
            temp = temp.next;
        }

    }

}
