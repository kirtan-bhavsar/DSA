package LearnLinkedList;

public class FlattenLinkedList {

    public static void main(String args[]) {

        class Node {
            int data;
            Node next;
            Node bottom;

            Node(int x) {
                data = x;
                next = null;
                bottom = null;
            }
        }

        class Solution {

            public Node flatten(Node root) {

                if (root.next == null) {
                    return root;
                }

                Node head = flatten(root.next);

                Node newHead = mergeLinkedLists(root, head);

                // printWithHead(newHead);

                return newHead;

            }

            public Node mergeLinkedLists(Node head, Node secondHead) {

                Node dummyNode = new Node(-1);
                Node tracker = dummyNode;

                Node temp1 = head;
                Node temp2 = secondHead;

                while (temp1 != null && temp2 != null) {
                    if (temp1.data <= temp2.data) {
                        tracker.bottom = temp1;
                        tracker = tracker.bottom;
                        temp1 = temp1.bottom;
                    } else {
                        tracker.bottom = temp2;
                        tracker = tracker.bottom;
                        temp2 = temp2.bottom;
                    }
                }

                if (temp1 != null) {
                    tracker.bottom = temp1;
                }

                if (temp2 != null) {
                    tracker.bottom = temp2;
                }

                return dummyNode.bottom;

            }

            // public void printWithHead(Node head){

            // if(head == null)return;

            // Node temp = head;

            // System.out.println(head.data);

            // while(temp.bottom != null){
            // temp = temp.bottom;
            // System.out.println(" | ");
            // System.out.println(temp.data);
            // }

            // System.out.println(temp.data);

            // }

        }

    }

}
