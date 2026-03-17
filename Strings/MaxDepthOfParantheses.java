package Strings;

public class MaxDepthOfParantheses {

    class Solution {
        public int maxDepth(String s) {

            int maxDepth = Integer.MIN_VALUE;
            int currentDepth = 0;

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == '(') {
                    currentDepth += 1;
                    maxDepth = Math.max(maxDepth, currentDepth);
                } else if (s.charAt(i) == ')')
                    currentDepth -= 1;
                else
                    continue;

            }

            return Math.max(0, maxDepth);

        }
    }

}
