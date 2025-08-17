package Recursion;

public class checkIfPalindrome {

    public static void main(String args[]) {

        String str = "shivaniinavihs";

        String smallString = str.toLowerCase();

        int stringLength = smallString.length();

        int firstPointer = 0;

        int lastPointer = stringLength - 1;

        char firstChar;
        char secondChar;

        boolean bool = true;

        for (int i = firstPointer; i < lastPointer; i++) {

            if ((int) smallString.charAt(i) >= 97 && (int) smallString.charAt(i) <= 122) {
                firstChar = smallString.charAt(i);
                firstPointer++;
                System.out.println(firstChar + " firstChar");
            } else {
                firstPointer++;
                continue;
            }

            for (int j = lastPointer; j > firstPointer; j--) {
                if ((int) smallString.charAt(j) >= 97 && (int) smallString.charAt(j) <= 122) {
                    secondChar = smallString.charAt(j);
                    System.out.println(secondChar + " secondChar");
                    lastPointer--;
                } else {
                    lastPointer--;
                    continue;
                }

                if (firstChar != secondChar) {
                    // System.out.println("firstChar and secondChar condition check called when " +
                    // firstChar
                    // + " is firstChar and " + secondChar + " is secondChar");
                    bool = false;
                    System.out.println(bool + " in false condition");
                    break;
                } else {
                    break;
                }

            }

            if (!bool) {
                System.out.println(bool + " in false condition");
                break;
            }

        }

        if (bool) {
            System.out.println(bool + " is a palindrome");
        }

    }

}