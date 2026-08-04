import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = n; i >= 1; i--) {

            if (i % 2 == 1) {   
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
            } else {            
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
            }

            System.out.println();
        }
    }
}
