package LearnLinkedList;

public class Add1ToLinkedList {

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    class Solution {
        public Node addOne(Node head) {

            Node temp = head;
            Node prevTemp = null;
            Node seriesStart = null;
            Node prevSeries = null;
            boolean doesSeriesExists = false;

            while (temp != null) {
                if (temp.data == 9) {
                    if (temp != head
                            && prevSeries == null
                            && prevTemp.data != 9)
                        prevSeries = prevTemp;
                    if (seriesStart == null)
                        seriesStart = temp;
                    doesSeriesExists = true;

                    prevTemp = temp;
                    temp = temp.next;
                    continue;
                } else {
                    seriesStart = null;
                    prevSeries = null;
                    doesSeriesExists = false;
                    prevTemp = temp;
                    temp = temp.next;
                    continue;
                }
            }

            if (!doesSeriesExists) {
                if (prevTemp == null) {
                    head.data += 1;
                    return head;
                } else {
                    prevTemp.data += 1;
                    return head;
                }
            }

            if (prevSeries != null && doesSeriesExists) {
                prevSeries.data += 1;
                while (seriesStart != null) {
                    seriesStart.data = 0;
                    seriesStart = seriesStart.next;
                }
                return head;
            }

            if (prevSeries == null && doesSeriesExists) {
                head.data = 1;
                seriesStart = seriesStart.next;
                while (seriesStart != null) {
                    seriesStart.data = 0;
                    seriesStart = seriesStart.next;
                }
                Node newNode = new Node(0);
                if (prevTemp == null) {
                    head.next = newNode;
                    return head;
                } else {
                    prevTemp.next = newNode;
                    return head;
                }
            }

            return head;

        }
    }

}
