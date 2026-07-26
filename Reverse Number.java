import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int rev = 0;

        while (a > 0) {
            int b = a % 10;
            rev = rev * 10 + b;
            a = a / 10;
        }

        System.out.println(rev);
    }
}
