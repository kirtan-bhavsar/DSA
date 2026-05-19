class Solution {
    public double myPow(double x, int n) {
        
        if(n == 0)return 1.00000;
        if(x == 0.00000)return 0.000000; 

        boolean isNegative = false;
        boolean isOdd = false;
        boolean isMinVal = false;

        if(n == Integer.MIN_VALUE){
            isMinVal = true;
        }   

        if(n < 0 && !isMinVal) {
            n = n * (-1);
            isNegative = true;
        }

        if(n % 2 != 0){
            isOdd = true;
        }

        if(isMinVal){
            n = n + 1;
            n = n * (-1);
            while(n > 0){
            double temp = myPow(x,(n-1)/2); 
            return 1/(x*x*temp*temp); 
            }
        }

        while(n > 0){
            double temp = isOdd ? (myPow(x,(n-1)/2)) : (myPow(x,(n)/2)); 
            return isNegative ? 
            ( isOdd ? 1/(x*temp*temp) : 1/(temp*temp) ) : 
            (isOdd ? x*temp*temp : temp*temp );
        }

        return 0.00000;
    }
}
