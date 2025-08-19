package Collection;

import java.util.*;
import List.Student;

public class hashcodeAndEquals {

    public static void main(String args[]) {

        List<Student> list = new ArrayList<>();

        // List<Integer> arrayList = new ArrayList<>();

        // arrayList.add(111);
        // arrayList.add(2);
        // arrayList.add(33);

        // Collections.sort(arrayList);

        list.add(new Student("Kirtan", 2, 87));
        list.add(new Student("Shivani", 4, 93));
        list.add(new Student("Kunj", 5, 88));
        list.add(new Student("Nishil", 6, 65));
        list.add(new Student("Parth", 6, 30));
        list.add(new Student("Shyam", 3, 75));

        Student s1 = new Student("Mayur", 33, 65);
        Student s2 = new Student("Deep", 32, 69);

        System.out.println(s1.compareTo(s2));

        System.out.println(list);

        Collections.sort(list, (o1, o2) -> o2.marks - o1.marks);

        System.out.println(list);

    }

}
