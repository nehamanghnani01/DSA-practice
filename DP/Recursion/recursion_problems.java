package DP.Recursion;

import java.util.*;

public class recursion_problems {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 1, 2 };
        // {2,1,4,3,2} - swapped array
        int left = 0, right = arr.length - 1;
        reverse_array(arr, left, right);
        System.out.println("reversed array = ");
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("check if palindrome " + palindrome("MAM", 0));

        int[] subARR = { 3, 1, 2 };
        System.out.println("print subsequences = ");
        printSubsequences(subARR, new ArrayList<>(), subARR.length, 0);

        System.out.println();
        System.out.println("print subsequences equal to k=3  = ");
        printSequencesEqualK(subARR, new ArrayList<>(), subARR.length, 0, 3, 0);
        System.out.println();

    }

    // using recursion - same can be done without recursion, using 2 pointer
    // solution
    public static void reverse_array(int[] arr, int left, int right) {
        if (left >= right) { // instead of left, right you can keep one variable and check only till half of
                             // the arr for swapping
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverse_array(arr, left + 1, right - 1);

    }

    public static boolean palindrome(String s, int i) {

        if (i > s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt((s.length()) - i - 1)) {
            return false;
        }
        return palindrome(s, i + 1);

    }

    public static void printSubsequences(int[] arr, List<Integer> ss, int n, int index) {
        if (index >= n) {
            if (ss.size() == 0) {
                System.out.println("{}");
            } else {
                for (int i : ss) {
                    System.out.print(i + ",");

                }
            }
            System.out.println();
            return;
        }

        ss.add(arr[index]);
        printSubsequences(arr, ss, n, index + 1);
        ss.remove(ss.size() - 1);
        printSubsequences(arr, ss, n, index + 1);
    }

    public static void printSequencesEqualK(int[] arr, List<Integer> ss, int n, int runningSum, int k, int index) {

        if (index >= n) {
            if (runningSum == k) {
                for (int i : ss) {
                    System.out.print(i + ",");
                }
                System.out.println();
            }

            // runningSum = 0;
            return;
        }

        ss.add(arr[index]);
        runningSum = runningSum + arr[index];
        printSequencesEqualK(arr, ss, n, runningSum, k, index + 1);
        ss.remove(ss.size() - 1);
        runningSum = runningSum - arr[index];
        printSequencesEqualK(arr, ss, n, runningSum, k, index + 1);

    }

}
