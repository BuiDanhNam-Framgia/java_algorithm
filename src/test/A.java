

import java.util.Scanner;

/**
 *
 * @author buidanhnam
 */
public class A {

    private static long USCLN(long a, long b) {
        if (b == 0) {
            return a;
        }
        return USCLN(b, a % b);
    }

    private static long BSCNN(long a, long b) {
        return (a * b) / USCLN(a, b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(USCLN(a, b) + " " + BSCNN(a, b));
        }
    }
}
