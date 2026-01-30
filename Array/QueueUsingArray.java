package Array;

class myQueue {

    int queue[];
    int front;
    int rear;

    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        queue = new int[n];
        front = 0;
        rear = 0;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        // System.out.println("front is : " + front + "rear is : " + rear);
        return front == rear;
    }

    public boolean isFull() {
        // Check if queue is full
        // System.out.println("front is : " + front + "rear is : " + rear);
        return (front == 0 && rear == queue.length);
    }

    public void enqueue(int x) {
        // Enqueue
        // System.out.println("front is : " + front + "rear is : " + rear);
        if (front == 0 && rear == queue.length)
            return;
        if (rear == queue.length)
            rear = 0;
        queue[rear] = x;
        rear += 1;
    }

    public void dequeue() {
        // Dequeue
        // System.out.println("front is : " + front + "rear is : " + rear);
        if (front == rear)
            return;
        if (front == queue.length - 1) {
            if (rear == queue.length)
                rear = 0;
            front = 0;
            return;
        }
        front += 1;
    }

    public int getFront() {
        // Get front element
        // System.out.println("front is : " + front + "rear is : " + rear);
        if (front == rear)
            return -1;
        return queue[front];
    }

    public int getRear() {
        // Get last element
        // System.out.println("front is : " + front + "rear is : " + rear);
        if (front == rear)
            return -1;
        if (rear == 0)
            return queue[queue.length - 1];
        return queue[rear - 1];
    }
}
