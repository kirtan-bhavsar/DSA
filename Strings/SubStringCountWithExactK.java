package Strings;

import java.util.*;

public class SubStringCountWithExactK {

    class Solution {
        public int countSubstr(String s, int k) {

            return countFreq(s, k) - countFreq(s, k - 1);

        }

        public int countFreq(String s, int k) {

            int l = 0;
            int r = 0;
            int count = 0;
            Map<Character, Integer> hashMap = new HashMap<>();

            while (r < s.length()) {

                // hashMap.getOrDefault(s.charAt(r),0) += 1;
                hashMap.put(s.charAt(r), hashMap.getOrDefault(s.charAt(r), 0) + 1);

                while (hashMap.size() > k) {

                    hashMap.put(s.charAt(l), hashMap.get(s.charAt(l)) - 1);

                    if (hashMap.get(s.charAt(l)) == 0) {
                        hashMap.remove(s.charAt(l));
                    }

                    l += 1;
                }

                count += r - l + 1;

                r += 1;

            }

            return count;

        }

    }

}
