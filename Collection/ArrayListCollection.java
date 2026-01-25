package Collection;

import java.util.*;

public class ArrayListCollection {

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(6, 70);

        ArrayList<Integer> newList = new ArrayList<>();

        newList.add(1000);
        newList.add(2000);
        newList.add(3000);

        list.addAll(newList);

        System.out.println(list);

        System.out.println(list.get(8));

        list.remove(Integer.valueOf(50));

        System.out.println(list);

        list.remove(5);

        System.out.println(list);

        // list.clear();

        // System.out.println(list);

        list.set(5, 555);

        System.out.println(list);

        System.out.println(list.contains(555));
        System.out.println(list.contains(55));

        System.out.println(list.size());

        // Normal for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(" Normal for loop " + list.get(i));
        }

        // For each loop
        for (Integer element : list) {
            System.out.println(" For each loop " + element);
        }

        // For Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) { // while loop to check till the condition gets false
            System.out.println(" For Iterator " + it.next());
        }

    }
}