package Strings;

public class RemoveOutermostParantheses {

    class Solution {
        public String removeOuterParentheses(String s) {

            StringBuilder sbr = new StringBuilder();
            int start = 0;
            int counter = 0;

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == '(')
                    counter += 1;
                else
                    counter -= 1;

                if (counter == 0) {
                    sbr.append(s.substring(start + 1, i));
                    start = i + 1;
                }

            }

            return sbr.toString();

        }
    }

}
