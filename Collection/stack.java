package Collection;

import java.util.*;

public class stack {

    public static void main(String args[]) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();
        // stack.clear();

        System.out.println(stack.isEmpty());
        System.out.println(stack.get(1));
        stack.set(1, 200);
        System.out.println(stack.peek());
        System.out.println(stack);

    }

}
