package Stack;

import java.util.*;

public class StackLearning {

    public static void main(String args[]) {

        Stack<String> stack = new Stack<>();

        stack.push("Aman");
        stack.push("Baman");
        stack.push("Chaman");
        stack.push("Deepu");
        stack.push("Emmanuel");
        stack.push("Farah");
        stack.push("Ganesh");
        stack.push("Haresh");

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.search("Baman"));

    }

}
