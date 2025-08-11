package List;

import java.util.*;

public class stack {

    public static void main(String args[]) {

        Stack<String> stack = new Stack<>();

        stack.push("kirtan");
        stack.push("shivani");
        stack.push("kunj");
        stack.push("JD");

        stack.pop();
        stack.pop();

        System.out.println(stack.peek() + stack);

        stack.pop();

        System.out.println(stack.peek() + stack);

    }

}
