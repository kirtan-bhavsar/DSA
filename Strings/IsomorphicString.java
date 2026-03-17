package Strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    class Solution {
        public boolean isIsomorphic(String s, String t) {

            Map<Character, Character> hashMap = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {

                if (hashMap.containsKey(s.charAt(i)) || hashMap.containsValue(t.charAt(i))) {

                    if (hashMap.containsValue(t.charAt(i)) && !hashMap.containsKey(s.charAt(i))
                            ||
                            (hashMap.containsKey(s.charAt(i)) && hashMap.get(s.charAt(i)) != t.charAt(i)))
                        return false;
                    else
                        continue;

                }

                hashMap.put(s.charAt(i), t.charAt(i));

            }

            return true;

        }
    }

}
