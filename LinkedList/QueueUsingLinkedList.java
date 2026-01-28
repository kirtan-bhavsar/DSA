package LinkedList;

import java.util.*;

public class QueueUsingLinkedList {

public static void main(String args[]){    
    LinkedList<Integer> queue;

    public myQueue() {
        // Initialize your data members
        queue = new LinkedList<>();
    }

    public boolean isEmpty() {
        // check if the queue is empty
        return queue.size() == 0;
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
        queue.offer(x);
    }

    public void dequeue() {
        // Removes the front element of the queue
        queue.poll();
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        if(queue.size() == 0)return -1;
        return queue.peek();
    }

    public int size() {
        // Returns the current size of the queue.
        return queue.size();
    }
}

}

// Node class

// Queue class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}