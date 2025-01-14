package DP.Recursion;

public class Practice {

    public static void main(String[] args) {

        System.out.println(isPalindrome("MASM", 0));

        int[] arr = new int[] { 2, 3, 4, 5, 6 };
        reverseArray(arr, 0, arr.length - 1);
        System.out.println("reversed array" + arr);
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("factorial of 6 is = " + fact(6));

        System.out.println("sum of 6 is = " + sumofn(6));

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

    public static void reverseArray(int[] arr, int left, int right) {
        if (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            reverseArray(arr, left + 1, right - 1);
        }
    }

    public static boolean isPalindrome(String s, int i) {
        if (i < s.length() / 2) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }

        } else {
            return true;
        }
        return isPalindrome(s, i + 1);

    }

}
