package LearnLinkedList;

public class DeleteOccurancesInDll {

    public static void main(String args[]) {

        int arr[] = { 3, 2 };

        DoublyLinkedList list = new DoublyLinkedList();

        list = list.arrayToDoublyLinkedList(arr);

        list.show();

        int k = 3;

        DoublyNode temp = list.head;

        while (temp.nextNode != null) {

            if (temp.data == k) {

                if (temp == list.head) {
                    if (temp.nextNode != null) {
                        temp = temp.nextNode;
                        list.head = temp;
                        temp.prevNode = null;
                        continue;
                    }
                }

                if (temp != list.head) {
                    temp.prevNode.nextNode = temp.nextNode;
                }

                if (temp.nextNode != null) {
                    temp.nextNode.prevNode = temp.prevNode;
                }

                temp = temp.nextNode;
            } else {
                temp = temp.nextNode;
            }

        }

        if (temp.data == k) {
            if (temp != list.head) {
                temp.prevNode.nextNode = null;
            } else {
                list.head = null;
            }
        }

        list.show();

    }

}
