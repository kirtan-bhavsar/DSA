package List;

import java.util.*;

public class collectionsClass {

    public static void main(String args[]) {

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(88);
        list.add(49);
        list.add(80);
        list.add(93);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));

        Collections.sort(list);

        System.out.println(list);

    }

}
