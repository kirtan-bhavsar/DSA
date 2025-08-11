package Hashing;

import java.util.*;

public class listTest {

    public static void main(String args[]) {

        // List<Integer> list = new ArrayList<>();

        // list.add(1);
        // list.add(2);
        // list.add(3);

        // System.out.println(list);

        // list.set(0, 11);
        // list.set(1, 22);
        // list.set(2, 33);

        // System.out.println(list);

        List<Integer> list = new ArrayList<>();

        // int hashArray[] = new int[arr.length];

        int arr[] = { 2, 3, 2, 3, 5 };

        for (int i = 0; i < arr.length; i++) {
            list.add(0);
        }

        System.out.println(list);

        for (int i = 0; i < arr.length; i++) {
            int whichElement = arr[i] - 1;
            System.out.println(whichElement + " which element");
            int thisElement = list.get(arr[i] - 1) + 1;
            System.out.println(list.get(i) + " element of hashArray");
            System.out.println(thisElement + " This element");
            list.set(whichElement, thisElement);
            System.out.println(list);
        }

        System.out.println(list);

    }

}
