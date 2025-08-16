package Collection;

import java.util.*;

public class hashMap {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new LinkedHashMap<>();

        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);

        // hashMap.remove("Five");

        for (Map.Entry<String, Integer> e : hashMap.entrySet()) {

            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (int num : hashMap.values()) {
            System.out.println(num);
        }

        for (String str : hashMap.keySet()) {
            System.out.println(str);
        }

        hashMap.put("Five", 55);
        // hashMap.putIfAbsent("Five", 55);

        hashMap.remove("Four");

        hashMap.remove("Three");

        System.out.println(hashMap.containsKey("Two"));
        System.out.println(hashMap.containsValue(45));

        System.out.println(hashMap);

    }

}
