package Stack;

import java.util.Stack;

public class QueueUsingStack {

    class MyQueue {

        Stack<Integer> inStack;
        Stack<Integer> outStack;

        public MyQueue() {

            inStack = new Stack<>();
            outStack = new Stack<>();

        }

        public void push(int x) {

            while (!outStack.isEmpty()) {
                inStack.push(outStack.peek());
                outStack.pop();
            }

            inStack.push(x);

        }

        public int pop() {

            while (!inStack.isEmpty()) {
                outStack.push(inStack.peek());
                inStack.pop();
            }

            int poppedElement = outStack.peek();
            outStack.pop();
            return poppedElement;

        }

        public int peek() {

            while (!inStack.isEmpty()) {
                outStack.push(inStack.peek());
                inStack.pop();
            }

            return outStack.peek();

        }

        public boolean empty() {
            return (inStack.isEmpty() && outStack.isEmpty());
            // return ()
        }
    }

    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */

}
