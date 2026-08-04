import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] < smallest) {
                second = smallest;
                smallest = a[i];
            } else if (a[i] < second && a[i] != smallest) {
                second = a[i];
            }
        }

        System.out.println(second);
    }
}
