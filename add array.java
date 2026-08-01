import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long b=s.nextLong();
        long sum=0;
      long n[]=new long[(int)b];
      for(long i=0;i<b;i++){
          n[(int)i]=s.nextLong();
      }
        for (long i = 0; i < b; i++) {
            sum=sum+n[(int)i];
            
        }
        System.out.print(sum+ " ");
        
    }
}
