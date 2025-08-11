package Hashing;

import java.util.*;

public class numericHashing {

    public static void main(String args[]) {

        int arr[] = { 1, 5, 9, 6, 3, 78, 20, 369, 4, 4, 4, 4, 4 };

        Map<Integer, Integer> hashMap = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {

            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);

        }

        System.out.println(hashMap);

    }

}
