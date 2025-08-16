package Collection;

import java.util.*;

public class hashSet {

    public static void main(String args[]) {

        Set<Integer> hashSet = new HashSet<>();
        // Set<Integer> hashSet = new LinkedHashSet<>();
        // Set<Integer> hashSet = new TreeSet<>();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(40);

        hashSet.remove(20);
        hashSet.add(20);
        hashSet.add(30);
        System.out.println(hashSet.contains(40));

        System.out.println(hashSet);

    }

}
