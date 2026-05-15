package Strings;

class Solution {
    public String frequencySort(String s) {
        
        int charArray[] = new int[62];
        StringBuilder sb = new StringBuilder(s.length());

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        // array format 0-9 will be 0-9, a-z will 10 - 35 and A - Z will be 36 - 61

        for(int i = 0 ; i < s.length() ; i++){

            int charNum = (int)s.charAt(i); 

            if(charNum >= 48 && charNum <= 57){
                charArray[charNum - 48] += 1;
                if(charArray[charNum - 48] > maxFreq) maxFreq = charArray[charNum - 48];
                if(charArray[charNum - 48] < minFreq) minFreq = charArray[charNum - 48];
                continue;
            }
            else if(charNum >= 97 && charNum <= 122){
                charArray[charNum - 87] += 1;
                if(charArray[charNum - 87] > maxFreq) maxFreq = charArray[charNum - 87];
                if(charArray[charNum - 87] < minFreq) minFreq = charArray[charNum - 87];
                continue;
            }
            else if(charNum >= 65 && charNum <= 90){
                charArray[charNum - 29] += 1;
                if(charArray[charNum - 29] > maxFreq) maxFreq = charArray[charNum - 29];
                if(charArray[charNum - 29] < minFreq) minFreq = charArray[charNum - 29];
                continue;
            }

        }

        for(int j = maxFreq ; j >= minFreq ; j--){

            for(int k = 0 ; k <= 9 ; k++){
                if(charArray[k] == j){
                    for(int l = 0 ; l < j ; l++){
                        sb.append(String.valueOf((char)(48+k)));
                    }
                }         
                }
            for(int k = 10 ; k <= 35 ; k++){
                if(charArray[k] == j){
                    for(int l = 0 ; l < j ; l++){
                        sb.append(String.valueOf((char)(87+k)));
                    }
                }
            }
            for(int k = 36 ; k <= 61 ; k++){
                if(charArray[k] == j){
                    for(int l = 0 ; l < j ; l++){
                        sb.append(String.valueOf((char)(29+k)));
                    }
                }
            }

        }

        return sb.toString();

    }
}
