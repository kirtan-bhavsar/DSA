package Hashing;

import java.util.*;

public class characterHashing {

    public static void main(String args[]) {

        String str = "mynameiskirtanblahblahqqqjjjqqqjjj";

        Map<Character, Integer> hashMap = new HashMap<>();

        int str_length = str.length();

        // System.out.println(str_length);

        for (int i = 0; i < str_length; i++) {

            hashMap.put(str.charAt(i), hashMap.getOrDefault(str.charAt(i), 0) + 1);

        }

        System.out.println(hashMap);

    }

}