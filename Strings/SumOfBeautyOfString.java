package Strings;

public class SumOfBeautyOfString {

    public static void main(String args[]) {

        class Solution {
            public int beautySum(String s) {

                if (s.length() == 1 || s.length() == 2)
                    return 0;

                int count = 0;

                for (int i = 0; i < s.length(); i++) {

                    int freqArray[] = new int[26];
                    int min = 0;
                    int max = 0;

                    for (int j = i; j < s.length(); j++) {

                        freqArray[s.charAt(j) - 'a'] += 1;

                        min = minOfArray(freqArray);
                        max = maxOfArray(freqArray);

                        count += max - min;

                    }

                }

                return count;

            }

            public int minOfArray(int arr[]) {

                int min = Integer.MAX_VALUE;

                for (int num : arr) {
                    if (num > 0 && num < min) {
                        min = num;
                    } else
                        continue;
                }

                return min;

            }

            public int maxOfArray(int arr[]) {

                int max = Integer.MIN_VALUE;

                for (int num : arr) {
                    if (num > 0 && num > max) {
                        max = num;
                    } else
                        continue;
                }

                return max;

            }

        }

    }

}