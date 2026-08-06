import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        long a=s.nextLong();
       long t=a;
        long d=0,c=0;
        while(t!=0){
           c++;
            t=t/10;
        }
    t=a;
        while(t!=0){
            long v=t%10;
           d+=(long)Math.pow(v,c);
            t=t/10;
            
        }
        if(d==a) System.out.print("Yes");
        else System.out.print("No");
    }
}
