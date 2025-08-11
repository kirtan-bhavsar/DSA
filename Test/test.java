package Test;

import java.util.*;

public class test {
    public static void main(String args[]) {

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        int arr[] = { 2, 0, 2, 1, 1, 0, 0, 1, 1 };

        for (int i = 0; i < arr.length; i++) {
            if (treeMap.containsKey(arr[i])) {
                int count = treeMap.get(arr[i]);
                treeMap.put(arr[i], ++count);
            } else {
                treeMap.put(arr[i], 1);
            }
        }

        System.out.println(treeMap);

        for (int i = 0; i < treeMap.get(0); i++) {
            arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
        for (int i = treeMap.get(0); i < treeMap.get(0) + treeMap.get(1); i++) {
            arr[i] = 1;
            System.out.print(arr[i] + " ");
        }
        for (int i = treeMap.get(0) + treeMap.get(1); i < treeMap.get(0) + treeMap.get(1) + treeMap.get(2); i++) {
            arr[i] = 2;
            System.out.print(arr[i] + " ");
        }

    }
}

/*
 * ---Integers---
 * int - 4bytes
 * long - 8bytes
 * short - 2bytes
 * byte - 1byte
 * ---Float---
 * float - 4bytes
 * double - 8bytes
 * ---character---
 * char - 2bytes
 * ---boolen---
 * boolean
 * 
 */