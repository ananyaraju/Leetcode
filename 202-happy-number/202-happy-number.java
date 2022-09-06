class Solution {
    public boolean isHappy(int n) {
        if (n==1)
            return true;
        if (n<4)
            return false;
        int sum = 0;
        while (n>0) {
            sum += Math.pow(n%10,2);
            n = n/10;
            if (n==0 && sum>4) { 
                n = sum;
                sum = 0;
            } 
        }
        if (sum == 1)
            return true;
        return false;
    }
}