import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        long a=s.nextLong();
        int b=s.nextInt();
        long d=0;
        while(a!=0){
            long c=a%10;
            if(c==b){
                d++;
            }
            a=a/10;
        }
        System.out.print(d);
    }
}
