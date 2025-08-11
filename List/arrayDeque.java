package List;

import java.util.*;

public class arrayDeque {

    public static void main(String args[]) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offer(12);
        dq.offerFirst(235);
        dq.offerLast(96);
        dq.offer(24);
        dq.offerLast(127);

        // will give 235 12 96 24 127

        System.out.println(dq);

        dq.poll();
        dq.pollLast();
        dq.pollFirst();
        dq.pollLast();

        // will give 96

        System.out.println(dq);

        dq.offer(5);
        dq.offerFirst(66);
        dq.offerFirst(78);

        // will give 78 66 96 5

        System.out.println(dq);

        System.out.println(dq.peek());
        System.out.println(dq.peekLast());

        // will give 78 and 5

    }

}
