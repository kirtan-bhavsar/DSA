package List;

import java.util.*;

public class sortingCustomClass {

    public static void main(String args[]) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Kirtan", 12));
        list.add(new Student("Shivani", 35));
        list.add(new Student("Kunj", 5));

        System.out.println(list);

        // Collections.sort(list, new Comparator<Student>() {
        // @Override
        // public int compare(Student o1, Student o2) {

        // return o1.name.compareTo(o2.name);

        // }
        // });

        Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));
        // implements the same using lambda expression (shorthand expression)

        System.out.println(list);

    }

}
