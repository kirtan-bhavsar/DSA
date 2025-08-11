package List;

import java.util.*;

public class hashSet {

    public static void main(String args[]) {

        Set<Integer> set = new HashSet<>();

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

        set.clear();

        // equals and hashcodes are used to define the comparison metric for the
        // entries.e

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Kirtan", 2));
        studentSet.add(new Student("Shivani", 3));
        studentSet.add(new Student("Kunj", 23));
        studentSet.add(new Student("Nishil", 7));

        System.out.println(studentSet);

    }

}
