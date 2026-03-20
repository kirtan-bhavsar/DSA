package Strings;

import java.util.*;

public class RomanToNumber {

    class Solution {
        public int romanToInt(String s) {

            Map<Character, Integer> charMap = new HashMap<>();
            Map<String, Integer> strMap = new HashMap<>();

            charMap.put('M', 1000);
            charMap.put('D', 500);
            charMap.put('C', 100);
            charMap.put('L', 50);
            charMap.put('X', 10);
            charMap.put('V', 5);
            charMap.put('I', 1);

            strMap.put("IV", 4);
            strMap.put("IX", 9);
            strMap.put("XL", 40);
            strMap.put("XC", 90);
            strMap.put("CD", 400);
            strMap.put("CM", 900);

            if (s.length() == 1) {
                return charMap.get(s.charAt(0));
            }

            int l = 0;
            int r = 1;
            int count = 0;

            while (l < s.length()) {

                if (l < s.length() - 1 && strMap.containsKey(s.substring(l, r + 1))) {
                    System.out.println("string matches : " + s.substring(l, r + 1));
                    count += strMap.get(s.substring(l, r + 1));
                    System.out.println("count is : " + count);
                    r += 2;
                    l += 2;
                    continue;
                }

                count += charMap.get(s.charAt(l));
                System.out.println("count is : " + count);

                r += 1;
                l += 1;
            }

            return count;

        }
    }

}
