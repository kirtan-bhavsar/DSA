package Collection;

import java.util.*;

public class arrayList {

    public static void main(String args[]) {

        // List<Integer> list = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(2, 40);
        list.add(30);

        list.set(3, 300);

        // list.remove(2); // will remove the index

        // list.remove(Integer.valueOf(300));

        // list.clear();

        System.out.println(list.get(2));

        System.out.println(list);

    }

}