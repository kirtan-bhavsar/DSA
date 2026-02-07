package LearnLinkedList;

public class DoublyRunner {

    public static void main(String args[]) {

        DoublyLinkedList doublylist = new DoublyLinkedList();

        // doublylist.add(1);
        // // doublylist.add(2);
        // // doublylist.add(3);
        // doublylist.show();

        // ---Array to linked list test cases---

        // Test Case 1
        // int arr[] = { 1, 2, 3, 4 }; // also passed for empty array, with
        // one/two/three element(s)
        // doublylist = doublylist.arrayToDoublyLinkedList(arr);
        // doublylist.show();

        // ---Insert at head test cases---

        // Test Case 1
        // int arr[] = {};
        // doublylist = doublylist.arrayToDoublyLinkedList(arr);
        // doublylist.show();
        // doublylist.insertAtHead(1);
        // doublylist.show();

        // Test Case 2
        // int arr[] = { 2 };
        // doublylist = doublylist.arrayToDoublyLinkedList(arr);
        // doublylist.show();
        // doublylist.insertAtHead(1);
        // doublylist.show();

        // // Test Case 3
        // int arr[] = { 2, 3 };
        // doublylist = doublylist.arrayToDoublyLinkedList(arr);
        // doublylist.show();
        // doublylist.insertAtHead(1);
        // doublylist.show();

        // // Test Case 4
        // int arr[] = { 2, 3, 4 };
        // doublylist = doublylist.arrayToDoublyLinkedList(arr);
        // doublylist.show();
        // doublylist.insertAtHead(1);
        // doublylist.show();

        // ---insertAtPosition test cases---
        // Test Case 1
        // int arr[] = {};
        // doublylist = doublylist.arrayToDoublyLinkedList(arr);
        // doublylist.show();
        // // doublylist.insertAtPosition(99, 1);
        // // doublylist.insertAtPosition(99, 2);
        // doublylist.show();

        // Test Case 2
        // int arr[] = {};
        // doublylist = doublylist.arrayToDoublyLinkedList(arr);
        // doublylist.show();
        // doublylist.insertAtPosition(99, 2);
        // doublylist.show();

        // Test Case 3
        // int arr[] = { 1 };
        // doublylist = doublylist.arrayToDoublyLinkedList(arr);
        // doublylist.show();
        // // doublylist.insertAtPosition(99, 2);
        // // doublylist.insertAtPosition(99, 1);
        // // doublylist.insertAtPosition(99, 3);
        // doublylist.show();

        // // Test Case 4
        // int arr[] = { 1, 2, 3 };
        // doublylist = doublylist.arrayToDoublyLinkedList(arr);
        // doublylist.show();
        // // doublylist.insertAtPosition(99, 1);
        // // doublylist.insertAtPosition(99, 2);
        // // doublylist.insertAtPosition(99, 3);
        // // doublylist.insertAtPosition(99, 4);
        // doublylist.insertAtPosition(99, 5);
        // doublylist.show();

        // ---delete head test cases---
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        doublylist = doublylist.arrayToDoublyLinkedList(arr);
        doublylist.show();
        doublylist.deleteHead();
        doublylist.show();

    }

}
