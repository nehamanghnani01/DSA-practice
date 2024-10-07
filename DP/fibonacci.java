package DP;

public class fibonacci {

    public static void main(String[] args) {

        int n = 6;
        int f = get_f(n);
        System.out.println("fib = " + f);
    }

    public static int get_f(int n) {
        int[] dp = new int[n];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];

        }
        return dp[n - 1];
    }
}
