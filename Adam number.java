import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long n = s.nextLong();
        long a = n * n;
        long t = n;
        long rev = 0;

        while (t > 0) {
            long r=t%10;
            rev = rev * 10 + r ;
            t = t / 10;
        }

        
        long v = rev * rev;
        long an = v;
        long revs = 0;

        while (an > 0) {
            long rem=an%10;
            revs = revs * 10 + rem;
            an = an / 10;
        }

        if (revs == a)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
