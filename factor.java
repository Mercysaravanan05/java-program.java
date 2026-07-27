import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        int sum1 = 0, sum2 = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0)
                sum1 += i;
        }

        for (int i = 1; i < b; i++) {
            if (b % i == 0)
                sum2 += i;
        }

        if (sum1 == b && sum2 == a)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
