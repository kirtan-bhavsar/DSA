package Array;

class myStack {

    int stack[];
    int current;

    public myStack(int n) {
        // Define Data Structures
        stack = new int[n];
        current = 0;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        // System.out.println("isEmpty Called");
        return current == 0;
    }

    public boolean isFull() {
        // check if the stack is full
        // System.out.println("isFull Called");
        return current == stack.length;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if (current == stack.length)
            return;
        // System.out.println("push Called");
        stack[current] = x;
        current += 1;
    }

    public void pop() {
        // Removes an element from the top of the stack
        if (current == 0)
            return;
        // System.out.println("pop Called");
        current -= 1;
    }

    public int peek() {
        // Returns the top element of the stack
        // current-1 >= 0 ? return arr[current-1] : -1;
        // System.out.println("peek Called");
        if (current - 1 >= 0) {
            return stack[current - 1];
        } else {
            return -1;
        }
    }
}
