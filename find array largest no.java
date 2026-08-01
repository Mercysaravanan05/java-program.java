import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long b=s.nextLong();
      
      long n[]=new long[(int)b];
      for(long i=0;i<b;i++){
          n[(int)i]=s.nextLong();
      }
        long sum=n[0];
        for (long i = 0; i < b; i++) {
      
         if(n[(int)i]>sum){
             sum=n[(int)i];
         }
            
        }
        System.out.print(sum+ " ");
        
    }
}
