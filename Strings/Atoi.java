package Strings;

class Solution {
    public int myAtoi(String s) {

        // manages all the leading and lagging spaces
        String ns = s.trim();

        int maxDiv10 = 214748364;
        int maxLastDigit = 7;
        
        int num = 0;

        boolean hasFirstNonZeroCharacterPassed = false;

        boolean isNegative = false;

        boolean hasFirstCharacterPassed = false;

        for(int i = 0 ; i < ns.length() ; i++){

            int charNum = (int)ns.charAt(i);

            if(charNum >= 48 && charNum <= 57){

                if(charNum == 48 && !hasFirstNonZeroCharacterPassed){
                    hasFirstCharacterPassed = true;
                    continue;
                } else {
                    hasFirstNonZeroCharacterPassed = true;
                    hasFirstCharacterPassed = true;

                    if(!isNegative){
                        if(num > maxDiv10 || ( num == maxDiv10 && (charNum-48) >= maxLastDigit ) )
{return Integer.MAX_VALUE;}
                    }
                    if(isNegative){
                        if(num > maxDiv10 || ( num == maxDiv10 && (charNum-48) >= (maxLastDigit+1) ) )
                        {
                            return Integer.MIN_VALUE;}
                    }   
                    num = (num*10)+(charNum-48);
                }

            }

            else {

                // checking for positive values
                if(charNum == 43 && !hasFirstCharacterPassed){
                    isNegative = false;
                    hasFirstCharacterPassed = true;
                    hasFirstNonZeroCharacterPassed = true;
                    continue;
                }

                // checking for negative values
                if(charNum == 45 && !hasFirstCharacterPassed){
                    isNegative = true;
                    hasFirstCharacterPassed = true;
                    hasFirstNonZeroCharacterPassed = true;
                    continue;
                }

                return isNegative ? -1 * num : num;

            }

        }

        return  isNegative ? -1 * num : num;


    }
}
