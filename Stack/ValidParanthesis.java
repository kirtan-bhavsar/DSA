package Stack;

import java.util.*;

class Solution {
    public boolean isValid(String s) {

        HashMap<Character, Character> validBracketPairs = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        validBracketPairs.put(')', '(');
        validBracketPairs.put(']', '[');
        validBracketPairs.put('}', '{');

        for (int i = 0; i < s.length(); i++) {

            if (!stack.isEmpty() && validBracketPairs.get(s.charAt(i)) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }

        }

        return stack.isEmpty();

    }
}