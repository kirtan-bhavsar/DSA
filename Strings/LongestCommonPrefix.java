package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {

    class Solution {
        public String longestCommonPrefix(String[] strs) {

            Arrays.sort(strs);

            String string1 = strs[0];
            String string2 = strs[strs.length - 1];

            int length1 = string1.length();
            int length2 = string2.length();

            int shortLength = Math.min(length1, length2);

            StringBuilder sbr = new StringBuilder();

            for (int i = 0; i < shortLength; i++) {

                if (string1.charAt(i) == string2.charAt(i))
                    sbr.append(string1.charAt(i));

                else
                    return sbr.toString();

            }

            return sbr.toString();

        }
    }

}
