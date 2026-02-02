package LinkedList;

public class RunnerDep {

    public static void main(String args[]) {

        LinkedListDep list = new LinkedListDep();

        System.out.println("length before any element is inserted" + list.lengthOfLinkedList());

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(1);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(8);
        // list.insertAtHead(1010);

        // list.show();
        System.out.println(list.lengthOfLinkedList() + " is the length of the linked list");
        System.out.println(list.searchData(2));
        System.out.println(list.searchData(33));

        // list.deletePosition(list.lengthOfLinkedList(), 5);
        // list.show();
        list.show();
        // list.deleteAllOccurances(2);
        // list.deleteSingleOccurance(1);
        // list.insertAtHead(1010);s
        // list.insertAtTail(1010);
        // list.insertAtPosition(1010, 13, list.lengthOfLinkedList());
        list.insertBeforeValue(1010, 1000, list.lengthOfLinkedList());
        list.show();

    }

}
