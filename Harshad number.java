import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        long a=s.nextLong();
       long t=a;
        long d=0;
        while(t!=0){
            long c=t%10;
            d+=c;
            t=t/10;
        }
        if(a%d==0) System.out.print("Yes");
        else System.out.print("No");
    }
}
