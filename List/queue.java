package List;

import java.util.*;

public class queue {

    public static void main(String args[]) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue);

        queue.poll();

        System.out.println(queue.peek());

        System.out.println(queue);

    }

}
