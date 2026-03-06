package LearnLinkedList;

import java.util.*;

public class FindPairsWithGivenSum {

    class Node {
        int data;
        Node next, prev;

        Node(int x) {
            data = x;
            next = null;
            prev = null;
        }
    }

    class Solution {
        public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                Node head) {
            // ArrayList<Integer> pair = new ArrayList<>();
            if (head.next == null)
                return null;

            ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();

            Node start = head;

            Node end = head;

            while (end.next != null) {
                end = end.next;
            }

            while (end != start && start.prev != end && end.next != start && start.next != null && end.prev != null) {

                if (start.data + end.data == target) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(start.data);
                    pair.add(end.data);
                    pairs.add(pair);
                    start = start.next;
                    end = end.prev;
                } else if (start.data + end.data > target) {
                    end = end.prev;
                } else {
                    start = start.next;
                }

            }

            return pairs;

        }
    }

}
