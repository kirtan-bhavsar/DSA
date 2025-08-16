package Collection;

import java.util.*;

public class arrayDeque {

    public static void main(String args[]) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.offer(10);
        arrayDeque.offer(20);
        arrayDeque.offer(30);
        arrayDeque.offer(40);
        arrayDeque.offerFirst(5);
        arrayDeque.offer(100);

        arrayDeque.poll();
        arrayDeque.pollFirst();
        arrayDeque.pollLast();

        // System.out.println(arrayDeque.peek());
        // System.out.println(arrayDeque.peekLast());

        arrayDeque.push(100);
        arrayDeque.push(101);
        arrayDeque.pop();
        arrayDeque.pop();

        System.out.println(arrayDeque);

    }

}
