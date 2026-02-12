package LearnLinkedList;

import java.util.*;

public class BruteForce_CycleNodeInLinkedList {

    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null)
            return null;

        Set<ListNode> set = new HashSet<>();

        ListNode temp = head;

        while (temp.next != null) {
            if (set.contains(temp)) {
                return temp;
            }
            set.add(temp);
            temp = temp.next;
        }

        return null;

    }
}
