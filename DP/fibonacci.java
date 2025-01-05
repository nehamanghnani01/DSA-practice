package DP;

public class fibonacci {

    public static void main(String[] args) {

        int n = 6;
        int f = get_f(n);
        int[] dp = new int[n + 1];
        int f_topdown = get_fib_top_down(n, dp);

        System.out.println("fib = " + f);
        System.out.println("fib answer in top down approach = " + f_topdown);
        System.out.println("fib answer with optimized space = " + fib_optimized(n));
    }

    // Bottom up approach - have base cases and then build up the solution
    public static int get_f(int n) {
        int[] dp = new int[n];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];

        }
        return dp[n - 1];
    }

    // Top down approach - start from the bigger problem, and find store the
    // solution for the smaller problems

    public static int get_fib_top_down(int n, int[] dp) {

        if (n <= 1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        } else {
            dp[n] = get_fib_top_down(n - 1, dp) + get_fib_top_down(n - 2, dp);
        }

        return dp[n];
    }

    // optimizing space complexity

    public static int fib_optimized(int n) {
        int prev, prev2prev, curr;

        prev2prev = 0;
        prev = 1;
        if (n == 0) {
            return prev2prev;
        }
        if (n == 1) {
            return prev;
        }
        curr = prev;
        int i = 0;

        while (i < n - 1) {
            curr = prev + prev2prev;
            prev2prev = prev;
            prev = curr;
            i++;
        }

        return curr;
    }
}
