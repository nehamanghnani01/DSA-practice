package Others;

public class powers_of_2 {
    public static void main(String[] args) {

        // print powers of 2 from 1-100
        // 1,2,4,8,16
        // -------------------- MY SOLUTION ---------------
        int i = 1;
        int num = 0;
        System.out.println("Powers of 2 are = ");
        while (true) {
            num = (int) Math.pow(i, 2);
            if (num > 100) {
                break;
            }
            System.out.print(num + ", ");
            i++;
        }
        System.out.println();
    }
}
