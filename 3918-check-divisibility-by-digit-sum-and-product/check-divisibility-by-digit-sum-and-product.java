class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;
        while(n>0) {
            int d = n % 10;
            sum += d;
            product *= d;
            n = n/10;
        }
        return temp % (sum + product) == 0;
    }
}