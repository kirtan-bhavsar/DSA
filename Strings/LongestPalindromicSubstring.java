package Strings;

public class LongestPalindromicSubstring {

    public static void main(String args[]) {

        class Solution {
            public String longestPalindrome(String s) {

                if (s.length() == 1)
                    return s;

                // convert string into hashArray

                char hashArray[] = new char[(2 * s.length()) + 1];

                for (int i = 0; i < s.length(); i++) {

                    hashArray[2 * i] = '#';
                    hashArray[(2 * i) + 1] = s.charAt(i);
                }

                hashArray[hashArray.length - 1] = '#';

                // make the corresponding centerArray

                int centerArray[] = new int[hashArray.length];

                centerArray[0] = 0;
                centerArray[1] = 1;
                // // centerArray[2] = 0;

                // initializing important variables

                int l = 0;
                int r = 2;
                int longestPalindrome = 1;
                // int currentCenter = 1;
                int longestPalindromicCenter = 1;

                for (int i = 2; i < centerArray.length; i++) {

                    int currentPalindrome = 0;
                    int currentLeft = i - 1;
                    int currentRight = i + 1;

                    // Initialize the possible palindrome lenght for the ith elemnent based on the
                    // centerArray

                    // currentLeft = i;
                    // currentRight = i;

                    if (i <= r) {
                        centerArray[i] = Math.min(centerArray[(2 * longestPalindromicCenter) - i], r - i);
                        currentPalindrome = centerArray[i];
                        currentLeft = i - currentPalindrome - 1;
                        currentRight = i + currentPalindrome + 1;
                    }

                    // if(currentPalindrome > longestPalindrome){
                    // longestPalindrome = currentPalindrome;
                    // longestPalindromicCenter = i;
                    // }

                    // expand beyond the initialized centerArray

                    while (currentLeft >= 0 && currentRight <= centerArray.length - 1) {

                        // currentLeft -= 1;
                        // currentRight += 1;

                        if (hashArray[currentLeft] == hashArray[currentRight]) {
                            // System.out.println("both are equal called for i as : " + i );
                            currentPalindrome += 1;
                            currentLeft -= 1;
                            currentRight += 1;
                            if ((currentLeft == 0 || currentRight == hashArray.length - 1)
                                    && hashArray[currentLeft] == hashArray[currentRight]) {
                                currentPalindrome += 1;
                                if (currentPalindrome > longestPalindrome) {
                                    longestPalindrome = currentPalindrome;
                                    longestPalindromicCenter = i;
                                    l = currentLeft;
                                    r = currentRight;
                                    break;
                                }
                            }
                            continue;
                        } else {
                            if (currentPalindrome > longestPalindrome) {
                                longestPalindrome = currentPalindrome;
                                longestPalindromicCenter = i;
                                l = currentLeft;
                                r = currentRight;
                            }
                            break;
                        }

                    }

                    // if(currentPalindrome > longestPalindrome){
                    // longestPalindrome = currentPalindrome;
                    // longestPalindromicCenter = i;
                    // l = currentLeft;
                    // r = currentRight;
                    // }

                }

                // manage the l, r, lp, lpc, c

                // based on the lpc and lp return the necessary string

                int leftOfString = (longestPalindromicCenter - longestPalindrome) / 2;
                int rightOfString = (longestPalindromicCenter + longestPalindrome) / 2;

                // System.out.println("longestPalindromicCenter : " + longestPalindromicCenter);
                // System.out.println("longestPalindrome : " + longestPalindrome);

                return s.substring(leftOfString, rightOfString);

                // return "abc";

            }
        }

    }

}