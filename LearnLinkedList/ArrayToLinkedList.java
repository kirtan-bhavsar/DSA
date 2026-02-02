package LearnLinkedList;

public class ArrayToLinkedList {

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5, 6 };

        LinkedList list = new LinkedList();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        list.show();

    }

}
