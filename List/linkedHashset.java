
package List;

import java.util.*;

public class linkedHashset {

    public static void main(String args[]) {

        Set<Integer> set = new LinkedHashSet<>();

        set.add(1);
        set.add(85);
        set.add(73);
        set.add(5);
        set.add(48);
        set.add(632);

        System.out.println(set);

        set.remove(73);

        System.out.println(set);

        System.out.println(set.contains(5));
        System.out.println(set.contains(55));

        System.out.println(set.size());

        set.clear();

        System.out.println(set);

    }

}
