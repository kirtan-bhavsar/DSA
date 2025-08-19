package Collection;

import java.util.*;
import List.Student;

public class hashcodeAndEquals {

    public static void main(String args[]) {

        Set<Student> set = new HashSet<>();

        set.add(new Student("Kirtan", 2));
        set.add(new Student("Shivani", 4));
        set.add(new Student("Kunj", 5));
        set.add(new Student("Nishil", 6));
        set.add(new Student("Parth", 6));

        Student s1 = new Student("Mayur", 31);
        Student s2 = new Student("Deep", 31);

        System.out.println(s1.equals(s2));

        System.out.println(set);

    }

}
