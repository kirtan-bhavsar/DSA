package List;

import java.util.*;

public class hashMap {

    public static void main(String args[]) {

        Map<String, String> name = new HashMap<>();

        name.put("Kirtan", "Bhavsar");
        name.put("Shivani", "Kadam");
        name.put("Kunj", "Patel");
        name.put("Nishil", "Parmar");

        System.out.println(name);

        name.put("Shivani", "Bhavsar");

        System.out.println(name);

        System.out.println(name.containsKey("Kirtan"));
        System.out.println(name.containsValue("Bhavsar"));

        name.putIfAbsent("Jaydeep", "Parmar");

        System.out.println(name);

        for (Map.Entry<String, String> e : name.entrySet()) {

            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }

        for (String firstName : name.keySet()) {
            System.out.println(firstName);
        }

        for (String lastName : name.values()) {
            System.out.println(lastName);
        }

        System.out.println(name.isEmpty());

        name.clear();

        System.out.println(name);

    }

}
