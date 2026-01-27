package Queue;

import java.util.*;

public class QueueLearning {

    public static void main(String args[]) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        queue.poll();
        queue.poll();

        System.out.println(queue.peek());

    }

}
