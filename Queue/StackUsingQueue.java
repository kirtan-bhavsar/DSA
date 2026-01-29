package Queue;

import java.util.*;

public class StackUsingQueue {

    class MyStack {

        ArrayDeque<Integer> stack;

        public MyStack() {

            stack = new ArrayDeque<>();

        }

        public void push(int x) {

            stack.offer(x);

        }

        public int pop() {
            int poppedElement = stack.peekLast();
            stack.pollLast();
            return poppedElement;
        }

        public int top() {
            return stack.peekLast();
        }

        public boolean empty() {
            return stack.size() == 0;
        }
    }

    // Declaration is to be kept global, but initialization has to be kept local, so
    // that the variable can be accessed

    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */

}
