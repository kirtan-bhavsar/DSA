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
            Node prevSeries = null;

            while (temp != null) {

                if (temp.data == 9) {
                    if (temp != head && prevTemp != null && prevTemp.data != 9)
                        prevSeries = prevTemp;
                    prevTemp = temp;
                    temp = temp.next;
                } else {
                    prevSeries = null;
                    prevTemp = temp;
                    temp = temp.next;
                }

            }

            // whole 9 series
            if (prevSeries == null && prevTemp.data == 9) {
                temp = head;
                temp.data = 1;
                while (temp.next != null) {
                    temp = temp.next;
                    temp.data = 0;
                }
                Node newNode = new Node(0);
                temp.next = newNode;
                return head;
            }

            // although 9 series exists but not whole
            if (prevSeries != null && prevTemp.data == 9) {

                temp = prevSeries;
                temp.data += 1;

                while (temp.next != null) {
                    temp = temp.next;
                    temp.data = 0;
                }

                return head;
            }

            // no 9 at last
            if (prevTemp.data != 9) {
                prevTemp.data += 1;
                return head;
            }

            return head;

        }
    }

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
