class Solution {

    private int[] memo;
    public int climbStairs(int n) {
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return calcWays(n);
    }

    private int calcWays(int n) {
        if ( n==0 || n == 1 ) {
            return 1;
        }
        if(memo[n] == -1) {
            memo[n] = calcWays(n - 1) + calcWays(n - 2);
        }
        return memo[n];
    }

}


