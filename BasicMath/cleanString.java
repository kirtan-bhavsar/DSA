package BasicMath;

public class cleanString {

    public static void main(String args[]) {

        int charIndex;

        String str = new String();

        str = "a";

        str = str.toLowerCase();

        System.out.println(str + "String fully coverted to lowercase");

        for (int i = 0; i < str.length(); i++) {

            charIndex = (int) str.charAt(i);

            if (!(charIndex >= 97 && charIndex <= 122)) {
                str = str.substring(0, i) + str.substring(i + 1);
                System.out.println(str);
                i--;
            }

        }

        System.out.println(str);

    }

}