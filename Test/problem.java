
package Test;

import java.util.*;

public class problem {

    public static void main(String args[]) {

        String str = new String();
        str = "Elephant";

        int count = str.length();

        Map<Character, Integer> hashMap = new HashMap<>();

        // System.out.println(count);

        for (int i = 0; i < count; i++) {
            // if(hashMap.containsKey(str.charAt(i))){
            // hashMap.put(str.charAt(i),hashMap.get(i)++)
            // }
            System.out.println(hashMap.get(i));
        }

    }

}
