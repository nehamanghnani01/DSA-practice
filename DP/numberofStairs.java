package DP;

public class numberofStairs {

    public static void main(String[] args) {
        int nstairs = 4;
        int numberofways = get_ways(nstairs);
        System.out.println("Number of ways = " + numberofways);
    }

    public static int get_ways(int stairs) {
        int[] dp = new int[stairs + 1];

        if (stairs == 0) {
            return 0;
        }
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= stairs; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[stairs];
    }
}