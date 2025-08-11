package List;

import java.util.*;

public class priotiryQueue {

    public static void main(String args[]) {

        // Queue<Integer> pq = new PriorityQueue<>();
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(20);
        pq.offer(205);
        pq.offer(1200);
        pq.offer(132);
        pq.offer(100);

        System.out.println(pq);

        pq.poll();

        System.out.println(pq);

    }

}
