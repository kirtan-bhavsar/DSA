package Stack;

class Solution {
    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();

        String parts[] = path.split("/");

        for (String part : parts) {

            if (part.equals("") || part.equals(".")) {
                continue;
            }

            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }

        }

        if (stack.isEmpty())
            return "/";

        String result = "";

        while (!(stack.isEmpty())) {
            result = "/" + stack.pop() + result;
            System.out.println(result);
        }

        System.out.println("final result " + result);

        return result;
    }
}
