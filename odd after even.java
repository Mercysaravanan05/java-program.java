import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String n = s.next();
        String o = "", e = "";

        for (int i = 0; i < n.length(); i++) {
            int d = n.charAt(i) - '0';

            if (d % 2 != 0)
                o += d;
            else
                e += d;
        }

        System.out.print(o + e);
    }
}
