import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long n = s.nextLong();
        long t = n;
        long su = 0;
        while (t != 0) {
            long d = t % 10;
            long f = 1;
            for (int i = 1; i <= d; i++) {
                f *= i;
            }

            su+= f;
            t /= 10;
        }

        if (su == n)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
