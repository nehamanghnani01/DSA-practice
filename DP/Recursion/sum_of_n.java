package DP.Recursion;

public class sum_of_n {
    public static void main(String[] args) {
        int n = 3;

        int sum = sumofn(n);
        System.out.println("Sum of n= " + sum);
        System.out.println("fact = " + fact(n));
    }

    public static int sumofn(int n) {

        if (n <= 1) {
            return n;
        }
        return n + sumofn(n - 1);

    }

    public static int fact(int n) {
        if (n <= 1) {
            return n;
        }
        return n * fact(n - 1);
    }
}
