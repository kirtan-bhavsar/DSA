package Collection;

import java.util.*;

public class priorityQueue {

    public static void main(String args[]) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(10);
        priorityQueue.offer(20);
        priorityQueue.offer(30);
        priorityQueue.offer(40);
        priorityQueue.offer(4);
        priorityQueue.offer(1);

        // priorityQueue.poll();
        // priorityQueue will only keep the smallest first, post it, no order will be
        // followed

        System.out.println(priorityQueue);

    }

}
