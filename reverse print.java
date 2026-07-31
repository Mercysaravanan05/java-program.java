import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        long a=s.nextLong();
        long c=0;
        while(a!=0){
            long b=a%10;
            c=c*10+b;
          a=a/10;  
        }
        System.out.println(c);
    }
}
