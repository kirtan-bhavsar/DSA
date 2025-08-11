package List;

import java.util.*;

public class arrayList {

    public static void main(String args[]) {

        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        arrayList.add(1, 20);

        System.out.println(arrayList);

        arrayList.set(2, 30);

        System.out.println(arrayList);

        arrayList.remove(4);

        System.out.println(arrayList.get(3) + " hello world !");

        System.out.println(arrayList);

        Iterator<Integer> it = arrayList.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(arrayList);

    }

}
