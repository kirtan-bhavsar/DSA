package Collection;

import java.util.*;

public class collectionsClass {

    public static void main(String args[]) {

        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(52);
        arrayList.add(1);
        arrayList.add(798);
        arrayList.add(61);

        Collections.sort(arrayList, Comparator.reverseOrder());

        System.out.println(arrayList);
        System.out.println(Collections.min(arrayList));
        System.out.println(Collections.max(arrayList));
        System.out.println(Collections.frequency(arrayList, 798));

    }

}
